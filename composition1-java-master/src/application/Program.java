package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department's name");
		String nameDepartment = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Level:");
		String level = sc.nextLine();
		System.out.println("Base salary:");
		double baseSalary = sc.nextDouble();
		System.out.println("How many contracts to this worker");
		Integer contracts = sc.nextInt();
		Worker worker = new Worker(name,WorkerLevel.valueOf(level),baseSalary,new Department(nameDepartment));
		for(int i=0;i<contracts;i++) {
			System.out.println("Enter Contract #"+(i+1)+ " data:");
			System.out.println("Date (DD/MM/YYYY):");
			Date contractDate= sdf.parse(sc.next());
			System.out.println("Value per hour:");
			double valueHour = sc.nextDouble();
			System.out.println("Duration (hours):");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valueHour, hours);
			worker.addContract(contract);	
		}
		System.out.println("Enter month ad year to calculate income(MM/YYYY)");
		String monthAndYear =  sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		double total= worker.income(year, month);
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getNameDepartment());
		System.out.println("Income for "+monthAndYear+": "+total);
		
	}
}
