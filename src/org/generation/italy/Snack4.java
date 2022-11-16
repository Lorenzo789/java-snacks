package org.generation.italy;

import java.util.Random;

public class Snack4 {

	/*
	 * Crea due array che hanno un numero di elementi diversi. Mostra a video dei nuovi elementi random finchè il numero di elementi presenti
	 *  nell'array che ne ha di meno + quelli mostrati a video non è uguale al numero di elementi presenti nell'array che ne ha di più
		--
		Creare due array di dimensione diversa e stampare un numero di valori interi casuali
 		pari alla differenza di dimensione (es: arr1.length = 3; arr2.length = 10;  --> stampo 7 valori interi casuali)
	 */
	
	
	public static void main(String[] args) {
		
		int[] firstArray = {1, 2, 3, 4, 5,};
		
		int[] secondArray = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		Random rnd = new Random();
		
		int difference = secondArray.length - firstArray.length;
		
		for (int x = 0; x < difference; x++) {
			
			int newNumber = rnd.nextInt(5, 15);
			
			System.out.println(newNumber);
			
		}
		
//		while (firstArray.length <= secondArray.length) {
//			
//			System.out.println(firstArray.length);
//			System.out.println(secondArray.length);
//			
//			int newNumber = rnd.nextInt();
//			System.out.println(newNumber);
//			
//			x++;
//		}
		
	}
}
