package greentower.minigames.pendu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import greentower.IO.Input;

/**
 *
 * @author Guillaume
 *
 */
public class InputConsolePendu implements Input {
	/**
	 * Reader for the input character
	 */
	 private BufferedReader reader;

	/**
	 * Construtor
	 */
	public InputConsolePendu()
	{
		this.reader = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Read the character given by the user
	 */
	public char inputChar()
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
