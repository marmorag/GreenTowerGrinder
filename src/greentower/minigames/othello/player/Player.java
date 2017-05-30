package greentower.minigames.othello.player;

import greentower.minigames.othello.core.Position;

/**
 * This interface enables user to play to othello
 * @author viognef
 *
 */
public interface Player
{
	/**
	 * Enable a player to ask a position where to place a pawn
	 *
	 * @return The asked position
	 */
	public Position askForPosition();
}
