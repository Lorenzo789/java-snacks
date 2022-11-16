package org.generation.italy;

public class Snack7 {

	/*
	 * Dato il seguente array:

		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };

	    creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine
	    creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine inverso
	    trovare e stampare la parola piu' lunga e la sua lunghezza
	    trovare e stampare la parola piu' corta e la sua lunghezza

	 */
	
	public static void main(String[] args) {
		
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		String sumWord = "";
		String sumBackWord = "";
		String shortestWord = "";
		int lengthOfShortestWord = 0;
		String longestWord = "";
		int lengthOfLongestWord = 0;
		
		// SUM WORD
		for (int x = 0; x < words.length; x++) {
			
			String singleWord = words[x];
			
			sumWord += " " + singleWord;
			
			if (words[x].length() <= 3) {
				
				lengthOfShortestWord = words[x].length();
				shortestWord = words[x];
				
			} else if (words[x].length() > lengthOfLongestWord) {
				
				lengthOfLongestWord = words[x].length();
				longestWord = words[x];
				
			}
			
		}
		// SUM WORD
		
		// SUM WORD BACKWARDS
		for (int y = words.length - 1; y > 0; y--) {
			
			String singleBackWord = words[y];
			
			sumBackWord += " " + singleBackWord;
		}
		// SUM WORD BACKWARDS
		
		
		
		
		//RESULTS
		System.out.println("sum of all word:" + sumWord);
		System.out.println("sum of all BackWord:" + sumBackWord);
		System.out.println("the smallest word is: " + shortestWord + " length: " + lengthOfShortestWord);
		System.out.println("the biggest word is: " + longestWord + " length: " + lengthOfLongestWord);

	}
}
