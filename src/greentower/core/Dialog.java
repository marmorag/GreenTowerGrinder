package greentower.core;

/**
 * This class represents a dialog
 *
 * @author Florent
 *
 */
public enum Dialog {

	/**
	 * Stage 1's dialog
	 */
	DIALOG_STAGE1(new String [] {""}),

	/**
	 * Stage 2's dialog
	 */
	DIALOG_STAGE2(new String[] {""}),

	/**
	 * Stage 3's dialog
	 */
	DIALOG_STAGE3(new String[] {""}),

	/**
	 * Stage 4's dialog
	 */
	DIALOG_STAGE4(new String[] {""}),

	/**
	 * Stage 5's dialog
	 */
	DIALOG_STAGE5(new String[] {""}),

	/**
	 * Stage 6's dialog
	 */
	DIALOG_STAGE6(new String[] {""}),

	/**
	 * Stage 7's dialog
	 */
	DIALOG_STAGE7(new String[] {""}),

	/**
	 * Stage 8's dialog
	 */
	DIALOG_STAGE8(new String[] {""}),

	/**
	 * Stage 9's dialog
	 */
	DIALOG_STAGE9(new String[] {""}),

	/**
	 * Stage 10's dialog
	 */
	DIALOG_STAGE10(new String[] {""}),

	/**
	 * Stage 11's dialog
	 */
	DIALOG_STAGE11(new String[] {""}),

	/**
	 * Stage 12's dialog
	 */
	DIALOG_STAGE12(new String[] {""}),

	/**
	 * Stage 13's dialog
	 */
	DIALOG_STAGE13(new String[] {""}),

	/**
	 * Stage 14's dialog
	 */
	DIALOG_STAGE14(new String[] {""}),

	/**
	 * Stage 15's dialog
	 */
	DIALOG_STAGE15(new String[] {""}),

	/**
	 * Stage 16's dialog
	 */
	DIALOG_STAGE16(new String[] {""}),

	/**
	 * Stage 17's dialog
	 */
	DIALOG_STAGE17(new String[] {""}),

	/**
	 * Stage 18's dialog
	 */
	DIALOG_STAGE18(new String[] {""}),

	/**
	 * Stage 19's dialog
	 */
	DIALOG_STAGE19(new String[] {""}),

	/**
	 * Stage 20's dialog
	 */
	DIALOG_STAGE20(new String[] {""}),

	/**
	 * Stage 21's dialog
	 */
	DIALOG_STAGE21(new String[] {""}),

	/**
	 * Stage 22's dialog
	 */
	DIALOG_STAGE22(new String[] {""}),

	/**
	 * Stage 23's dialog
	 */
	DIALOG_STAGE23(new String[] {""});


	/**
	 * Text to make the choice
	 */
	private String[] dialog;

	/**
	 * Creates a dialog
	 * @param initialDialog
	 * 			Text of the dialog
	 */
	private Dialog(String[] initialDialog)
	{
		this.dialog = initialDialog;
	}

	/**
	 *
	 */
	public String toString()
	{
		String result = null;
		for(int index = 0; index < this.dialog.length; index++)
			result += this.dialog[index] + "\n";
		return result;
	}

}
