package greentower.stage.minigames.shifumi;

import greentower.IO.InputConsole;
import greentower.IO.OutputConsole;

public class testshifumi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Shifumi game = new Shifumi("",1);
		game.playStage(new OutputConsole(),new InputConsole());
	}

}
