package MedicalSystems;
import java.util.*;

public class Drone  {
    private String ip;
    private String serialNumber;
    
    // Constructor
        public Drone(String ip, String serialNumber) {
	            this.ip = ip;
	            this.serialNumber = serialNumber;
	        }

public void setIp(String ip) {
    this.ip = ip;
}
	
public String getIp() {
    return this.ip;
}
public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
}
	
public String getSerialNumber() {
    return this.serialNumber;
}
}
