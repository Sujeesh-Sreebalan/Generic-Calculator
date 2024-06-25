package staticCheckingAndCodeReview;

public class Example {
	/*	Function to check Whether the First Number is Smaller than the Second Number*/
	boolean comparingLesserThan(String num1, String num2) {
		int len1 = num1.length();
		int len2 = num2.length();
		
/*		
 * If the length of first number is greater then it's a bigger number
 * If length is same then checking character by character
 * 
 */	
		if (len1 < len2) {
			return true;
		}else if(len1 == len2) {
			for(int i = 0; i < len1; i++) {
				
				int char1 = (int)num1.toLowerCase().charAt(i);
				int char2 = (int)num2.toLowerCase().charAt(i);
				
				if(char1 > char2) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
}
