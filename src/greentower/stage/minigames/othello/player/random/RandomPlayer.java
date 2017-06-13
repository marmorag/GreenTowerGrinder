package greentower.stage.minigames.othello.player.random;

import java.util.Random;

import greentower.IO.Output;
import greentower.stage.minigames.othello.core.Position;
import greentower.stage.minigames.othello.player.Player;

/**
 * This class represents a random othello's player
 * @author florent.viogne
 */
public class RandomPlayer implements Player{
	/**
	 * RandomPlayer's constructor
	 */
	public RandomPlayer()
	{
		//empty
	}

	@Override
	public Position askForPosition(Output display) 
	{
		Random random = new Random();
		int line, column;
		line = random.nextInt(8);
		column = random.nextInt(8);
		return new Position(line, column);
	}
}
