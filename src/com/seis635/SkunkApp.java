package com.seis635;

import java.util.Random;

public class SkunkApp {
    private static Random rand = new Random();
	public static void main(String[] args) {

		String again; // To control the loop

		// rolling the dice.
		{
			System.out.println("Rolling");
			int die1 = rand.nextInt(6) + 1;
			int die2 = rand.nextInt(6) + 1;
			System.out.println("dice 1");
			System.out.println(die1);
			System.out.println("dice 2");
			System.out.println(die2);

		}
	}
	public int rollDie() {
	    int die = this.rand.nextInt(6) + 1;
        return die;
    }


}