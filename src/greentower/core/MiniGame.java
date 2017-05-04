package greentower.core;

import greentower.tictactoe.TicTacToe;

/**
 * This class represents Mini Game' basement
 *
 * @author Axelle
 *
 */
public abstract class MiniGame extends Stage{

	/**
	 * Game's identifier
	 */
	private int id ;

	/**
	 * Mini Game's contructor
	 * @param number
	 */
	public MiniGame(int number){
		this.id = number;
	}

	/**
	 * Allows to play game
	 */
	public Stage playStage(){
		return new TicTacToe(1); //For example
	}

	/**
	 * Allows to display who won the game
	 */
	protected void displayWinner(){

	}


}
