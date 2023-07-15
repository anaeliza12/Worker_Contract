package application;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner tec = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("DD/MM");
	

		System.out.print("Enter department`s name: ");
		String department = tec.nextLine();
		
		System.out.println("Enter worker data: ");	
		
		System.out.print("Name: ");
		String name = tec.nextLine();
		
		
		System.out.print("Level: ");
		String level = tec.nextLine();
	
		
		
		System.out.print("Base Salary: : ");
		double BaseSalary  = tec.nextDouble();
		
		System.out.print("How many contratcs to this worker? ");
		int contract = tec.nextInt();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), BaseSalary, new Department(department));
	
		
		for(int i = 1; i <= contract; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date: ");
			
			Date contactDate = sdf.parse(tec.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour= tec.nextDouble();
			System.out.print("Duration: ");
			int hour = tec.nextInt();
			
			HourContract hourContract = new HourContract(contactDate, valuePerHour, hour);
			
			worker.addContract(hourContract);
			
		}
		
		System.out.print("Enter month and year to calclate income (MM/YYYY): ");
		String date = tec.next();

		
		int year =  Integer.parseInt(date.substring(3, 4)) ;
		int month = Integer.parseInt(date.substring(0, 1));
		
		System.out.println(worker.getName());
		System.out.println(worker.getDepartment());
		System.out.println("Income for " + date + ":" + worker.income(year, month));
		
//		for(HourContract h : worker.getContract()) {
//			System.out.println(h);
//		}
		
		
		
	
	
	
	}

}
