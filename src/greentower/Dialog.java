package greentower;

/**
 * This class represents a dialog
 * @author Florent
 *
 */
public class Dialog {

	/**
	 * Text to make the choice
	 */
	private String text;

	/**
	 * Possible choices
	 */
	private Choice[] choices;

	/**
	 * Dialog's constructor with given text and given choices
	 * @param text , text to make the choice
	 * @param choices , possible choices
	 */
	public Dialog(String text, Choice choices[]){
		this.text = text;
		this.choices = choices;
	}

	@Override
	public String toString() {
		String message = "Dialog [text=" + this.text + ", choices=";
		for(int i=0;i<4;i++){
			message = message + this.choices[i].getText() + " ";
		}
		message = message + "]";
		return message;
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
	 * @return the choices
	 */
	public Choice[] getChoices() {
		return this.choices;
	}

	/**
	 * @param choices the choices to set
	 */
	public void setChoices(Choice[] choices) {
		this.choices = choices;
	}



}
