package MedicalSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		MissionEvent001 missionEvent001 = new MissionEvent001(
				"BatteryLow",
				3,
				"ReturnToBase"
		);
		MissionEvent002 missionEvent002 = new MissionEvent002(
				"ObstacleDetected",
				2,
				"AvoidObstacle"
		);
		SafetyConstraint001 safetyConstraint001 = new SafetyConstraint001(
			"Battery",
			"Ensures battery level is sufficient",
			15.0f,
			12.5f
		);
		RegulatoryConstraint001 regulatoryConstraint001 = new RegulatoryConstraint001(
				"Airspace",
				"Ensures compliance with flight regulations",
				true,
				120
		);
		Action001 action001 = new Action001(
				"Scan",
				"Scan Area",
				1.5f
		);
		SubPhaseA subPhaseA = new SubPhaseA(
				"Hover",
				5.0f,
				new ArrayList<Object>(Arrays.asList(action001))
		);
		Phase001 phase001 = new Phase001(
			"Takeoff",
			20.5f,
			new ArrayList<Object>(Arrays.asList(subPhaseA))
		);
		Phase002 phase002 = new Phase002(
				"Landing",
				18.0f,
				new ArrayList<Object>(Arrays.asList(subPhaseA))
			);
		EnergyModelA energyModelA = new EnergyModelA(
			0.5f,
			95.0f,
			2.5f
		);
		EnergyModelB energyModelB = new EnergyModelB(
				0.7f,
				90.0f,
				3.0f
			);
		DroneAlpha droneAlpha = new DroneAlpha(
				"Quadcopter",
				5000.0f,
				30.5f,
				2.5f,
				"Surveillance",
				new ArrayList<Object>(Arrays.asList(energyModelA))
		);
		DroneBeta droneBeta = new DroneBeta(
				"FixedWing",
				7000.0f,
				45.5f,
				5.0f,
				"Transport",
				new ArrayList<Object>(Arrays.asList(energyModelB))
		);
		
		MedicalDelivery medicalDelivery = new MedicalDelivery(
				"Mission-001",
				"Reconnaissance",
				"Hospital A",
				"Clinic B",
				1,
				5.5f,
				new ArrayList<Object>(Arrays.asList(droneAlpha,droneBeta)),
				new ArrayList<Object>(Arrays.asList(phase001,phase002)),
				new ArrayList<Object>(Arrays.asList(safetyConstraint001,regulatoryConstraint001)),
				new ArrayList<Object>(Arrays.asList(missionEvent001,missionEvent002))
		);
		System.out.println("medicalDelivery:" + 
			medicalDelivery.getMissionID() + "\n" + 
			medicalDelivery.getMissionType() + "\n" +
			medicalDelivery.getStartLocation() + "\n" +
			medicalDelivery.getEndLocation() + "\n" +
			medicalDelivery.getPriority() + "\n" +
			medicalDelivery.getEstimatedTime() + "\n" +
			medicalDelivery.getDrones() + "\n" +
			medicalDelivery.getPhases() + "\n" +
			medicalDelivery.getConstraints() + "\n" +
			medicalDelivery.getEvents()
		);
	}
}