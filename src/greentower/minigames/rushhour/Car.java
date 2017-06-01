package greentower.minigames.rushhour;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *  Car is an element of the board which can move by the user
 *
 * @author gavinr
 */

@SuppressWarnings("serial")
public class Car implements Serializable
{
	/**
	 * Position of the first case of the car
	 * If horizontal car : the head is the right case
	 * If vertical car : the head is at the top
	 */
	private Position position;

	/**
	 * Car's length
	 */
	private final int length;

	/**
	 * Color of the car
	 */
	private final Color color;

	/**
	 * Direction of the car
	 */
	private Direction direction;

	/**
	 * Instantiate a new car, with given position, length, color and orientation
	 *
	 * @param position of the car
	 * @param length of the car
	 * @param direction of the car
	 * @param color of the car
	 */
	public Car(Position position, int length, Color color, Direction direction)
	{
		this.position = position;
		this.length = length;
		this.color = color;
		this.direction = direction;
	}

	/**
	 * Return car position
	 *
	 * @return car position
	 */
	public Position getPosition()
	{
		return this.position;
	}

	/**
	 * Set new car position
	 * @param position to assign
	 */
	public void setPosition(Position position)
	{
		this.position = position;
	}

	/**
	 * Return car length
	 *
	 * @return car length
	 */
	public int getLength()
	{
		return this.length;
	}

	/**
	 * return car color
	 *
	 * @return car color
	 */
	public Color getColor()
	{
		return this.color;
	}

	/**
	 * Return direction of the car
	 * @return Direction of the car
	 */
	public Direction getDirection(){
		return this.direction;
	}

	/**
	 * Return a table with all car's positions
	 * @return All possible positions of a car
	 */
	private Position[] getAllPositions(){
		Position[] positions = new Position[this.length];
		Position temp = this.getPosition();
		positions[0] = temp;
		for(int i=1;i<this.length;i++){
			positions[i] = temp.getPreviousPosition(this.direction);
			temp = positions[i];
		}
		return positions;
	}

	/**
	 * Return true if car is at the position, false if not
	 *
	 * @param position in the gameboard
	 * @return true if a car is at position, false if not
	 */
	public boolean isAt(Position position){
		Position[] positions = this.getAllPositions();
		for(int index=0;index<positions.length;index++){
			if(positions[index].equals(position))
				return true;
		}
		return false;
	}

	/**
	 * Return forward position of the car
	 * @param movement of the car
	 * @return forward position
	 * @throws IncompatibleDirectionException
	 */
	public Position getForwardPositionWhileMoving(Direction movement) throws IncompatibleDirectionException{
		Position pos = this.getPosition();
		if(this.direction == Direction.UP || this.direction == Direction.DOWN){
			if(movement == Direction.LEFT || movement == Direction.RIGHT){
				throw new IncompatibleDirectionException();
			}else{
				if(this.direction == movement){
					return this.position;
				}else{
					return new Position(pos.getX(),pos.getY()+this.getLength()-1);
				}
			}
		}else{
			if(movement == Direction.UP || movement == Direction.DOWN){
				throw new IncompatibleDirectionException();
			}else{
				if(this.direction == movement){
					return this.position;
				}else{
					return new Position(pos.getX()-this.getLength()+1, pos.getY());
				}
			}
		}
	}

	/**
	 * Clone the car
	 * @return a clone of the car
	 */
	public Car clone(){
		try{
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			return (Car)ois.readObject();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
