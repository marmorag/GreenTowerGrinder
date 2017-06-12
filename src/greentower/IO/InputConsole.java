package greentower.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import greentower.stage.minigames.rushhour.Direction;
import greentower.stage.minigames.rushhour.GameBoard;


/**
 * 
 * @author Guillaume
 *
 */
public class InputConsole implements Input
{	
	/**
	 * Tool used to input
	 */
	private BufferedReader br;
	
	/**
	 * Default constructor, create an BufferedReader from the standards input
	 */
	public InputConsole()
	{
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public int inputInt()
	{
		try
		{	
			char[] figures = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
			OutputConsole.showPromptS();
			String str = this.br.readLine();
			if (str.length() <  1)
				return Input.INVALID_INT_INPUT;
			
			for(int i=0;i<str.length();i++)
			{
				boolean a = false;
				for(int j=0;j<figures.length;j++)
				{
					if(str.charAt(i) == figures[j])
						a = true;
				}
				if(!a)
					return Input.INVALID_INT_INPUT;
			}
			
			return Integer.parseInt(str);
			} 
		catch (IOException e)
		{
			return Input.INVALID_INT_INPUT;
		}
	}
	
	@Override
	public char inputChar()
	{
		try
		{
			OutputConsole.showPromptS();
			String str = this.inputString();
			if (str.length() !=  1)
				return Input.INVALID_CHAR_INPUT;
			
			return this.br.readLine().charAt(0);
		} 
		catch (IOException e)
		{
			return '\0';
		}
	}
	
	public String inputString()
	{
		try
		{
			OutputConsole.showPromptS();
			return this.br.readLine();
		} catch (IOException e)
		{
			return "";
		}
	}
	
	public int getCar(GameBoard board)
	{
		int numCar = -1;
		while(numCar < 0 || numCar > board.numberOfCar()){
			try
			{
				numCar = this.inputInt();
			}
			catch (NumberFormatException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return numCar;
	}
	
	/**
	 * Return direction-entry from player
	 */
	@Override
	public Direction getDirection()
	{
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
		System.out.println("Entrez le déplacement :");
		try
		{
			return this.inputInt();
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
