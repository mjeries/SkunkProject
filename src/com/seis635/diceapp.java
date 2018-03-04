package com.seis635;

import java.util.Random;

public class diceapp {
	public void dicepp() {
	Random die1 = new Random();
	Random die2 = new Random();

	Random die3 = new Random();
	Random die4 = new Random();

	int counter;
	int hrolls = 10;
	int sides = 6;{


	for(counter=0; counter < hrolls; ++counter) {
		int rollnumber = counter +1;
		int x = die1.nextInt(sides);
	++x;

	int y = die2.nextInt(sides);
	++ y;





	int p = die3.nextInt(sides);
	++p;

	int q = die4.nextInt(sides);
	++ q;
	int count = 0;
	boolean snakeyes = x + y > 2.1;
	boolean snakeyess = p + q > 2.1;
	
	  if (x == 1 && y == 1) 
	        // check for snake eyes
          count++;
 
System.out.println ("You rolled snake eyes " + snakeyes + " out of " + count + " rolls.");
int snakeEyesCount = 0;

	if (x.getLastRoll() == 2)
		snakeEyesCount++;
	if (dice1.getLastRoll() == 2)
		snakeEyesCount++;
}

StdOut.println("Actual count: " + snakeEyesCount);}}}}