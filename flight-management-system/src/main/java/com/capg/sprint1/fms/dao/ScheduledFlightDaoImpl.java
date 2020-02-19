package com.capg.sprint1.fms.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import com.capg.sprint1.fms.model.ScheduledFlight;

public class ScheduledFlightDaoImpl implements ScheduledFlightDao {
	
	Map<String,ScheduledFlight> seats=new HashMap<String,ScheduledFlight>();
	Map<String,ScheduledFlight> flightsLists=new HashMap<String,ScheduledFlight>();
	
	public void addDetails() {
		ScheduledFlight customer1=new ScheduledFlight(5,"13abf","31-01-2020");
		ScheduledFlight customer2=new ScheduledFlight(6,"583fg","08-09-2020");
		seats.put(customer1.getFlight(), customer1);
		seats.put(customer2.getFlight(), customer2);
		
	}

	public boolean checkAvailableSeats(String fId,int numberOfSeats) throws FlightException{
		// TODO Auto-generated method stub
		if(!(seats.get(fId).getAvailableSeats()>=numberOfSeats))
			throw new FlightException("The seats are not available");
		return true;
	}

	public boolean checkFlight(String availableFlight) throws AvailabilityException{
		// TODO Auto-generated method stub
		if(!(flightsLists.containsKey(availableFlight))) 
			throw new AvailabilityException("The flight is not available");
		return false;
	}

	public boolean checkDateTime(String dateTime) throws dateTimeException{
		// TODO Auto-generated method stub
		if(!(LocalDate.now().equals(dateTime)))
			throw new dateTimeException("Flight is not available at that particulat date and time");
		return false;
	}
	
	public class FlightException extends Exception {
		public FlightException(String message) {
			
		}
	}
	
	public class AvailabilityException extends Exception {
		public AvailabilityException(String string) {
			
		}
	}
	
	
	public class dateTimeException extends Exception {
		public dateTimeException(String time) {
			
		}
	}
}
