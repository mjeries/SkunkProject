package com.seis635;

import java.util.Random;

public class SkunkApp {

	public void Skunkobjects() {
		 
Random die1 = new Random();
Random die2 = new Random();

Random die3 = new Random();
Random die4 = new Random();

int counter;
int hrolls = 10;
int sides = 6;


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




int rollTotal = x+ y;
int rollTotal2 = p+ q;
int overalltotal = rollTotal;




System.out.println("-The dice total for player 1 = "   + rollTotal);





System.out.println("-The dice total for player 2 = "   + rollTotal2);

//" overall total"
}}}
// changing committer name to darius nyaundi from seis-602-fall2017 