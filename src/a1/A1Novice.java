package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Variable 'count' represents the number of customers
		int count = scan.nextInt();
		
		// 'names' keeps track of the customers' names
		String[] names = new String[count];
		
		// This for loop adds the customer's names as they
		// need to appear in the output
		for (int i=0; i<names.length; i++) {
			names[i] = scan.next().charAt(0) + ". " + scan.next() + ": ";
		
		// This second for loop establishes a total
		// price for each customer
			int items = scan.nextInt();
			double price = 0;
		for (int j=0; j<items; j++) {
				double quantity = scan.nextInt();
				String filler = scan.next();
				double cents = scan.nextDouble();
				price += quantity * cents;
		}
		
		// This part of the for loop attaches the
		// totals found in the embedded for loop
		names[i] += String.format("%.2f", price);

			}
		
		// This is just the systematic way of printing
		// the output
		for (int k=0; k<names.length; k++) {
			System.out.print(names[k]+"\n");
		}
			
		}
	}
