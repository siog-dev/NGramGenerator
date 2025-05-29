package ie.atu.sw;

import java.util.Arrays;

public class NGramGenerator {
	
	// JOHNS SOLUTION
	public String[] getNGrams(String s, int n) {
		String[] ngrams = new String[s.length() - n + 1];
		
		for (int i = 0; i <= s.length() - n; i++) {
			ngrams[i] = s.substring(i, i + n);
		}
		
		return ngrams;
	}
	
	public static void main(String[] args) {
		String s = "THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG";
		
		String[] ngrams = new NGramGenerator().getNGrams(s,  4);
		for (String t : ngrams) {
			System.out.println(t);
		}
	}
	
	// MY SOLUTION
	/*
	public String[] getNGrams(String s, int n) {
		String[] result = new String[s.length() - n + 1];
		for (int i = 0; i <= (s.length() - n); i++) {
			result[i] = s.substring(i, i+n);
		}

		return result;
	}
	
	public static void main(String[] args) {
		NGramGenerator ngg = new NGramGenerator();
		String[] s = ngg.getNGrams("HAPPY DAYS!", 4);
		System.out.println(Arrays.toString(s));
	}
	*/
}