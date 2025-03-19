package main;

import characters.*;
import characters.Character;


public class Main {

	public static void main(String[] args) {
		
		Character harry = new HarryPotter();
		harry.cast();
		
		Character hermione = new Hermione();
		hermione.cast();
		
		Character ron = new RonWeasley();
		ron.cast();
		
		harry.changeSpell(new Expelliarmus());
		System.out.println("Harry changes to Expelliarmus");
		harry.cast();
	}

}
