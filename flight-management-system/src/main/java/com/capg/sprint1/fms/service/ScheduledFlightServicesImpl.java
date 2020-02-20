package com.capg.sprint1.fms.service;

import com.capg.sprint1.fms.dao.MyException;
import com.capg.sprint1.fms.dao.ScheduledFlightDao;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl;

public class ScheduledFlightServicesImpl implements ScheduledFlightServices {
	
	 static ScheduledFlightDao service=new ScheduledFlightDaoImpl();

	public boolean checkByAvailableSeats(String fId, int numberOfSeats) throws MyException {
		return service.checkByAvailableSeats(fId,numberOfSeats);
	}

	public boolean checkByFlight(String availableFlight) throws MyException {
		return service.checkByFlight(availableFlight);
	}

	public boolean checkByDate(String date) throws MyException {
		return service.checkByDate(date);
	}


	public void addDetails() {
		service.addDetails();
	}

	public boolean checkByLocation(String source, String destination) throws MyException {
		return service.checkByLocation(source, destination);
	}
	
	public static boolean validateSeats(String Id,int numberOfSeats) {
		boolean flag=true;
		try {
			if(!(service.checkByAvailableSeats(Id,numberOfSeats))) {
				return flag;
			}
		} 
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}

