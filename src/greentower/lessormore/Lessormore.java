package greentower.lessormore;

import java.util.Scanner;

import greentower.core.MiniGame;

/**
 * This class represent a Lessormore game
 * @author Rayan Barama
 */
public class Lessormore extends MiniGame{
	/**
	 * the first card which is randomly picked
	 */
	public static int base;
	/**
	 * the new card which is randomly picked
	 */
	public static int randomcard;

	public Lessormore(int id)
	{
		super(id);
		this.base = (int)(Math.random() * (10-1)) + 1;
		this.randomcard = (int)(Math.random() * (10-1)) + 1;

	}

	/*
	 * return if player win or not
	 * @param {String} User decision
	 * @return {boolean} true if the game is won and false if not
	 */
	public Stage playStage(){
		boolean result;

		System.out.println(Lessormore.base);
		Scanner sc = new Scanner(System.in);
		String userChoice = sc.nextLine();
		userChoice = userChoice.toUpperCase();


		if(userChoice.equals("MORE")){
			if(randomcard<base)
				result = false;
			else
				result = true;
		}
		else if(userChoice.equals("LESS")){
			if(randomcard<base)
				result = true;
			else
				result = false;
		}
		else
			result = false;

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
