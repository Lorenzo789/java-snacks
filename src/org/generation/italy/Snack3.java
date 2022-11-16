package org.generation.italy;

public class Snack3 {

	//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
	
	public static void main(String[] args) {
		
		int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for (int x = 0; x < arrayNumbers.length; x++) {
			
			int number = arrayNumbers[x];
//			System.out.println(number);
			
			if (arrayNumbers[x] % 2 != 0) {
				
//				System.out.println(arrayNumbers[x]);
				
				sum = sum + arrayNumbers[x];
				System.out.print(sum);
			}
//			System.out.println(sum);
		}
	}
}
