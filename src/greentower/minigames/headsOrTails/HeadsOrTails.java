package greentower.minigames.headsOrTails;

import java.util.Random;
import java.util.Scanner;

import greentower.core.MiniGame;
import greentower.core.Stage;

public class HeadsOrTails extends MiniGame {

	public HeadsOrTails(int id)
	{
		super(id);
	}

	public Stage playStage(){
		int player=-1;
		while(player!=0 || player!=1){
			System.out.println("Veuillez entrer 0 pour pile et 1 pour face : ");
			Scanner sc = new Scanner(System.in);
			String userChoice = sc.nextLine();
			player = Integer.parseInt(userChoice);
			System.out.println("\n");
		}
		if((int) new Random().nextInt(2) == player)
		{
			System.out.println("Bravo");
			return this.nextStages[0];
		}
		System.out.println("Dommage");
		return this.nextStages[1];
	}
}
