package greentower.minigames.rushhour;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implementation of the game's player into console mode
 * @author gavinr
 */
public class ConsolePlayer extends Player
{
	/**
	 * Scanner to get entries from keyboard player
	 */
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * @param name of the player
	 */
	@SuppressWarnings("hiding")
	public ConsolePlayer(String name)
	{
		super(name);
	}
	
	/**
	 * Return car-entry from player
	 */
	@Override
	public int getCar(GameBoard board)
	{
		int numCar = -1;
		while(numCar < 0 || numCar > board.numberOfCar()){
			System.out.println("Entrez le numéro de la voiture :");
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
		System.out.println("Entrez la direction de déplacement");
		Direction direction = null;
		while(direction == null)
			try{
				direction = Direction.valueOf(this.br.readLine());
			}catch(Exception e){
				System.err.println("Direction invalide");
			}
		return direction;
	}
	
	/**
	 * Return move-entry from player
	 */
	@Override
	public int getMove()
	{
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
