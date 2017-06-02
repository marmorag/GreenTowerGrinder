package greentower.stage.minigames.othello.core;

/**
 * This enumerations lists possible directions in othello
 * @author florent.viogne
 *
 */
public enum Direction
{
	/**
	 * The north direction
	 */
	NORTH(-1,0),

	/**
	 * The south direction
	 */
	SOUTH(1,0),

	/**
	 * The east direction
	 */
	EAST(0,1),

	/**
	 * The west direction
	 */
	WEST(0,-1),

	/**
	 * The northeast direction
	 */
	NORTHEAST(-1,1),

	/**
	 * The northwest direction
	 */
	NORTHWEST(-1,-1),

	/**
	 * The southeast direction
	 */
	SOUTHEAST(1,1),

	/**
	 * The southwest direction
	 */
	SOUTHWEST(1,-1);

	/**
	 * Value to add to line to be in the right direction
	 */
	private int lineDelta;

	/**
	 * Value to add to column to be in the right direction
	 */
	private int columnDelta;

	/**
	 * Default constructor, only it
	 * @param initialLineDelta
	 * 			The direction's lineDelta
	 * @param initialColumnDelta
	 * 			The direction's columnDelta
	 */
	private Direction(int initialLineDelta, int initialColumnDelta)
	{
		this.lineDelta = initialLineDelta;
		this.columnDelta = initialColumnDelta;
	}

	/**
	 * Returns the direction's lineDelta
	 * @return
	 * 			The durection's lineDelta
	 */
	public int getLineDelta()
	{
		return this.lineDelta;
	}

	/**
	 * Returns the direction's columnDelta
	 * @return
	 * 			The durection's columnDelta
	 */
	public int getColumnDelta()
	{
		return this.columnDelta;
	}
}
