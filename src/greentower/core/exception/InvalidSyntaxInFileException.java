package greentower.core.exception;

/**
 * 
 * @author Guillaume
 *	This exception is thrown if the parser get an invalid line during parsing process
 */
public class InvalidSyntaxInFileException extends Exception
{

	/**
	 * Default constructor of Exception class
	 * @param string Message to display
	 */
	public InvalidSyntaxInFileException(String string)
	{
		super(string);
	}

	/**
	 * Default serial ID
	 */
	private static final long serialVersionUID = 1L;

	
}
