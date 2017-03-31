package shifumi;

public class Shifumi {
	
	public static boolean play(String sign){
		
		//Transformation string -> Sign
		Sign playersign = Sign.valueOf(sign);
		Sign random = Sign.getRandom();
		
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
