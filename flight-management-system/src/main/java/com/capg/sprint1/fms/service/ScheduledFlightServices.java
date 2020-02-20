package com.capg.sprint1.fms.service;

import com.capg.sprint1.fms.dao.MyException;

public interface ScheduledFlightServices {
	
	public boolean checkByAvailableSeats(String fId,int numberOfSeats) throws MyException;
	public boolean checkByFlight(String availableFlight) throws MyException;
	public boolean checkByDate(String date) throws MyException;
	public void addDetails();
	public boolean checkByLocation(String source,String destination)throws MyException;
	
}
