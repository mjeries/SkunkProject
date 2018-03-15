package com.seis635;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GameTest {
	private int scoreToWin;
	private Player p1;
	  private Player p2;
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
	public void testDisplayGameMenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectGameOption() {
		fail("Not yet implemented");
	}

	@Test
	public void testStartNewGame() {

		String p1Name = "Please enter player one name: ";
		p1 = new Player(p1Name);
		assertNotNull(p1);
		
	}
	{
		String p2Name = "Please enter the maximum score required to win: ";
		p2 = new Player(p2Name);
		assertNotNull(p2);
	}

	@Test
	public void testPlayOneRound() {
		
	}

	@Test
	public void testWhoIsLeading() {
		
		
		assertNotNull(p1);
	}

	@Test
	public void testDisplayGameInstruction() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckIfAnyoneHasWon() {
		
		 if (p1.getTotalScore() >= scoreToWin && p2.getTotalScore() >= scoreToWin)		 
		System.out.println("Its a draw! Both players have exceeded the score limit");
	           assert false;
	}
	@Test
	public void testMain() {
		fail("Not yet implemented");
	}
	
}
