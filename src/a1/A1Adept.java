package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int types = scan.nextInt();
		String[] items = new String[types];
		double[] prices = new double[types];
		
		for (int i=0; i<types; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
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
		System.out.print("Biggest: "+ names[max(totals)]+" ("+ String.format("%.2f", totals[max(totals)])+")");
		System.out.print("Smallest: "+ names[min(totals)]+" ("+ String.format("%.2f", totals[min(totals)])+")");
		System.out.print("Average: "+ average(totals));
		}
		
	static double search(String food, String[] items, double[] prices) {
		for (int k=0; k<items.length; k++) {
			if (food.equals(items[k])) {
				return prices[k];
			}
		}
		return 0;
	}
	static int max(double[] totals) {
		double maximum = 0;
		int index = 0;
		for (int m=0; m<totals.length; m++) {
		if (totals[m] > maximum) {
			index = m;
		}
		}
		return index;
	}
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
	static String average(double[] totals) {
		double sum = 0;
		for (int o=0; o<totals.length; o++) {
			sum += totals[o];
		}
		return String.format("%.2f", ((double) sum) / ((double) totals.length));
	}
}
