package com.moovin.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="locationDTO")
public class LocationDTO {
	 	private double latitude;
	 	private double longitude;
	 	private boolean available;

	 	public LocationDTO() {
	 		
	 	}
	 	
	 	@XmlElement
	    public double getLatitude() {
	        return latitude;
	    }

	    public void setLatitude(double latitude) {
	        this.latitude = latitude;
	    }

	    @XmlElement
	    public double getLongitude() {
	        return longitude;
	    }

	    public void setLongitude(double longitude) {
	        this.longitude = longitude;
	    }

	    @XmlElement
	    public boolean getAvailable() {
	        return available;
	    }

	    public void setAvailable(boolean available) {
	        this.available = available;
	    }
	    
}
