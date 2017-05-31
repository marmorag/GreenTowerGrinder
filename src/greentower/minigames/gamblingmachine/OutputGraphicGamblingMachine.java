package greentower.minigames.gamblingmachine;

import javax.swing.JPanel;

import greentower.IO.OutputGraphic;

public class OutputGraphicGamblingMachine extends OutputGraphic{
	
		@Override
		public void showGame(){
			this.jp = new JPanel();
			//////
			this.getContentPane().add(this.jp);
		}

}
