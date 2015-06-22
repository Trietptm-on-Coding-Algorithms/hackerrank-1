/**
 * Challenge: https://www.hackerrank.com/challenges/java-datatypes
 * 
 * Made by Charles M. Chong
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SolutionJavaDatatypes {
	
	
	public static void main(String[] args) throws InputMismatchException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		boolean dataTypeTestLoop = false;

		// 'WHILE' loop to keep asking for input until method is true
		while (dataTypeTestLoop != true) {
			
				// Declaration and initiation of variables
				int numOfInputs;
				int countOfInputs = 1;
				long identifyNum = 0;
				BigInteger identifyBig;
				
				// Setting limit of min and Max inputs
				BigInteger minBI = new BigInteger("-9223372036854775808");
				BigInteger maxBI = new BigInteger("9223372036854775807");
				String numToString = "";
				
				// Creating array to store Inputs
				ArrayList<String> testArray = new ArrayList<String>();
				
				// Call user input
				@SuppressWarnings("resource")
				Scanner in = new Scanner(System.in);
				//System.out.println("Enter number of inputs");
				try {
				
				// Makes next 'Integer' into a variable 'numOfInputs'
				numOfInputs = in.nextInt();
				
				// 'FOR' loop to determine number of taken inputs
				for (int i = 0; i < numOfInputs; i++) {

					// Increases count for each Input.
					//System.out.println("Enter test number #" + countOfInputs);
					countOfInputs++;
					
					identifyBig = in.nextBigInteger();
					
					// Rules for Relational Operators for Big Integers
					// For equality, use left.compareTo(right) == 0.
					// For less than, use left.compareTo(right) < 0.
					// For greater than, use left.compareTo(right) > 0.			
					
					// Calls for user's input to determine DataType
					identifyNum = identifyBig.longValue();
					
					// Converting each Input Interger to String to add to ArrayList 
					// Not practicial; would use a multidimensional ArrayList instead
					//numToString = BigInteger.toString(identifyBig);
					if (//identifyNum <= Long.MAX_VALUE && identifyNum >= Long.MIN_VALUE && 
							(identifyBig.compareTo(maxBI) == 0 || identifyBig.compareTo(maxBI) < 0) && 
							(identifyBig.compareTo(minBI) == 0 || identifyBig.compareTo(minBI) > 0)){
							testArray.add(identifyBig+" can be fitted in:");
					}
					
					if (identifyBig.compareTo(maxBI) > 0 || identifyBig.compareTo(minBI) < 0){
						testArray.add(identifyBig+" can't be fitted anywhere.");
					}
					
					// Identifying the minimum and maximum of a 'Byte' Datatype
					if (identifyNum >= Byte.MIN_VALUE && identifyNum <= Byte.MAX_VALUE &&
							((identifyBig.compareTo(maxBI) < 0 || identifyBig.compareTo(maxBI) == 0) && 
									(identifyBig.compareTo(minBI) > 0 || identifyBig.compareTo(minBI)==0))) {
						testArray.add("* byte");
					}
					
					// Identifying the minimum and maximum of a 'Short' Datatype
					if (identifyNum >= Short.MIN_VALUE && identifyNum <= Short.MAX_VALUE &&
							((identifyBig.compareTo(maxBI) < 0 || identifyBig.compareTo(maxBI) == 0) && 
									(identifyBig.compareTo(minBI) > 0 || identifyBig.compareTo(minBI)==0))) {
						testArray.add("* short");
					}
					
					// Identifying the minimum and maximum of a 'Int' Datatype
					if (identifyNum >= Integer.MIN_VALUE && identifyNum <= Integer.MAX_VALUE &&
							((identifyBig.compareTo(maxBI) < 0 || identifyBig.compareTo(maxBI) == 0) && 
									(identifyBig.compareTo(minBI) > 0 || identifyBig.compareTo(minBI)==0))) {
						testArray.add("* int");
					}
					
					// Identifying the minimum and maximum of a 'Long' Datatype
					if (identifyNum >= Long.MIN_VALUE && identifyNum <= Long.MAX_VALUE && 
							//input >= min && input <= max && input < max && input > min
							((identifyBig.compareTo(maxBI) < 0 || identifyBig.compareTo(maxBI) == 0) && 
									(identifyBig.compareTo(minBI) > 0 || identifyBig.compareTo(minBI)==0))) {
						testArray.add("* long");
					}
					
					// Identifying the minimum and maximum of an 'out-of-range' Datatype
					
				} // End 'For' Loop [numOfInputs]
					
				// Output Datatype declaration Loop for each Input
				for (String printOut : testArray) {	
				System.out.println(printOut);
					dataTypeTestLoop = true;
				}
				
				// Catching execeptions in case of error
			} catch (Exception e) {
			} // End 'Catch'
				
		} // End 'While Loop' [dataTypeTestLoop]
	}// End 'main' method []
} // End Solution class [Solution]
