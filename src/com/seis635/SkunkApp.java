package com.seis635;

import java.util.Random;

public class SkunkApp {

	public static void main(String[] args) {
		 
Random die1 = new Random();
Random die2 = new Random();
int counter;
int hrolls = 10;
int sides = 6;


for(counter=0; counter < hrolls; ++counter) {
	int rollnumber = counter +1;
	int x = die1.nextInt(sides);
++x;
System.out.println("Round " + rollnumber + " die 1 rolled a " +x);
int y = die2.nextInt(sides);
++ y;

System.out.println("Round " + rollnumber + " die 2 rolled a " +y);
boolean roll1 = x > 1;
boolean roll2 = y > 1;
boolean snakeyes = x + y > 2.1;
int rollTotal = x+ y;
System.out.println("-Is die 1 > 1 "   + roll1 );
System.out.println("-Is die 2 > 1 "   + roll2);
System.out.println("-Round must total more > 2 or Snake eyes = "   + snakeyes);
System.out.println("-The dice total for round = "   + rollTotal);
System.out.println("");
}}}
