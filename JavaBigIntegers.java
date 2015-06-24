/**
 * Challenge: https://www.hackerrank.com/challenges/java-biginteger
 * 
 * Made by Charles M. Chong
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


public class SolutionBigInteger {

	public static void main(String[]args){
	BigInteger bigMax = new BigInteger("99999999999999999999"); 
	BigInteger bigMin = new BigInteger("0");
	
	BigInteger a;
	BigInteger b;
	
	Scanner in = new Scanner(System.in);
	
	try {
	a = in.nextBigInteger();
	b = in.nextBigInteger();
	
	// Rules for Relational Operators for Big Integers
	// For equality, use left.compareTo(right) == 0.
	// For less than, use left.compareTo(right) < 0.
	// For greater than, use left.compareTo(right) > 0.	
	
	if (((a.compareTo(bigMax) == 0 || a.compareTo(bigMax) < 0) && 
			(a.compareTo(bigMin) == 0 || a.compareTo(bigMin) > 0)) && ((b.compareTo(bigMax) == 0 || b.compareTo(bigMax) < 0) && 
					(b.compareTo(bigMin) == 0 || b.compareTo(bigMin) > 0))){
	System.out.println(a.add(b));
	System.out.println(a.multiply(b));
			}
	else {
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		//System.out.println("Must enter value less than 20 characters long.");
	}
	
	}
	catch (Exception e){
		System.out.println(e.toString());
	}
	}
	
}
