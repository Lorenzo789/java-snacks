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
		
		for (int x = 0; x < array.length; x++) {
			
			int numbers = array[x];
			
			
			if (numbers > maxNumber) {
				
				maxNumber = numbers;

			} else if (numbers < minNumber) {
				
				minNumber = numbers;
				
			}
		}
		
		System.out.println(maxNumber);
		System.out.println(minNumber);
	}
}
