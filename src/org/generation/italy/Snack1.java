package org.generation.italy;

import java.util.Scanner;

//Inserisci un numero, se è pari stampa il numero,
//se è dispari stampa il numero successivo.

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inerisci un numero: ");
		int numberQuestion = sc.nextInt();
		
		sc.close();
		
		if (numberQuestion % 2 == 0) {
			
			System.out.println(numberQuestion);
			
		} else {
			
			System.out.println(numberQuestion + 1);
			
		}
	}
}
