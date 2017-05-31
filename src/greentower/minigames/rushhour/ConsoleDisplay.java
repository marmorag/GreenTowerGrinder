package greentower.minigames.rushhour;
/**
 * Implementation of the game's display into console mode
 * @author gavinr
 */
public class ConsoleDisplay implements Display
{

	/**
	 * Display the gameboard
	 */
	public void showBoard(GameBoard board){
		String grid="";
		for(int y=0;y<GameBoard.BOARD_WIDTH;y++){
			grid += "*************************\n*";
			for(int x=0;x<GameBoard.BOARD_HEIGHT;x++){
				int carNumber = board.getCarNumberAt(new Position(x,y));
				if(carNumber != -1){
					grid += " "+carNumber+" *";
				}else{
					grid += "   *";
				}
			}
			grid += "\n";
		}
		grid += "*************************\n";
		System.out.println(grid);
	}

	/**
	 * Display direction error
	 */
	@Override
	public void wrongDirection()
	{
		System.err.println("Impossible de déplacer la voiture");
	}

	/**
	 * Display win message
	 */
	@Override
	public void win(int level)
	{
		System.out.println("Congratulations, you've won the level"+level);
	}

}
