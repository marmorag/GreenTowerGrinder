package greentower.stage.minigames.rushhour;
import java.io.Serializable;

/**
 * Position on 2 axis (abscissa and ordinate)
 * @author gavinr
 */
public class Position implements Serializable{

	/**
	 * Serial Version id
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Abscissa
	 */
	private int x;
	/**
	 * Ordinate
	 */
	private int y;

	/**
	 * Create a position with 2 coordinates
	 * @param x abscissa
	 * @param y ordinate
	 */
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * Return abscissa position
	 * @return abscissa
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * Return ordinate position
	 * @return ordinate
	 */
	public int getY()
	{
		return this.y;
	}

	/**
	 * @param x
	 */
	public void setX(int x)
	{
		this.x = x;
	}

	/**
	 * @param y
	 */
	public void setY(int y)
	{
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "Position [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}



	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	/**
	 * @param dir direction of the car
	 * @return the next position according to the direction
	 */
	protected Position getNextPosition(Direction dir)
	{
		return new Position(this.getX()+dir.getX(), this.getY()+dir.getY());
	}

	/**
	 * @param dir direction of the car
	 * @return the previous position according to the direction
	 */
	protected Position getPreviousPosition(Direction dir)
	{
		return new Position(this.getX()-dir.getX(), this.getY()-dir.getY());
	}
}
