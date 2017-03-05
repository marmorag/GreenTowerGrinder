/**
 * Main class of the game. 
 * Entry point of the application.
 * @author Florent
 *
 */
public class TowerClimber {

	/**
	 * Entry point
	 * @param args
	 */
	public static void main(String[] args) {
		
		Action action1 = new Action();
		Action action2 = new Action();
		Action action3 = new Action();
		Action action4 = new Action();
		
		Choice A = new Choice("1", action1);
		Choice B = new Choice("2", action2);
		Choice C = new Choice("3", action3);
		Choice D = new Choice("4", action4);
		
		Choice[] choices = Choice.getTab(A, B, C, D);
		
		Dialog dialog = new Dialog("ESSAI", choices);
		System.out.println(dialog.toString());
	}

}
