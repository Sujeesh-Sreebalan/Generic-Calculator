package staticCheckingAndCodeReview;
//Importing the required Libraries
import java.util.Scanner;

import Assignment1.HexCalc;


public class GenericCalculator {

	public static void main(String[] args) {
//		Creating object for the Conversion Calculator
		HexCalc hexaDecimalCalc = new HexCalc();
		
//		Taking Input From the User
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		String num1 = sc.nextLine();
		System.out.print("\nEnter the Second Number: ");
		String num2 = sc.nextLine();
		
		System.out.print("\nEnter the Base: ");
		int base = sc.nextInt();
		
		
//		PerForming the arithmetic operation
		
		while(true) {
			
			System.out.println("\n Press 1 for Addition\n Press 2 for Subtraction\n Press 3 for Multiplication\n Press 4 for Division"
					+ "\n Press 5 for Comparing\n Press 6 for Decimal Representation of Number\n Press 7 for HexaDecimal Representation\n"
					+ "Press another number to exit\n");
			
			
			System.out.print("Enter your Choice: ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("\nAddition of Two Numbers:- "+hexaDecimalCalc.addition(num1, num2, base));
			}else if (choice == 2) {
				System.out.println("\nSubtraction of Two Numbers: "+hexaDecimalCalc.subtraction(num1, num2, base));
			}else if (choice == 3) {
				System.out.println("\nMultiplication of Two Numbers: "+hexaDecimalCalc.multiplication(num1, num2, base));
			}else if (choice == 4) {
				System.out.println("\nDivision of Two Numbers: "+hexaDecimalCalc.division(num1, num2, base));
			}else if (choice == 5) {
				if (hexaDecimalCalc.comparingEquality(num1, num2)) {
					System.out.println("\nNumbers are equal");
				}else {
					
//					Comparing if Number 1 is Greater Than Number 2
					if(hexaDecimalCalc.comparingGreaterThan(num1, num2)) {
						System.out.println("\nNumber 1 is Greater than Number 2");
					}else {
						System.out.println("\nNumber 2 is Greater than Number 1");
					}
				}
			}else if(choice == 6) {
//				Showing the decimal representation of the number
				System.out.print("\nDecimal Representation of First Number: "+hexaDecimalCalc.decimalRepresentation(num1, base));
				System.out.println("\nDecimal Representation of Second Number: "+hexaDecimalCalc.decimalRepresentation(num2, base));
			}else if (choice == 7) {
//				Converting the Decimal Number to HexaDecimal Number	
				System.out.print("\nEnter the Decimal Number: ");
				int num = sc.nextInt();
				System.out.println("Hexadecimal Representation of Decimal Number: "+hexaDecimalCalc.hexaDecimalRepresentation(num));
			}else {
				break;
			}
		}

		
		sc.close();
		
	}

}
