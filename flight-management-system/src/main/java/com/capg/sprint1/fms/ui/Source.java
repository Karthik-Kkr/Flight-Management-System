package com.capg.sprint1.fms.ui;

import java.util.Scanner;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.AvailabilityException;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.FlightException;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl.dateTimeException;
import com.capg.sprint1.fms.service.ScheduledFlightServices;
import com.capg.sprint1.fms.service.ScheduledFlightServicesImpl;

public class Source {
	static Scanner in=new Scanner(System.in);
	static ScheduledFlightServices user=new ScheduledFlightServicesImpl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

	public static void check() {
		System.out.println("Check the availability details by the below methods");
		System.out.println("1. Seats Availability");
		System.out.println("2. Flight");
		System.out.println("3. Date and Time");
		System.out.println("Enter your choice");
		int choice=in.nextInt();
		
		switch(choice) {
		case 1: 
			seats();
			break;
		case 2:
			flight();
			break;
		case 3:
			dt();
			break;
		default:
			System.err.println("Invalid Choice");
	}
}

	
	public static void seats() {
		// TODO Auto-generated method stub
		user.addDetails();	
		System.out.println("Enter the flight ID");
		String fId=in.next();
		System.out.println("Enter the required number of seats");
		int numberOfSeats=in.nextInt();
		try {
			if(user.checkAvailableSeats(fId,numberOfSeats))
				System.out.println("The seats are available");
		} catch (FlightException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void flight() {
		// TODO Auto-generated method stub
		user.addDetails();
		System.out.println("Which flight is available");
		String availableFlight=in.next()+in.nextLine();
		try {
			user.checkFlight(availableFlight);
		} catch (AvailabilityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void dt() {
		// TODO Auto-generated method stub
		user.addDetails();
		System.out.println("On which date and at what time you want to plan the journey");
		System.err.println("Enter the date in dd-mm-yyyy format");
		String dateTime=in.nextLine();
		try {
			user.checkDateTime(dateTime);
		} catch (dateTimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
