package greentower.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import greentower.minigames.rushhour.Direction;
import greentower.minigames.rushhour.GameBoard;


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
			return Integer.parseInt(""+this.br.readLine().charAt(0));
		} 
		catch (IOException e)
		{
			return 2;
		}
	}
	
	@Override
	public char inputChar()
	{
		try
		{
			return this.br.readLine().charAt(0);
		} catch (IOException e)
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
