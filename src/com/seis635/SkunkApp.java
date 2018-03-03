package com.seis635;

import java.util.Random;

public class SkunkApp {

	public static void main(String[] args) {
		 
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


boolean roll1 = x > 1;
boolean roll2 = y > 1;
boolean roll3 = p > 1;
boolean roll4 = q > 1;
boolean snakeyes = x + y > 2.1;
boolean snakeyess = p + q > 2.1;
int rollTotal = x+ y;
int rollTotal2 = p+ q;
int overalltotal = rollTotal;

System.out.println("Player 1 Round " + rollnumber + " die 2 rolled a " +y);
System.out.println("Player 1 Round " + rollnumber + " die 1 rolled a " +x);
System.out.println("-Is player 1 die 1 > 1 "   + roll1 );
System.out.println("-Is player 1 die 2 > 1 "   + roll2);
System.out.println("-Player 1 round must total more > 2 or Snake eyes = "   + snakeyes);
System.out.println("-The dice total for player 1 = "   + rollTotal);
System.out.println("");
System.out.println("");

System.out.println("Player 2 Round " + rollnumber + " die 1 rolled a " +p);
System.out.println("Player 2 Round " + rollnumber + " die 2 rolled a " +q);;
System.out.println("-Is player 2 die 1 > 1 "   + roll3 );
System.out.println("-Is player 2 die 2 > 1 "   + roll4);
System.out.println("-Player 2 round must total more > 2 or Snake eyes = "   + snakeyess);
System.out.println("-The dice total for player 2 = "   + rollTotal2);
System.out.println("");
//" overall total"
}}}
// changing committer name to darius nyaundi from seis-602-fall2017 