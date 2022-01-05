package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String args[]) {
		
		List<TaxPayer> list = new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int number= sc.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or Company (i/c)? ");
			char ch=sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome= sc.nextDouble();
			if(ch=='i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name,anualIncome,healthExpenditures));
			}else if (ch=='c') {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name,anualIncome,numberEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double total = 0;
		for(TaxPayer tax: list) {
			total+=tax.tax();
			System.out.println(tax.getName()+": "+String.format("%.2f", tax.tax()));
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+String.format("%.2f", total));
	}
}
