package shifumi;

import java.util.Scanner;

public class Game {

	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String sign = sc.nextLine();
		if(Shifumi.play(sign.toUpperCase()) == true){
			System.out.println("BRAVO!");
		}else{
			System.out.println("Dommage :(");
		}
	}

}
