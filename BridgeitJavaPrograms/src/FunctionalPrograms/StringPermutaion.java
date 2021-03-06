/*************************************************************************************************************
 * 
 * @purpose	:String permutation 
 * 
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 08-04-2019
 */


package FunctionalPrograms;

import bridgeit.util.Utility;

public class StringPermutaion {

	public static void main(String args[]) {
		String s=Utility.getString();
		permutation(s);
	}

	/* * A method exposed to client to calculate permutation of String in Java. */
	public static void permutation(String input) {
		permutation("", input);
	}

	/*
	 * * Recursive method which actually prints all permutations * of given String,
	 * but since we are passing an empty String * as current permutation to start
	 * with, * I have made this method private and didn't exposed it to client.
	 */ private static void permutation(String perm, String input) {
		 if (input.isEmpty()) { 
			 System.out.println(perm + input); 
			 } else { 
				 for (int i = 0; i < input.length(); i++) {
					 permutation(perm + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length())); } } }
	
}