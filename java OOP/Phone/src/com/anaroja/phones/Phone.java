package com.anaroja.phones;

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
	public String getVersionNumber() {
		return versionNumber;
	}
	//setters
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	// getters
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	//setters
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	// getters
	public String getCarrier() {
		return carrier;
	}
	//setters
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	// getters
	public String getRingTone() {
		return ringTone;
	}
	//setters
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
    
}