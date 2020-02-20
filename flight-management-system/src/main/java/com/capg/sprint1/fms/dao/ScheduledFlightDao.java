package com.capg.sprint1.fms.dao;

public interface ScheduledFlightDao {
	public void addDetails();
	public boolean checkByAvailableSeats(String fId,int numberOfSeats) throws MyException ;
	public boolean checkByFlight(String availableFlight) throws MyException ;
	public boolean checkByDate(String date)throws MyException ;
	public boolean checkByLocation(String source,String destination)throws MyException;
}
