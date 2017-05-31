package greentower.minigames.gamblingmachine;

import javax.swing.JPanel;

import greentower.IO.OutputGraphic;

/**
 * @author Guillaume
 *
 */
public class OutputGraphicGamblingMachine extends OutputGraphic{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		public void showGame(){
			this.jp = new JPanel();
			//////
			this.getContentPane().add(this.jp);
		}

}
