package greentower.stage.minigames.othello.player.random;

import java.util.Random;

import greentower.stage.minigames.othello.core.Position;
import greentower.stage.minigames.othello.player.Player;

/**
 * This class represents a random othello's player
 *
 * @author florent.viogne
 *
 */
public class RandomPlayer implements Player
{
	/**
	 * RandomPlayer's constructor
	 */
	public RandomPlayer()
	{
	}

	public Position askForPosition()
	{
		Random random = new Random();
		int line, column;
		line = random.nextInt(20 - 0);
		column = random.nextInt(20 - 0);
		return new Position(line, column);
	}
}
