package com.seis635;

import com.seis635.SkunkApp;

import java.util.Random;

import org.junit.*;

public class dice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		assert(true)
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
	 
	int snakeEyesCount = 0;

		if (x + y == 2)
			snakeEyesCount++;
		}}}
}
