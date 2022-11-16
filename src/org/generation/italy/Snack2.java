package org.generation.italy;

import java.util.Random;

public class Snack2 {
	
	/*
	 * Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
	 *  e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] names = {"Orion", "Tyrion", "Azazel"};
		String[] surnames = {"Drycha", "Skrag", "Grimgor"};
		
		String[] fullNames = new String[3];
		
		for (int i = 0; i < names.length; i++) {
			
			String name = names[i];
			
			int surnameIndex = rnd.nextInt(surnames.length);
			String surname = surnames[surnameIndex];
			
			String fullName = name + " " + surname;
			fullNames[i] = fullName;
			
			System.out.println(fullName);
		}
	}
	
}
