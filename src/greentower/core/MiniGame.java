package greentower.core;
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

	}

	/**
	 * Allows to display who won the game
	 */
	protected void displayWinner(){

	}


}
