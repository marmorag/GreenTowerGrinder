
public class TowerClimber {

	public static void main(String[] args) {
		
		Choice A = new Choice("1");
		Choice B = new Choice("2");
		Choice C = new Choice("3");
		Choice D = new Choice("4");
		
		Choice[] choices = Choice.getTab(A, B, C, D);
		
		Dialog dialog = new Dialog("ESSAI", choices);
		System.out.println(dialog.toString());
	}

}
