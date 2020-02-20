package com.capg.sprint1.fms.dao;

//import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capg.sprint1.fms.model.ScheduledFlight;

public class ScheduledFlightDaoImpl implements ScheduledFlightDao {
	public ScheduledFlightDaoImpl() {
 addDetails();
	}
	
	static Map<String,ScheduledFlight> schedule=new HashMap<String, ScheduledFlight>();
	static Map<String,ScheduledFlight> schedule2=new HashMap<String,ScheduledFlight>();
	
	public void addDetails() {
		ScheduledFlight c1=new ScheduledFlight(5,"13abf","31-01-2020","Lucknow","Hyderabad");
		ScheduledFlight c2=new ScheduledFlight(6,"583fg","08-09-2020","Goa","Chennai");
		
		schedule.put(c1.getFlight(), c1);
		schedule.put(c2.getFlight(), c2);
		
		schedule2.put(c1.getSource(), c1);
		schedule2.put(c2.getSource(), c2);
		}

	public boolean checkByAvailableSeats(String fId, int numberOfSeats) throws MyException {
		
		if((schedule.get(fId).getAvailableSeats()<=numberOfSeats))
			throw new MyException("The seats are not available");
		else 
			return true;
		}

	public boolean checkByFlight(String availableFlight) throws MyException {
		
		if(!(schedule.containsKey(availableFlight))) 
			throw new MyException("The flight is not available");
		else 
			return true;
	}

	public boolean checkByDate(String date){
	
		return true;
	}

	public boolean checkByLocation(String source, String destination) throws MyException {
		if(!((schedule2.get(source).getDestination()).equals(destination))) {
			throw new MyException("No flights available from given source to destination");
		}
		return true;
	}
}
