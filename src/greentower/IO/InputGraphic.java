package greentower.IO;

import greentower.stage.minigames.rushhour.Direction;
import greentower.stage.minigames.rushhour.GameBoard;

public class InputGraphic implements Input{

	protected OutputGraphic output;
	
	public InputGraphic(OutputGraphic output)
	{
		this.output = output;
	}

	@Override
	public String inputString() 
	{
		this.output.showPrompt();
		while(!this.output.mainWindow.getConsole().getIsPressed())
		{
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.output.mainWindow.getConsole().resetAction();
		return this.output.mainWindow.getConsole().getInput();
	}
	
	@Override
	public char inputChar() {
		String str = this.inputString();
		if (str.length() != 1)
			return Input.INVALID_CHAR_INPUT;
		
		return str.charAt(0);
	}

	@Override
	public int inputInt() {
		char[] figures = {'0', '1', '2', '3','4','5','6','7','8','9'};
		String str = this.inputString();
		if (str.length() != 1)
			return Input.INVALID_INT_INPUT;
		
		boolean isInt = false;
		for(int i = 0; i < figures.length; i++)
			if (figures[i] == str.charAt(0))
				isInt = true;
		
		if(!isInt) return Input.INVALID_INT_INPUT;
		
		return Integer.parseInt(str);
	}

	@Override
	public int getCar(GameBoard board) {
		int car = this.inputInt();
		while(car<0 && car>board.getCars().length){
			car = this.inputInt();
		}
		return car;
	}

	@Override
	public Direction getDirection() {
		Direction direction = null;
		while(direction == null)
			try{
				direction = Direction.valueOf(this.inputString());
			}catch(Exception e){
				e.printStackTrace();
			}
		return direction;
	}

	@Override
	public int getMove() {
		return this.inputInt();
	}

}
