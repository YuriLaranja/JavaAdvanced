package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number=sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder=sc.nextLine();
		System.out.print("Initial balance: ");
		
		double balance=sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit=sc.nextDouble();
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount=sc.nextDouble();
		Account c =new Account(number,holder,balance,withdrawLimit);
		c.withdraw(amount);
		System.out.println("New Balance:"+c.getBalance());
		sc.close();
	}
}
