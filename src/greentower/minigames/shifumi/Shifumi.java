package greentower.minigames.shifumi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.MiniGame;

/**
 *
 * @authors Gavin Rémi & Barama Rayan
 */
public class Shifumi extends MiniGame{

	/**
	 * Reader for input
	 */
	private BufferedReader br;

	/**
	 * Shifumi's constructor
	 * @param dialog
	 * @param stageIndex 
	 */
	public Shifumi(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Return if player win or not
	 * @return true if player win and false if not
	 * @throws IOException 
	 */
	public int playStage(Output display) throws IOException{
		display.showGame();
		display.showDialog(dialog);

		String sign = this.br.readLine();

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
