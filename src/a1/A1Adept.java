package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* Variable 'types' determines how many
		different kinds of items the customer
		purchased. 'items' hold the names, and
		'prices' holds the prices. The same index
		for both arrays corresponds to the same
		item
		*/
		int types = scan.nextInt();
		String[] items = new String[types];
		double[] prices = new double[types];
		
		// The for loop put the name and
		// prices of the item in their respective
		// arrays
		for (int i=0; i<types; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		// Here I created arrays for the customers'
		// names and totals. In the loops, I made
		// the names the correct format. I also
		// was able to add up the totals by using my
		// search method to find the correct price
		// per item type, and multiplying that price
		// by the quantity variable.
		int customers = scan.nextInt();
		double total = 0;
		String[] names = new String[customers];
		double[] totals = new double[customers];
		for (int j=0; j<customers; j++) {
			names[j] = scan.next()+" "+scan.next();
			int quantity = scan.nextInt();
			for (int l=0; l<quantity; l++) {
			totals[j]+= scan.nextInt() * search(scan.next(), items, prices);
		}
		}
		
		// Prints the output in the correct format
		System.out.print("Biggest: "+ names[max(totals)]+" ("+ String.format("%.2f", totals[max(totals)])+")"+"\n");
		System.out.print("Smallest: "+ names[min(totals)]+" ("+ String.format("%.2f", totals[min(totals)])+")"+"\n");
		System.out.print("Average: "+ average(totals));
		}
	
	// A method for finding the item type to get
	// the correct price
	static double search(String food, String[] items, double[] prices) {
		for (int k=0; k<items.length; k++) {
			if (food.equals(items[k])) {
				return prices[k];
			}
		}
		return 0;
	}
	
	// A method for finding the maximum
	static int max(double[] totals) {
		double maximum = 0;
		int index = 0;
		for (int m=0; m<totals.length; m++) {
		if (totals[m] > maximum) {
			index = m;
			maximum = totals[m];
		}
		}
		return index;
	}
	
	// A method for finding the minimum
	static int min(double[] totals) {
		double minimum = 1000;
		int index = 0;
		for (int n=0; n<totals.length; n++) {
			if (totals[n]< minimum) {
				index = n;
				minimum = totals[n];
			}
		}
		return index;
	}
	
	// A method for finding the average price
	static String average(double[] totals) {
		double sum = 0;
		for (int o=0; o<totals.length; o++) {
			sum += totals[o];
		}
		return String.format("%.2f", ((double) sum) / ((double) totals.length));
	}
}
