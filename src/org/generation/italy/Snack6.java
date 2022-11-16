package org.generation.italy;

public class Snack6 {

	/*
	 * Dati i seguenti array:

		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		    calcolare un array sommatoria dove ogni elemento corrisponde alla somma degli elementi dei due array alla stessa posizione
		
		// Risultato atteso
		new int[] { 112, 95, ... }
	
	    trovare il valore minimo all'interno di entrambi gli array
	    trovare il valore massimo all'interno di entrambi gli array
	    calcolare la media di entrambi gli array (assieme)
	    calcolare la somma di tutti gli elementi di entrambi gli array
	 */
	
	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		int maxNumberArr1 = 0;
		int minNumberArr1 = 50;
		int maxNumberArr2 = 0;
		int minNumberArr2 = 50;
		int total = 0;
		int avgNumber = 0;
		
		
		int[] arraySum = new int[10];
		
		for (int i = 0; i < arraySum.length; i++) {
			
			arraySum[i] = arr1[i] + arr2[i];
			
			System.out.println("sum both array in the same position " + arraySum[i]);
			
			total += arraySum[i];
			
			int numberArr1 = arr1[i];
			int numberArr2 = arr2[i];
			
			if (numberArr1 > maxNumberArr1) {
				
				maxNumberArr1 = numberArr1;

			} else if (numberArr1 < minNumberArr1) {
				
				minNumberArr1 = numberArr1;
			
			}
			
			if (numberArr2 > maxNumberArr2) {
				
				maxNumberArr2 = numberArr2;

			} else if (numberArr2 < minNumberArr2) {
				
				minNumberArr2 = numberArr2;
			
			}
		}
		avgNumber = total / arraySum.length;
		
		
		System.out.println("total number of both the array is " + total);
		System.out.println("the average is " + avgNumber);
		
		System.out.println("max arr1 number is " + maxNumberArr1);
		System.out.println("min arr1 number is " + minNumberArr1);
		
		System.out.println("max arr2 number is " + maxNumberArr2);
		System.out.println("min arr2 number is " + minNumberArr2);
	}
}
