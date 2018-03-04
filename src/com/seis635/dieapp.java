package com.seis635;

import java.util.Random;

public class dieapp {
	public void dieobject() {
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
	boolean roll1 = x > 1;
	boolean roll2 = y > 1;
	boolean roll3 = p > 1;
	boolean roll4 = q > 1;
	System.out.println("-Is player 1 die 1 > 1 "   + roll1 );
	System.out.println("-Is player 1 die 2 > 1 "   + roll2);
	System.out.println("-Is player 2 die 1 > 1 "   + roll3 );
	System.out.println("-Is player 2 die 2 > 1 "   + roll4);
}}}}
