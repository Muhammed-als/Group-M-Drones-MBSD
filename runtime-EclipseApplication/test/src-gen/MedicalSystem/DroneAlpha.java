package MedicalSystem;
import java.util.*;

public class DroneAlpha  {
	
    private String ip = "127.0.0.1";
    private String serialNumber = "serialNumber";

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
