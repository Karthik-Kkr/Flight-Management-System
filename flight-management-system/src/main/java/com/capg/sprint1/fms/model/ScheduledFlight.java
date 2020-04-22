package com.capg.sprint1.fms.model;

public class ScheduledFlight {
	
	private int availableSeats;
	private String flight;
	private String dateTime;
	
	public ScheduledFlight() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ScheduledFlight(int availableSeats, String flight,String i) {
		super();
		this.availableSeats = availableSeats;
		this.flight = flight;
		this.dateTime = i;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + availableSeats;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + ((flight == null) ? 0 : flight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduledFlight other = (ScheduledFlight) obj;
		if (availableSeats != other.availableSeats)
			return false;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (flight == null) {
			if (other.flight != null)
				return false;
		} else if (!flight.equals(other.flight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ScheduledFlight [availableSeats=" + availableSeats + ", flight=" + flight + ", dateTime=" + dateTime
				+ "]";
	}
	
}
