package headsOrTails;

import java.util.Random;

import hotkey.Hotkey;

public class HeadsOrTails {
	
	public static final int HEADS = 0; //Enum ?
	public static final int TAILS = 1;

	public static boolean play(int player){
		if((int) new Random().nextInt(2) == player){
			return true;
		}
		return false;
	}
	
	//TEST
	public static void main(String[] args) {
		if(HeadsOrTails.play(HEADS)){
			System.out.println("Bravo");
		}else{
			System.out.println("Dommage");
		}
	}
	
}
