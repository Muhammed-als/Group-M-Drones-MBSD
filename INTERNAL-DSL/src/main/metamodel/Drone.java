package main.metamodel;

public class Drone extends Entity {
    private String name;
    private String ip;
    private String serialNumber;
    public Drone(String name, String ip, String serialNumber) {
        this.name = name;
        this.ip = ip;
        this.serialNumber = serialNumber;
    }
    public String getName() {
        return name;
    }
    public String getIp() {
        return ip;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString() {
        return "Drone{" + "name='" + name + '\'' + ", ip='" + ip + '\'' + ", serialNumber='" + serialNumber + '\'' + '}';
    }
}
