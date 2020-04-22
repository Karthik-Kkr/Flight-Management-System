package com.capg.sprint1.fms.service;

import com.capg.sprint1.fms.dao.ScheduledFlightDao;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.AvailabilityException;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.FlightException;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.dateTimeException;

public class ScheduledFlightServicesImpl implements ScheduledFlightServices {
	
	 static ScheduledFlightDao service=new ScheduledFlightDaoImpl();

	public boolean checkAvailableSeats(String fId, int numberOfSeats) throws FlightException {
		// TODO Auto-generated method stub
		return service.checkAvailableSeats(fId,numberOfSeats);
	}

	public boolean checkFlight(String availableFlight) throws AvailabilityException {
		// TODO Auto-generated method stub
		return service.checkFlight(availableFlight);
	}

	public boolean checkDateTime(String dateTime) throws dateTimeException {
		// TODO Auto-generated method stub
		return service.checkDateTime(dateTime);
	}
	
	public static boolean validateSeats(String Id,int numberOfSeats) {
		boolean flag=false;
		try {
			if(!(service.checkAvailableSeats(Id,numberOfSeats))) {
				return true;
			}
		} 
		catch (FlightException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	public void addDetails() {
		
		service.addDetails();
	}
}
