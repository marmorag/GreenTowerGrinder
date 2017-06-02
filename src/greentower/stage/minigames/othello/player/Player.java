package greentower.stage.minigames.othello.player;

import greentower.IO.Output;
import greentower.stage.minigames.othello.core.Position;

/**
 * This interface enables user to play to othello
 * @author viognef
 *
 */
public interface Player
{
	/**
	 * Enable a player to ask a position where to place a pawn
	 * @param display 
	 *
	 * @return The asked position
	 */
	public Position askForPosition(Output display);
}
