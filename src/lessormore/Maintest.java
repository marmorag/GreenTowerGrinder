package lessormore;

import java.util.Scanner;

public class Maintest {


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.out.println(Lessormore.base);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String sign = sc.nextLine();
		

		if(Lessormore.play(sign.toUpperCase())){
			System.out.println("BRAVO!");
		}else{
			System.out.println("Dommage :(");
		}

	}

}