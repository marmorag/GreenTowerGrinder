package greentower.minigames.pendu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Guillaume
 *
 */
public class InputConsole implements Input {
	/**
	 * Reader for the input character
	 */
	 private BufferedReader reader;

	/**
	 * Construtor
	 */
	public InputConsole()
	{
		this.reader = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Read the character given by the user
	 */
	public char saisirCaractere()
	{
		try
		{
			char letter = (""+this.reader.readLine()).toUpperCase().charAt(0);
			return letter;
		}
		catch (IOException e)
		{
			return 'A';
		}
	}

}
