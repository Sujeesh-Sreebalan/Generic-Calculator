package staticCheckingAndCodeReview;
//Importing the required Libraries
import java.util.Scanner;


public class GenericCalculator {

	public static void main(String[] args) {
//		Creating object for the Conversion Calculator
		ConversionCalculator hexaDecimalCalc = new ConversionCalculator();
		
//		Taking Input From the User
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		String num1 = sc.nextLine();
		System.out.print("\nEnter the Second Number: ");
		String num2 = sc.nextLine();
		
		System.out.print("\nEnter the Base: ");
		int base = sc.nextInt();
		
		
//		PerForming the arithmetic operation
		System.out.print("\nAddition of Two Numbers:- "+hexaDecimalCalc.addition(num1, num2, base));
		System.out.print("\nSubtraction of Two Numbers: "+hexaDecimalCalc.subtraction(num1, num2, base));
		System.out.print("\nMultiplication of Two Numbers: "+hexaDecimalCalc.multiplication(num1, num2, base));
		System.out.println("\nDivision of Two Numbers: "+hexaDecimalCalc.division(num1, num2, base));
		
//		Comparing for the Equality of both Numbers
		if (hexaDecimalCalc.comparingEquality(num1, num2)) {
			System.out.println("\nNumbers are equal");
		}else {
			
//			Comparing if Number 1 is Greater Than Number 2
			if(hexaDecimalCalc.comparingGreaterThan(num1, num2)) {
				System.out.println("\nNumber 1 is Greater than Number 2");
			}else {
				System.out.println("\nNumber 2 is Greater than Number 1");
			}
	
//			Comparing if Number 1 is Smaller Than Number 2
			if(hexaDecimalCalc.comparingLesserThan(num1, num2)) {
				System.out.println("\nNumber 1 is Smaller than Number 2");
			}else {
				System.out.println("\nNumber 2 is Smaller than Number 1");
			}
		}
		
//		Showing the decimal representation of the number
		System.out.print("\nDecimal Representation of First Number: "+hexaDecimalCalc.decimalRepresentation(num1));
		System.out.println("\nDecimal Representation of Second Number: "+hexaDecimalCalc.decimalRepresentation(num2));
			
	
//		Converting the Decimal Number to HexaDecimal Number	
		System.out.print("\nEnter the Decimal Number: ");
		int num = sc.nextInt();
		System.out.println("Hexadecimal Representation of Decimal Number: "+hexaDecimalCalc.hexaDecimalRepresentation(num));
		
		sc.close();
		
	}

}
