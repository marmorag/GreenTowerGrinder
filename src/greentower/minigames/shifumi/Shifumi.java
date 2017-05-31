package greentower.minigames.shifumi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.MiniGame;

/**
 *
 * @authors Gavin Rémi & Barama Rayan
 */
public class Shifumi extends MiniGame{

	/**
	 *
	 */
	private BufferedReader br;

	/**
	 * @param dialog
	 *
	 */
	public Shifumi(Dialog dialog)
	{
		super(dialog);
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Return if player win or not
	 * @return true if player win and false if not
	 */
	public int playStage(Output display){

		String sign;
		try {
			sign = this.br.readLine();
		} catch (IOException e) {
			sign = "";
		}

		boolean result;
		//transform string -> Sign
		Sign playersign = Sign.valueOf(sign);
		Sign random = Sign.getRandom();

		//Test all possibilities of shifumi
		if(playersign == Sign.PAPER){
			if(random == Sign.ROCK){
				result = true;
			}
			else{
				result = false;
			}
		}
		else if(playersign == Sign.ROCK){
			if(random == Sign.PAPER){
				result = false;
			}
			else{
				result = true;
			}
		}
		else{
			if(random == Sign.ROCK){
				result = false;
			}
			else{
				result = true;
			}
		}

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
