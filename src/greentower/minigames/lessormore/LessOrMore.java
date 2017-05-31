package greentower.minigames.lessormore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.MiniGame;

/**
 * This class represent a Less Or More game
 * @author Rayan Barama
 */
public class LessOrMore extends MiniGame
{
	/**
	 * the first card which is randomly picked
	 */
	private int base;
	/**
	 * the new card which is randomly picked
	 */
	private int randomcard;

	/**
	 *
	 */
	private BufferedReader br;

	/**
	 * @param dialog
	 *
	 */
	public LessOrMore(Dialog dialog)
	{
		super(dialog);
		this.base = (int)(Math.random() * (10-1)) + 1;
		this.randomcard = (int)(Math.random() * (10-1)) + 1;
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * return if player win or not
	 *
	 * @return {boolean} true if the game is won and false if not
	 */
	public int playStage(Output display){
		boolean result;

		System.out.println(this.base);
		String userChoice;
		try {
			userChoice = this.br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			userChoice="";
		}
		userChoice = userChoice.toUpperCase();


		if(userChoice.equals("MORE")){
			if(this.randomcard<this.base)
				result = false;
			else
				result = true;
		}
		else if(userChoice.equals("LESS")){
			if(this.randomcard<this.base)
				result = true;
			else
				result = false;
		}
		else
			result = false;

		if(result)
		{
			System.out.println("BRAVO!");
			return 0;
		}
		else
		{
			System.out.println("Dommage :(");
			return 1;
		}

	}
}
