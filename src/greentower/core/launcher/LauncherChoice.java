package greentower.core.launcher;

import greentower.core.Choice;
import greentower.core.Dialog;
import greentower.core.Stage;
import greentower.minigames.lessormore.LessOrMore;

/**
 * Main class of the game.
 * Entry point of the application.
 * @author Florent
 *
 */
public class LauncherChoice
{

	/**
	 * Entry point
	 * @param args
	 */
	public static void main(String[] args)
	{
		Choice ChoiceA = new Choice(new Dialog(new String[] {"Salut", "Choisis ta réponse"}), new String[] {"A", "B", "C"}, new Stage[] {new LessOrMore(1), null, null});
		System.out.println(ChoiceA);
		ChoiceA.playStage();
	}

}
