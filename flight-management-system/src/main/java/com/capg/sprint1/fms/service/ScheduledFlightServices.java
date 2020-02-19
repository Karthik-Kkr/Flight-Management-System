package com.capg.sprint1.fms.service;

//import java.util.Date;

import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.AvailabilityException;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.FlightException;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.dateTimeException;

public interface ScheduledFlightServices {
	
	public boolean checkAvailableSeats(String fId,int numberOfSeats) throws FlightException;
	public boolean checkFlight(String availableFlight) throws AvailabilityException;
	public boolean checkDateTime(String dateTime) throws dateTimeException;
	public void addDetails();
}
