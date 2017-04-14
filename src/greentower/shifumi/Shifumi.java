package greentower.shifumi;

/*
 * 
 * @authors Gavin Rémi & Barama Rayan
 */
public class Shifumi {
	
	/*
	 * Return if player win or not
	 * @param {String} Player's sign
	 * @return true if player win and false if not
	 */
	public static boolean play(String sign){
		
		//transform string -> Sign
		Sign playersign = Sign.valueOf(sign);
		Sign random = Sign.getRandom();
		
		//Test all possibilities of shifumi
		if(playersign == Sign.PAPER){
			if(random == Sign.ROCK){
				return true;
			}
			else{
				return false;
			}
		}
		else if(playersign == Sign.ROCK){
			if(random == Sign.PAPER){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			if(random == Sign.ROCK){
				return false;
			}
			else{
				return true;
			}
		}
	}
	
}
