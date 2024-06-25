package staticCheckingAndCodeReview;

class HexCalc {
	
/*	Created a generic function which returns results according to the user desired Number System  */
	String typeBasedConversion (int result, int base){
		if (base == 2) {
			String resultBinary = Integer.toBinaryString(result);
			return resultBinary;
		}else if (base == 8) {
			String resultOctal = Integer.toOctalString(result);
			return resultOctal;
		}else if(base == 10) {
			String resultDecimal = Integer.toString(result);
			return resultDecimal;
		}
		else {
			String resultHexaDecimal = Integer.toHexString(result).toUpperCase();
			return resultHexaDecimal;
		}
	}
	
	
/*	Created a function for the addition of two numbers*/
	String addition(String num1, String num2, int base) {
		int result = Integer.parseInt(num1, base) + Integer.parseInt(num2, base);
		return typeBasedConversion(result, base);
		
	}
	
/*	Created a function for the Subtraction of two numbers*/	
	String subtraction(String num1, String num2, int base) {
		int number1 = Integer.parseInt(num1, base);
		int number2 = Integer.parseInt(num2, base);
		
/*		subtraction the bigger number with the smaller number*/		
		if (number1 > number2) {
			int result = number1 - number2;
			return typeBasedConversion(result, base);
			
		}else {
			int result = number2 - number1;
			return typeBasedConversion(result, base);
		}
	}
	
/*	Created a function for the multiplication of two numbers*/	
	String multiplication(String num1, String num2, int base) {
		int result = Integer.parseInt(num1, base) * Integer.parseInt(num2, base);
		return typeBasedConversion(result, base);
	}
	
/*	Created a function for the division of two numbers*/	
	String division(String num1, String num2, int base) {
		int result = Integer.parseInt(num1, base) / Integer.parseInt(num2, base);
		return typeBasedConversion(result, base);
	}
	
	
/* 	Function to check whether the both numbers are equal or not*/	
	boolean comparingEquality(String num1, String num2) {
		int len1 = num1.length();
		int len2 = num2.length();
/*		If length of both String are not equal that means they are not equal*/		
		if (len1 != len2) {
			return false;
		}
		
/*		Comparing the String character by character*/		
		for(int i = 0; i < len1; i++) {
			if (num1.charAt(i) != num2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
/*	Function to check Whether the First Number is Greater than the Second Number*/	
	boolean comparingGreaterThan(String num1, String num2) {
		int len1 = num1.length();
		int len2 = num2.length();
		
/*		
 * If the length of first number is greater then it's a bigger number
 * If length is same then checking character by character
 * 
 */		
		if (len1 > len2) {
			return true;
		
		}else if(len1 == len2) {
			for(int i = 0; i < len1; i++) {
				
				int char1= (int)num1.toLowerCase().charAt(i);
				int char2 = (int)num2.toLowerCase().charAt(i);
				
				if(char2 > char1) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
/*	Function to convert the number into decimal number */
	int decimalRepresentation(String num1, int base) {
		int decimal = Integer.parseInt(num1, base);
		return decimal;
	}
	

/*	Function to convert the number into hexadecimal number */
	String hexaDecimalRepresentation(int num) {
		String result = Integer.toHexString(num).toUpperCase();
		return result;
	}
}
