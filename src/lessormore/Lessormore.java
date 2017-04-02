package lessormore;

public class Lessormore {

	/*
	 * This class represent a Lessormore game
	 * @author Rayan Barama
	 */
	
	
	/*
	 * the first card which is randomly picked
	 */
	public static int base = (int)(Math.random() * (10-1)) + 1;
	/*
	 * the new card which is randomly picked
	 */
	public static int randomcard = (int)(Math.random() * (10-1)) + 1;


	/*
	 * return if player win or not
	 * @param {String} User decision
	 * @return {boolean} true if the game is won and false if not
	 */ 
	public static boolean play(String userChoice){

		if(userChoice.equals("MORE")){
			if(randomcard<base)
				return false;
			else
				return true;
		}
		else if(userChoice.equals("LESS")){
			if(randomcard<base)
				return true;
			else
				return false;
		}
		else
			return false;
	}
}
