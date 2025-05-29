package ie.atu.sw;

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
	
	private String s = "HAPPY DAYS!";
	private int n = 4;
	
	public String[] getNGrams(String s, int n) {
		return null;
	}
	
	public static void main(String[] args) {
		NGramGenerator ngg = new NGramGenerator();
	}
}