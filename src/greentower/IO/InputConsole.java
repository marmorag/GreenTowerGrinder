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
	 * Value when in int's input is invalid
	 */
	public static final int INVALID_INT_INPUT = -1;
	
	/**
	 * Value when in int's input is invalid
	 */
	private static final char INVALID_CHAR_INPUT = '\0';
	
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
			char[] figures = {'0', '1', '2', '3'};
			String str = this.br.readLine();
			if (str.length() !=  1)
				return InputConsole.INVALID_INT_INPUT;
			
			boolean isInt = false;
			for(int i = 0; i < figures.length; i++)
				if (figures[i] == str.charAt(0))
					isInt = true;
			
			if(!isInt) return InputConsole.INVALID_INT_INPUT;
			
			return Integer.parseInt(str);
			} 
		catch (IOException e)
		{
			return InputConsole.INVALID_INT_INPUT;
		}
	}
	
	@Override
	public char inputChar()
	{
		try
		{
			String str = this.br.readLine();
			if (str.length() !=  1)
				return InputConsole.INVALID_CHAR_INPUT;
			
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
				numCar = Integer.parseInt(this.br.readLine());
			}
			catch (NumberFormatException | IOException e)
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
				direction = Direction.valueOf(this.br.readLine());
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
			return Integer.parseInt(this.br.readLine());
		}
		catch (NumberFormatException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
