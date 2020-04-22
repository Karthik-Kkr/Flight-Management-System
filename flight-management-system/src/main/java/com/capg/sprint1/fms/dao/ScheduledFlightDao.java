package com.capg.sprint1.fms.dao;

//import java.util.Date;
//import java.util.List;

import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.AvailabilityException;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.FlightException;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.dateTimeException;

//import com.capg.sprint1.fms.model.ScheduledFlight;

public interface ScheduledFlightDao {
	public void addDetails();
	public boolean checkAvailableSeats(String fId,int numberOfSeats) throws FlightException;
	public boolean checkFlight(String availableFlight) throws AvailabilityException;
	public boolean checkDateTime(String dateTime) throws dateTimeException;
}
