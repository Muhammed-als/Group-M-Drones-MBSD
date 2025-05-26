package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.metamodel.Action;
import main.metamodel.ActionElement;
import main.metamodel.Constraint;
import main.metamodel.Drone;
import main.metamodel.DroneGroup;
import main.metamodel.Mission;
import main.metamodel.RegulatoryConstraint;
import main.metamodel.PermissionConstraint;

public class MedicalDeliveryTest {
    private Mission mission;

    @BeforeEach
    public void init() {
        // Create drones for the medical delivery
        Drone medDrone = new Drone("MedFly-X1", "192.168.1.100", "SN123456");
        List<Drone> drones = new ArrayList<>(Arrays.asList(medDrone));
        
        // Create drone group
        DroneGroup medicalDroneGroup = new DroneGroup("Medical Fleet", drones);

        // Create actions for the mission
        List<ActionElement> actions = new ArrayList<>();
        actions.add(new ActionElement(new Action("StartMotors", "Initialize drone motors", "SYSTEM")));
        actions.add(new ActionElement(new Action("AdjustAltitude", "Change drone height", "NAVIGATION")));
        actions.add(new ActionElement(new Action("NavigateToDestination", "Move to target location", "NAVIGATION")));
        actions.add(new ActionElement(new Action("Land", "Land the drone safely", "SYSTEM")));

        // Create constraints
        List<Constraint> constraints = new ArrayList<>();
        constraints.add(new PermissionConstraint("HeightLimit", "Maximum allowed flight height"));
        constraints.add(new RegulatoryConstraint("AirspaceRule", "No-fly zone restrictions"));

        // Create the mission
        mission = new Mission("Medical Delivery", medicalDroneGroup, actions, constraints);
    }

    @Test
    public void testMissionDetails() {
        assertEquals("Medical Delivery", mission.getName());
        assertNotNull(mission.getDroneGroup());
        assertEquals("Medical Fleet", mission.getDroneGroup().getName());
        assertTrue(mission.getDroneGroup().getDrones().size() > 0);
        assertTrue(mission.getActions().size() > 0);
        assertTrue(mission.getConstraints().size() > 0);
        
        // Test drone details
        Drone firstDrone = mission.getDroneGroup().getDrones().get(0);
        assertEquals("MedFly-X1", firstDrone.getName());
        assertEquals("192.168.1.100", firstDrone.getIp());
        assertEquals("SN123456", firstDrone.getSerialNumber());
        
        // Test number of actions and constraints
        assertEquals(4, mission.getActions().size());
        assertEquals(2, mission.getConstraints().size());
    }
}
