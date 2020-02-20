package com.capg.sprint1.fms.model;

public class ScheduledFlight {
	
	private int availableSeats;
	private String flight;
	private String date;
	private String source;
	private String destination;
	
	public ScheduledFlight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ScheduledFlight(int availableSeats, String flight, String date, String source, String destination) {
		super();
		this.availableSeats = availableSeats;
		this.flight = flight;
		this.date = date;
		this.source = source;
		this.destination = destination;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + availableSeats;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flight == null) ? 0 : flight.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
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
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flight == null) {
			if (other.flight != null)
				return false;
		} else if (!flight.equals(other.flight))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ScheduledFlight [availableSeats=" + availableSeats + ", flight=" + flight + ", date=" + date
				+ ", source=" + source + ", destination=" + destination + "]";
	}

	
}
