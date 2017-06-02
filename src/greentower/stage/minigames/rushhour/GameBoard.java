package greentower.stage.minigames.rushhour;

import greentower.stage.minigames.rushhour.exceptions.IncompatibleDirectionException;
import greentower.stage.minigames.rushhour.exceptions.WrongCarException;

/**
 *
 * Create double dimension game board (6x6) and place all cars
 *
 * @author gavinr
 *
 *
 */
public class GameBoard
{
	/**
	 * Width of the gameboard
	 */
	public static final int BOARD_WIDTH = 6;

	/**
	 * Height of the gameboard
	 */
	public static final int BOARD_HEIGHT = 6;

	/**
	 * level of the game
	 */
	private int level;

	/**
	 * cars in the game Red car (important) is at 0 index
	 */
	public Car[] cars;

	/**
	 * Create the board considering the level
	 *
	 * @param level of the game
	 */
	public GameBoard()
	{
		this.createCars();
	}

	/**
	 * Set cars considering the level
	 * @param level of the game
	 */
	private void createCars()
	{
		this.cars = new Car[8];
	    this.cars[0] = new Car(new Position(3, 2), 2, Color.RED, Direction.RIGHT);
		this.cars[1] = new Car(new Position(3, 1), 2, Color.ORANGE, Direction.RIGHT);
		this.cars[2] = new Car(new Position(4, 0), 2, Color.GREEN, Direction.UP);
		this.cars[3] = new Car(new Position(5, 0), 3, Color.YELLOW, Direction.UP);
		this.cars[4] = new Car(new Position(4, 2), 2, Color.BLUE, Direction.UP);
		this.cars[5] = new Car(new Position(2, 3), 3, Color.FUSCHIA, Direction.UP);
		this.cars[6] = new Car(new Position(3, 4), 2, Color.PINK, Direction.UP);
		this.cars[7] = new Car(new Position(5, 4), 2, Color.PURPLE, Direction.RIGHT);
	}

	/**
	 * @param position in the grid
	 * @return -1 if no car is at the position
	 * Otherwise return the number of the car
	 */
	public int getCarNumberAt(Position position)
	{
		for (int car_number = 0; car_number < this.cars.length; car_number++)
		{
			if (this.cars[car_number].isAt(position))
				return car_number;
		}
		return -1;
	}

	/**
	 * Return true if the player has won
	 * @return {boolean} true if the game is finished
	 */
	public boolean isFinish(){	
		return this.cars[0].isAt(new Position(5,2));
	}

	/**
	 * Move car if it's possible
	 * @param numCar index of the car
	 * @param movement of the car
	 * @param offset
	 * @return boolean
	 */
	@SuppressWarnings("javadoc")
	public boolean moveCar(int numCar, Direction movement, int offset) throws WrongCarException{
		if(offset == 0){
			return true;
		}
		// Deep copy of car //
		Car current_car = this.cars[numCar].clone();
		if(current_car == null){
			throw new WrongCarException();
		}


		Position head_pos = null;
		try
		{
			for(int i=1;i<=offset;i++){
				head_pos = current_car.getForwardPositionWhileMoving(movement);
				Position nextPosition = head_pos.getNextPosition(movement);
				if(this.getCarNumberAt(nextPosition) != -1){
					return false;
				}
				else{
					if(nextPosition.getX()<0 || nextPosition.getX()>5 || nextPosition.getY()<0 || nextPosition.getY()>5){
						return false;
					}else{
						current_car.setPosition(current_car.getPosition().getNextPosition(movement));
					}
				}
			}
			this.cars[numCar] = current_car;
			return true;
		}
		catch (IncompatibleDirectionException e) {
			return false;
		}
	}

	/**
	 * Return number of car on the gameboard
	 * @return number of car
	 */
	public int numberOfCar()
	{
		return this.cars.length;
	}

}