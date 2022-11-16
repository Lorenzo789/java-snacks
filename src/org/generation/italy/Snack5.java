package org.generation.italy;

public class Snack5 {

	/*
	 * Dato il seguente array:

		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };

	    trovare il valore minimo
	    trovare il valore massimo
	    calcolare la media
	    calcolare la sommatoria

	 */
	
	public static void main(String[] args) {
		
		int[] array = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		int maxNumber = 0;
		int minNumber = 50;
		int total = 0;
		int avgNumber = 0;
		
		for (int x = 0; x < array.length; x++) {
			
			int numbers = array[x];
			
			total += numbers;
			
			if (numbers > maxNumber) {
				
				maxNumber = numbers;

			} else if (numbers < minNumber) {
				
				minNumber = numbers;
				
			}
		}
		
		avgNumber = total / array.length;
		
		System.out.println("total number is " + total);
		System.out.println("the average is " + avgNumber);
		System.out.println("max number is " + maxNumber);
		System.out.println("min number is " + minNumber);
	}
}
