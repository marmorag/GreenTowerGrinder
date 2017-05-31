package greentower.core.launcher;

import greentower.IO.Input;
import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.minigames.pendu.InputConsolePendu;
import greentower.minigames.pendu.OutputConsolePendu;
import greentower.minigames.pendu.Pendu;

/**
 * Main class of the game.
 * Entry point of the application.
 * @author Florent
 *
 */
public class Main
{
	/**
	 * Entry point
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("****** BIENVENUE DANS THE GREEN TOWER GRINDER ******");
		//Tower tower = new Tower(ListOfStages.stages, ListOfStages.nextStages);

		//new Game(new Player("Coucou"), new OutputConsole()).play();
		Pendu pendu = new Pendu(new OutputConsolePendu(), new InputConsolePendu(), Dialog.DIALOG_STAGE1);
		System.out.println("ici");
		System.out.println(pendu.playStage());
		System.out.println("la");

	}
}
