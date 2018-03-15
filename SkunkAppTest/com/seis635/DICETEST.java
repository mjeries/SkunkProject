package com.seis635;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sun.applet.Main;

public class DICETEST {

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
	}
	@Test
	
	public void testdiceroll1returnsunk() {
String result = Dice.skunk2(1); 
assertEquals("numberOfSides", result);
	}


	
		
	
	
		
	}

