package greentower.display;

import greentower.core.Dialog;

/**
 * @author gavinr
 *
 */
public class OutputConsole implements Output{

	@Override
	public void showText(Dialog dialog) {
		System.out.println(dialog);
	}

}