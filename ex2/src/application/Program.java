package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		Integer employees = sc.nextInt();
		for(int i=1; i<=employees;i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.println("Outsourced (y/n)?");
			char type = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			int valuePerHours = sc.nextInt();
			double valuePerHour = valuePerHours;
			if(type=='y' || type == 'Y') {
			System.out.println("Additional charge: ");
			int additionalCharges = sc.nextInt();
			double additionalCharge= additionalCharges;
			Employee employee = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
			employeeList.add(employee);
			}
			else if (type == 'n' || type == 'n') {
				Employee employee = new Employee(name, hours, valuePerHour);
				employeeList.add(employee);
			}
		}
		System.out.println("PAYMENTS:");
		for(Employee c : employeeList) {
			System.out.println(c.getName()+" - $ "+c.payment());
		}
		
		
	
	}
	}
