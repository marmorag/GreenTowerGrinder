package greentower.shifumi;

import java.util.Scanner;

import greentower.core.MiniGame;
import greentower.core.Stage;

/*
 * 
 * @authors Gavin Rémi & Barama Rayan
 */
public class Shifumi extends MiniGame{
	
	public Shifumi(int id)
	{
		super(id);
	}
	
	/*
	 * Return if player win or not
	 * @param {String} Player's sign
	 * @return true if player win and false if not
	 */
	public Stage playStage(){
		
		Scanner sc = new Scanner(System.in);
		String sign = sc.nextLine();
		
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
			return this.nextStages[0];
		}
		else
		{
			System.out.println("Dommage :(");
			return this.nextStages[1];
		}
		
	}
	
}
