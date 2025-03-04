package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.metamodel.Action;
import main.metamodel.Drone;
import main.metamodel.EnergyModel;
import main.metamodel.Mission;
import main.metamodel.MissionEvent;
import main.metamodel.Phase;
import main.metamodel.RegulatoryConstraint;
import main.metamodel.SafetyConstraint;
import main.metamodel.SubPhase;

public class MedicalDeliveryTest {
        private Mission mission;

        @BeforeEach
        public void init() {
                mission = new Mission("M001", "Medical Delivery")
                                .setStartLocation("Hospital A")
                                .setEndLocation("Clinic B")
                                .setPriority(2)
                                .setEstimatedTime(1.5f);

                // Setting up the Drone
                Drone drone = new Drone("MedFly-X1", 80, 60, 5, "Medical Transport");
                EnergyModel energyModel = new EnergyModel(5, 90, 2);
                drone.setEnergyModel(energyModel);
                mission.addDrone(drone);

                // Adding Constraints
                SafetyConstraint safetyConstraint = new SafetyConstraint(25, 12);
                RegulatoryConstraint regulatoryConstraint = new RegulatoryConstraint(true, 150);
                mission.addConstraint(safetyConstraint);
                mission.addConstraint(regulatoryConstraint);

                // Defining Phases
                Phase takeoff = new Phase("Takeoff").setEnergyUsage(4);
                SubPhase initialLift = new SubPhase("InitialLift", 20)
                                .addAction(new Action("StartMotors", "", 1.5f))
                                .addAction(new Action("AdjustMotorSpeed", "Sensor Data", 1.5f));
                takeoff.addSubPhase(initialLift);
                SubPhase rise = new SubPhase("Rise", 20)
                                .addAction(new Action("AdjustAltitude", "Sensor Data", 1f));
                takeoff.addSubPhase(rise);
                mission.addPhase(takeoff);

                Phase cruise = new Phase("Cruise").setEnergyUsage(6);
                SubPhase maintainSpeed = new SubPhase("MaintainSpeed", 60)
                                .addAction(new Action("AdjustAltitude", "Sensor Data", 2f));
                cruise.addSubPhase(maintainSpeed);
                mission.addPhase(cruise);

                Phase landing = new Phase("Landing").setEnergyUsage(3);
                SubPhase finalApproach = new SubPhase("FinalApproach", 20)
                                .addAction(new Action("DestinationLock", "Sensor Data", 1f));
                landing.addSubPhase(finalApproach);
                SubPhase landingAndShutdown = new SubPhase("LandingAndShutdown", 20)
                                .addAction(new Action("AdjustMotorSpeed", "Sensor Data", 1f))
                                .addAction(new Action("DeployLandingGear", "Actuator", 1f));
                landing.addSubPhase(landingAndShutdown);
                mission.addPhase(landing);

                // Adding Events
                MissionEvent batteryLowAlert = new MissionEvent("BatteryLowAlert", 3, "Return to Base");
                MissionEvent restrictedAirspaceWarning = new MissionEvent("RestrictedAirspaceWarning", 2,
                                "Adjust Flight Path");
                mission.addEvent(batteryLowAlert);
                mission.addEvent(restrictedAirspaceWarning);
        }

        @Test
        public void testMissionDetails() {
                assertEquals("M001", mission.getMissionID());
                assertEquals("Medical Delivery", mission.getMissionType());
                assertEquals("Hospital A", mission.getStartLocation());
                assertEquals("Clinic B", mission.getEndLocation());
                assertEquals(2, mission.getPriority());
                assertEquals(1.5f, mission.getEstimatedTime());
                assertTrue(mission.getDrones().size() > 0);
                assertTrue(mission.getPhases().size() > 0);
                assertTrue(mission.getConstraints().size() > 0);
                assertTrue(mission.getEvents().size() > 0);
        }
}
