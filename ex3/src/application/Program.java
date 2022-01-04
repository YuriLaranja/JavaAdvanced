package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		List <Product> listProduct = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int products = sc.nextInt();
		for(int i=1;i<=products;i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.print("Price: ");
			double price=sc.nextDouble();
			if(type=='i') {
				System.out.print("Customs fee: ");
				double customs=sc.nextDouble();
				Product product = new ImportedProduct(name,price,customs);
				listProduct.add(product);
				
			}else if(type=='u') {
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date=sc.nextLine();
				Product product = new UsedProduct(name,price,date);
				listProduct.add(product);
			}else {
				Product product = new Product(name,price);
				listProduct.add(product);
			}
			
				
			
		}
		System.out.println("PRICE TAGS: ");
		for(Product c : listProduct) {
			System.out.println(c.priceTag());
		}
		
	}
}
