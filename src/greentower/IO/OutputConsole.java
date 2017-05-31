package greentower.IO;

import greentower.core.Dialog;

/**
 * Implementation of Output to display in console mode
 * @author gavinr
 * 
 */
public class OutputConsole implements Output{

	@Override
	public void showText(Dialog dialog) {
		System.out.println(dialog);
	}

}
