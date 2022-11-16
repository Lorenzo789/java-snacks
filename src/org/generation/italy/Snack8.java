package org.generation.italy;

import java.util.Random;

public class Snack8 {
	
	/*
	 * Creare un array di 10 elementi interi random compresi tra -50 e +50 (utilizzare l'oggetto random con seed 128 new Random(128))

		Risultato atteso
		new int[] { 39, -32, -48, 25, 17, -27, 8, -13, -30, 40 }
		
		    trovare il valore assoluto piu' grande e stampare il valore corrispondente
		
		Risultato atteso
		(int) -48
		
		    trovare il valore assoluto piu' piccolo e stampare il valore corrispondente
		
		Risultato atteso
		(int) 8
		
		    calcolare la sommatoria dei valori multipli di 5
		
		Risultato atteso
		(int) 35
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random(128);
		int biggestValue = 0;
		int smallestValue = Integer.MAX_VALUE;
		
		int[] randomArray = new int[10];

		for (int x = 0; x < randomArray.length; x++) {
			
			randomArray[x] = rnd.nextInt(-50, 50);
			
			int numbers = Math.abs(randomArray[x]);
			
			if (numbers > biggestValue) {
				
				biggestValue = numbers;
				
			} else if (numbers < smallestValue) {
				
				smallestValue = numbers;
				
			}
			
			
		}
		System.out.println("the biggest value is: " + biggestValue);
		System.out.println("the smallest value is: " + smallestValue);
	}
}
