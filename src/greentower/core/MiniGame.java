package greentower.core;

/**
 * This class represents Mini Game' basement
 *
 * @author Axelle
 *
 */
public abstract class MiniGame extends Stage
{
	/**
	 * Mini Game's contructor
	 */
	protected MiniGame()
	{
	}

	/**
	 * Allows to play game
	 * @return
	 * 			Index of next stage
	 */
	public int playStage(){
		return 0; //For example
	}
}
