/**
 * This class represents a choice in the game
 * 
 * @author Florent
 *
 */
public class Choice {

	/**
	 * Choice's text
	 */
	private String text;

	/**
	 * Choice's action
	 */
	private Action action;
	
	/**
	 * Choice's constructor with given action and given text 
	 * @param initialText
	 * @param initialAction
	 */
	public Choice(String initialText, Action initialAction){
		this.text = initialText;
		this.action = initialAction;
	}
	
	/**
	 * @param A
	 * @param B
	 * @param C
	 * @param D
	 * @return choices
	 */
	public static Choice[] getTab(Choice A, Choice B, Choice C, Choice D){
		Choice[] choices = new Choice[4];
		choices[0] = A;
		choices[1] = B;
		choices[2] = C;
		choices[3] = D;
		return choices;
	}
	
	/**
	 * @return the text
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the action
	 */
	public Action getAction() {
		return this.action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(Action action) {
		this.action = action;
	}
	
}
