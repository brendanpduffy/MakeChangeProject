package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
		double num1 = 0.0;
		double num2 = 0.0;
		double change = 0.0;
		int num20b = 0;
		int num10b = 0;
		int num5b = 0;;
		int num1b = 0;
		int numQ = 0;
		int numD = 0;
		int numN = 0;
		int numP = 0;
		int newChange = 0;
		System.out.println("Welcome.  Please enter the price of the item: ");
		num1 = sc.nextDouble();
		System.out.println("How much money was tendered by the customer? ");
		num2 = sc.nextDouble();
		
		if (num2 < num1) {
			System.out.println("Error message:  Insufficient funds.");
		}
		else if (num2 == num1) {
			System.out.println("Thank you.  Have a great day!");
		}
		else if (num2 > num1){
			change = num2 - num1;
			
			change = change * 100;
			
			change = Math.round(change);
			
			newChange = (int)(change);

			num20b = newChange / 2000;
			newChange = newChange % 2000;
			
			num10b = newChange / 1000;
			newChange = newChange % 1000;
			
			num5b = newChange / 500;
			newChange = newChange % 500;
			
			num1b = newChange / 100;
			newChange = newChange % 100;
			
			numQ = newChange / 25;
			newChange = newChange % 25;
			
			numD = newChange / 10;
			newChange = newChange % 10;
			
			numN = newChange / 5;
			newChange = newChange % 5;
			
			numP = newChange;
			
			
			System.out.print("Result: ");
			if (num20b>1) {
				System.out.print(num20b + " twenty dollar bills, ");
			}
			else if (num20b == 1) {
				System.out.print(num20b + " twenty dollar bill, ");
			}
			else if (num20b == 0 ) {
			}
			if (num10b>1) {
				System.out.print(num10b + " ten dollar bills, ");
			}
			else if (num10b == 1) {
				System.out.print(num10b + " ten dollar bill, ");
			}
			else if (num10b == 0 ) {
			}
			if (num5b > 1) {
				System.out.print(num5b + " five dollar bills, ");
			}
			else if (num5b == 1) {
				System.out.print(num5b + " five dollar bill, ");
			}
			else if (num5b ==0) {
			}
			if (num1b > 1) {
				System.out.print(num1b + " one dollar bills, ");
			}
			else if (num1b == 1) {
				System.out.print(num1b + " one dollar bill, ");
			}
			else if (num1b == 0){
			}
			if (numQ > 1) {
				System.out.print(numQ + " quarters, ");
			}
			else if (numQ == 1) {
				System.out.print(numQ + " quarter, ");
			}
			else if (numQ == 0){
			}
			if (numD > 1) {
				System.out.print(numD + " dimes, ");
			}
			else if (numD == 1) {
				System.out.print(numD + " dime, ");
			}
			else if (numD == 0){
			}
			if (numN > 1) {
				System.out.print(numN + " nickels, ");
			}
			else if (numN == 1) {
				System.out.print(numN + " nickel, ");
			}
			else if (numN == 0){
			}
			if (numP > 1) {
				System.out.print(numP + " pennies.");
			}
			else if (numP == 1) {
				System.out.print(numP + " penny.");
			}
			else if (numP == 0){
			}
			sc.close();
		}
	}
}
