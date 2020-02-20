package com.capg.sprint1.fms.ui;

import java.util.Scanner;

import com.capg.sprint1.fms.dao.MyException;
import com.capg.sprint1.fms.service.ScheduledFlightServices;
import com.capg.sprint1.fms.service.ScheduledFlightServicesImpl;

public class Source {
	static Scanner in=new Scanner(System.in);
	static ScheduledFlightServices user=new ScheduledFlightServicesImpl();
	
	public static void main(String[] args)  {
		check();
	}

	public static void check()  {
		System.out.println("Check the availability details by the below methods");
		System.out.println("1. Seats Availability");
		System.out.println("2. Flight");
		System.out.println("3. Date");
		System.out.println("4. Journey");
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
		case 4:
			sd();
			break;
		default:
			System.err.println("Invalid Choice");
	}
}

	public static void seats()  {
		// TODO Auto-generated method stub
		user.addDetails();	
		System.out.println("Enter the flight ID");
		String fId=in.next();
		System.out.println("Enter the required number of seats");
		int numberOfSeats=in.nextInt();
		try {
				if(user.checkByAvailableSeats(fId,numberOfSeats)) {
					System.out.println("Seats are available");}
				else
					System.out.println("Seats are not available");
			}
		

		catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void flight() {
		// TODO Auto-generated method stub
		user.addDetails();
		System.out.println("Which flight is available");
		String availableFlight=in.next()+in.nextLine();
		try {
			if(user.checkByFlight(availableFlight)) {
				System.out.println("The flight is available");
				seats();
			}
			else
				System.out.println("The flight is not available");
			} 
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void dt() {
		user.addDetails();
		System.out.println("On which date you want to plan the journey");
		System.out.println("Enter the date in dd-mm-yyyy format");
		String date=in.nextLine();
		try {
			if(user.checkByDate(date)) {
				System.out.println("Available");
				flight();
			}
		} 
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void sd() {
		
		user.addDetails();
		System.out.println("Enter the source");
		String source=in.next()+in.nextLine();
		System.out.println("Enter the destination");
		String destination=in.next()+in.nextLine();
		try {
			if(user.checkByLocation(source,destination)) {
				System.out.println("Flight is available");
				dt();
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
