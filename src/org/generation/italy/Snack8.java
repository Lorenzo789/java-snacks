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
		int biggestValueAbs = Integer.MIN_VALUE;
		int biggestValue = Integer.MIN_VALUE;
		int smallestValue = Integer.MAX_VALUE;
		int sum = 0;
		
		int[] randomArray = new int[10];

		for (int x = 0; x < randomArray.length; x++) {
			
			randomArray[x] = rnd.nextInt(-50, 50);
			
			int absNumbers = Math.abs(randomArray[x]);
			int numbers = randomArray[x];
			
			if (absNumbers > biggestValueAbs) {
				
				biggestValueAbs = absNumbers;
				biggestValue = numbers;
				
			} else if (absNumbers < smallestValue) {
				
				smallestValue = absNumbers;
				
			}
			
			if (randomArray[x] % 5 == 0) {
				
				sum += randomArray[x];
				
			}
			
			
			
		}
		System.out.println("the sum is: " + sum);
		System.out.println("the biggest value is: " + biggestValue);
		System.out.println("the smallest value is: " + smallestValue);
	}
}
