package jUnitFlo;

import org.junit.Test;

import greentower.stage.minigames.othello.core.Board;
import greentower.stage.minigames.othello.core.Color;
import greentower.stage.minigames.othello.core.Position;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests the Board class (greentower.stage.minigames.othello.core)
 * 
 * @author florent.viogne
 *
 */
public class TestOthello extends TestCase
{

/**
 * Creates a test of Board with the given name
 * 
 * @param name
 */
	public TestOthello(String name)
	{
		super(name);
	}

	/**
	 * 
	 */
	public void testIsInTheBoard()
	{
		assertEquals(Board.positionIsInTheBoard(new Position(1, 1)), true);
		assertEquals(Board.positionIsInTheBoard(new Position(-1, 0)), false);
		assertEquals(Board.positionIsInTheBoard(new Position(0, 8)), false);
		assertEquals(Board.positionIsInTheBoard(new Position(8, 0)), false);

		assertEquals(Board.positionIsInTheBoard(new Position(0, 0)), true);
		assertEquals(Board.positionIsInTheBoard(new Position(7, 7)), true);
	}
	
	/**
	 * 
	 */
	public void testPositionEquals()
	{
		assertEquals(new Position(1, 1).equals(new Position(1, 1)), true);
		assertEquals(new Position(1, 1).equals(new Position(2, 2)), false);
		assertEquals(new Position(1, 1).equals(new Position(1, 2)), false);
		assertEquals(new Position(1, 1).equals(new Board()), false);
		assertEquals(new Position(1, 1).equals(5), false);
	}
	
	/**
	 * 
	 */
	public void testActionIsValid()
	{
		assertEquals(new Board().actionIsValid(new Position(2, 4), Color.WHITE), true);
		assertEquals(new Board().actionIsValid(new Position(-1, 0), Color.WHITE), false);
		assertEquals(new Board().actionIsValid(new Position(5, 4), Color.BLACK), true);
		assertEquals(new Board().actionIsValid(new Position(3, 3), Color.WHITE), false);
		assertEquals(new Board().actionIsValid(new Position(2, 3), Color.WHITE), false);
	}
	
	/**
	 * @return
	 */
	public static TestSuite suite()
	{
		return new TestSuite(TestOthello.class);
	}
}
