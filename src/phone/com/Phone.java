package phone.com;

public abstract class Phone {
	
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself
    
    public String getVersionNumber() {
    	return versionNumber;
    }
    
    public String getCarrier() {
    	return carrier;
    }
    
    public int getBatteryPercentage() {
    	return batteryPercentage;
    }
    
    public void setBatteryPercentage(int batteryPercentage) {
    	this.batteryPercentage = batteryPercentage;
    }
    
    public String getRingTone() {
    	return ringTone;
    }
    
    public void setRingTone (String ringTone) {
    	this.ringTone = ringTone;
    }
}
