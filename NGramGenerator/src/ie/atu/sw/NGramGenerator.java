package ie.atu.sw;

import java.util.Arrays;

/*
 * An n-gram, also called a k-mer, is a subsequence of 
 * text of size n and can be used for a large variety of 
 * string processing applications. For example the 4-grams 
 * of HAPPY DAYS! are HAPP, APPY, PPY_, PY_D... Create a 
 * class called NGramGenerator that exposes a method with 
 * the signature public String[] getNGrams(String s, int n) 
 * that parses a String s and returns all the n-grams of 
 * size n in a String array.
 */

public class NGramGenerator {
	
	// private String s = "HAPPY DAYS!";
	// private int n = 4;
	
	public String[] getNGrams(String s, int n) {
		/*
		 * 1.	Create a new String array called result
		 * 
		 * 2.	Assign it the value of a new String[]
		 * 
		 * 3.	The amount of values (nGrams) in the array is 
		 * 		the string length minus the length of the 
		 * 		nGrams plus one (s.length() - n + 1)
		 */
		String[] result = new String[s.length() - n + 1];
		// Loop over the array up to the last start position (s.length() - n)
		for (int i = 0; i <= (s.length() - n); i++) {
			// Get the nGrams from the array using substring, assign them to result
			result[i] = s.substring(i, i+n);
		}

		return result;
	}
	
	public static void main(String[] args) {
		NGramGenerator ngg = new NGramGenerator();
	}
}