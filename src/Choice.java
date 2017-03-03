public class Choice {

	public String text;
	//public Action action;
	
	public Choice(String text/*, Action action*/){
		this.text = text;
		//this.action = action;
	}
	
	public static Choice[] getTab(Choice A, Choice B, Choice C, Choice D){
		Choice[] choices = new Choice[4];
		choices[0] = A;
		choices[1] = B;
		choices[2] = C;
		choices[3] = D;
		return choices;
	}
	
}
