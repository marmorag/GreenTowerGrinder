package greentower.core;

/**
 * This class represents a dialog
 *
 * @author Florent
 *
 */
public class Dialog {

	/**
	 * Text to make the choice
	 */
	private String[] dialog;

	/**
	 * Creates a dialog
	 * @param initialDialog
	 * 			Text of the dialog
	 */
	public Dialog(String[] initialDialog)
	{
		this.dialog =initialDialog;
	}

	/**
	 *
	 */
	public String toString()
	{
		String result = "[";
		for(int index = 0; index < this.dialog.length; index++)
			result += this.dialog[index] + "\n";
		return result + "]";

	}

}
