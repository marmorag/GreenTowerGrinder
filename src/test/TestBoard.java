package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import greentower.stage.minigames.othello.core.Board;
import greentower.stage.minigames.othello.core.Position;


public class TestBoard {

	@Test
	public void testPositionIsInTheBoard() {
		//fail("Not yet implemented");
		Board board = new Board();
		boolean res;
		
		//test n°1
		Position pos1 = new Position(1,1);
		res = true; //on sait que pos1 appartient à la grille
		
		assertTrue("ERREUR : (1,1) appartient à la grille",Board.positionIsInTheBoard(pos1)==res);
		
		//test n°2
		Position pos2 = new Position(-1,0);
		res = false; //pos2 n'appartient pas à la grille
		
		assertTrue("ERREUR : (-1,0) n'appartient pas à la grille",Board.positionIsInTheBoard(pos2)==res);
		
		//test n°3
		Position pos3 = new Position(0,-1);
		res = false;
		
		assertTrue("ERREUR : (0,-1) n'appartient pas à la grille",Board.positionIsInTheBoard(pos3)==res);
	
		//test n°4
		Position pos4 = new Position(0,8);
		res = false;
		
		assertTrue("ERREUR : (0,8) n'appartient pas à la grille",Board.positionIsInTheBoard(pos4)==res);
	
		//test n°5
		Position pos5 = new Position(8,0);
		res = false;
		
		assertTrue("ERREUR : (8,0) n'appartient pas à la grille",Board.positionIsInTheBoard(pos5)==res);
	
		// !-- CAS LIMITES --!
		
		//test n°6
		Position pos6 = new Position(0,0);
		res = true;
		
		assertTrue("ERREUR : (0,0) appartient à la grille",Board.positionIsInTheBoard(pos6)==res);
	
		//test n°7
		Position pos7 = new Position(7,7);
		res = true;
		
		assertTrue("ERREUR : (7,7) appartient à la grille",Board.positionIsInTheBoard(pos7)==res);
	
	}

}
