/**
 * Challenge: https://www.hackerrank.com/challenges/java-bigdecimal
 * 
 * Made by Charles M. Chong
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class SolutionBigDecimal {

	public static void main(String[]args) throws java.lang.Exception{
		int n = 0;
		BigDecimal bigDecimalInputs = new BigDecimal("200");
		DecimalFormat f = new DecimalFormat("");
		Scanner in = new Scanner(System.in);

		boolean finishLoop = false;
		while (finishLoop != true){
		try {
			//System.out.println("Enter number inputs. Max is 200.");
			n = in.nextInt();
			
			ArrayList<BigDecimal> holdInputs = new ArrayList<BigDecimal>();
			
			// 'if' condition to confirm 'n' input is less than or equal to 200
			if (n <= 200 && n >= 1){
				
				// Ask for input; Keep taking input until 'n' inputs are entered.
				for (int i = 0;i < n; i++){
					
					bigDecimalInputs = in.nextBigDecimal();	
				
					// Condition that checks that input is <= 300 digits by changing input to string and counts the length 
					if ((bigDecimalInputs.toString().length() <= 300) && (bigDecimalInputs.toString().length() >= 0)) {
								holdInputs.add(bigDecimalInputs);
					}
					else {
						System.out.println("Number of digits cannot exceed 300 digits");
					}
					finishLoop = true;
				}
			} else if (n <= 0 && n >= 201){
				System.out.println("Number of inputs is too big or not a positive real number. Starting over...");
			}
			
			else {
				System.out.println("Not valid input. Max is 200 and must input a positive real number. Starting over...");
			}
			Collections.sort(holdInputs, new Comparator<BigDecimal>() {
			    public int compare(BigDecimal o1, BigDecimal o2) {
			        return o2.compareTo(o1);
			    }});
			
			for (BigDecimal printOut:holdInputs){
			
				if ((printOut.toString().matches("^0+.+") == true)){
				
					System.out.println(printOut.toPlainString().replace("0.", "."));
					
				} 
				else {
					System.out.println(printOut.toPlainString());
					
				}	 
			}
			}
			catch (Exception e){		
			}
		}
	}
}
