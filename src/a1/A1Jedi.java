package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int types = scan.nextInt();
		String[] items = new String[types];
		int[] customers = new int[types];
		int[] quantity = new int[types];
		double filler = 0;
		
		for (int i=0; i<types; i++) {
			items[i] = scan.next();
			filler = scan.nextDouble();
		}
		
		int people = scan.nextInt();
		String check = "";
		int amount = 0;
		String extra = "";
		int numberOfTypes = 0;
		boolean[] doneThat = new boolean[types];
		
		for (int k=0; k<people; k++) {
		extra = scan.next() + scan.next();
		numberOfTypes = scan.nextInt();
			for (int i=0; i<types; i++) {
				doneThat[i] = false;
			}
			for (int m=0; m<numberOfTypes; m++) {
				amount = scan.nextInt();
				check = scan.next();
				quantity[search(items,check)]+=amount;
				if (!doneThat[search(items, check)]) {
						customers[search(items, check)]++;
						doneThat[search(items, check)]=true;
				}
			}
		}
		for (int l=0; l<items.length; l++) {
			if (customers[l] < 1) {
			System.out.println("No customers bought " + items[l]);
			} else {
				System.out.println(customers[l] +" customers bought "+ quantity[l] + " " + items[l]);
			}
		}
	}

 static int search(String[] items, String check) {
	 int index = -1;
	 for (int j=0; j<items.length; j++) {
		if (check.equals(items[j])) {
		index = j;
		}
	}
	 return index;
}
}