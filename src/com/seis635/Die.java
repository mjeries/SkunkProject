package com.seis635;

import java.util.Random;

public class Die {
	public static int numberOfSides = 6;
	int rollDice2() {

        int result;
        Random randomNumberGenerator = new Random();
        result = randomNumberGenerator.nextInt(numberOfSides) + 1;
        return result;
}}
