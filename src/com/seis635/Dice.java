package com.seis635;



	import java.util.Random;

	public class Dice {
		
		public static String skunk2(int i) {
		// TODO Auto-generated method stub
		return null;
	}
		
	    private final static int numberOfSides = 6;

	    int rollDice() {

	        int result;
	        Random randomNumberGenerator = new Random();
	        result = randomNumberGenerator.nextInt(numberOfSides) + 1;
	        return result;
	    }

		
		
	}

