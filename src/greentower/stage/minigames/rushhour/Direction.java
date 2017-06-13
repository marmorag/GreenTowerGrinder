package greentower.stage.minigames.rushhour;
/**
 * Car direction
 * @author gavinr
 */
public enum Direction{
	/**
	 * Up direction
	 */
	UP(0,-1), 
	/**
	 * Down direction
	 */
	DOWN(0,1), 
	/**
	 * Left direction
	 */
	LEFT(-1,0), 
	/**
	 * Right direction
	 */
	RIGHT(1,0);

	/**
	 * Next x position according to direction
	 */
	private int nextX;
	/**
	 * Next y position according to direction
	 */
	private int nextY;

	/**
	 * @param nextX
	 * @param nextY
	 */
	Direction(int nextX, int nextY){
		this.nextX = nextX;
		this.nextY = nextY;
	}

	/**
	 * @return next X according to the direction
	 */
	public int getX(){
		return this.nextX;
	}

	/**
	 * @return next Y according to the direction
	 */
	public int getY(){
		return this.nextY;
	}
}
