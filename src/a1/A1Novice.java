package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		
		String[] names = new String[count];
		
		for (int i=0; i<names.length; i++) {
			names[i] = scan.next().charAt(0) + ". " + scan.next() + ": ";
			
			int items = scan.nextInt();
			double price = 0;
		for (int j=0; j<items; j++) {
				double quantity = scan.nextInt();
				String filler = scan.next();
				double cents = scan.nextDouble();
				price += quantity * cents;
		}
		names[i] += String.format("%.2f", price);

			}
		for (int k=0; k<names.length; k++) {
			System.out.print(names[k]+"\n");
		}
			
		}
	}
