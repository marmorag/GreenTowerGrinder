package greentower.lessormore;

import java.util.Scanner;

public class Maintest {


	public static void main(String[] args) {
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