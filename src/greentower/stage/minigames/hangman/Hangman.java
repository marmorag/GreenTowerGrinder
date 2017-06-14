package greentower.stage.minigames.hangman;
/**
 * @author Guillaume
 *
 */
public class Hangman extends MiniGame{
	/**
	 * Error number of current game
	 */
	private int nbError;
	/**
	 * Move number of current game
	 */
	private int nbTurn;
	/**
	 * Random word chosen
	 */
	private String wordToFind;
	/**
	 * WordToFind copy but letters are replaced by _
	 * until player has not found the correct letter
	 */
	private String wordToDisplay;
	/**
	 *	motATrouver takes value of word at line nbAleatoire in listeMot.txt
	 *	Initialize motAAfficher with "_"
	 */
	public Hangman(String dialog, int stageIndex)
	{
		super(dialog, stageIndex);	
		Random r = new Random();
		int randomNumber = r.nextInt(835); // Replace 835 by the line number of listeMot.txt ?
		int i = 0;
		this.nbError = 0;
		this.nbTurn = 0;
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/greentower/stage/minigames/hangman/wordList.txt")));
			String row;
			while ((row=br.readLine())!=null && i < randomNumber)
				i++;
			this.wordToFind = row;
			this.wordToDisplay = this.wordToFind.replaceAll(".", "_");
			br.close();
		}
		catch (Exception FileReadException)
		{
			System.out.println(FileReadException.toString());
		}
	}
	/**
	 * @param inputLetter Letter entered by the player
	 * @return true if letter is in word, false if not
	 */
	public boolean checkLetter(char inputLetter)
	{
		CharSequence letter = (""+inputLetter).toUpperCase();
		if(this.wordToFind.contains(letter))
		{
			this.updateDisplayWord(inputLetter);
			this.nbTurn++;
			return true;
		}
		return false;
	}
	/**
	 * Update display word (motAAfficher) in function of letters found
	 * @param inputLetter
	 */
	private void updateDisplayWord(char inputLetter)
	{
		char[] tempArray = new char[this.wordToDisplay.length()];
		int i;
		for(i = 0;i < this.wordToFind.length();i++)
		this.wordToDisplay = "";
		for(i = 0;i < this.wordToFind.length();i++)
		{
			if(this.wordToFind.charAt(i) == inputLetter)
				tempArray[i] = this.wordToFind.charAt(i);
			this.wordToDisplay = this.wordToDisplay + tempArray[i];
		}
	}
	/**
	 * @return true if all "_" have been replaced (all letters are found) in motAAfficher
	 * false if not
	 */
	private boolean endOfGame()
	{
		return(!this.wordToDisplay.contains("_"));
	}
	/**
	 * Main procedure which launch miniGame
	 * @param display The current displaying methods
	 * @return int The index of the nextStage to play (Logical ling between Stage)
	 */
	public int playStage(Output display, Input input)
	{
		
		display.showStageIntroduction(this.index);
		while(!this.endOfGame() && this.nbTurn <= this.wordToFind.length()+5 &&  this.nbError < 11)
		{
			this.outputTool.showHangman(this.nbError,this.wordToDisplay);
			this.outputTool.getChar();
			inputLetter = (""+this.inputTool.inputChar()).toUpperCase().charAt(0);
			if(!this.checkLetter(inputLetter))
			{
				this.outputTool.letterError();
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException e)
				{
					//NO PROBLEM
				}
				this.nbError++;
			}
		}
		int result;
		if(this.endOfGame())
		{
		else
		{
		display.showMiniGameResult(result);
		display.showStageEnd(this.index);
		return result;
	}
	@Override
	public void init() 
	{
		Random r = new Random();
		int randomNumber = r.nextInt(835); // Replace 835 by the line number of listeMot.txt ?
		int i = 0;
		this.nbError = 0;
		this.nbTurn = 0;
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/greentower/minigames/hangman/listeMot.txt")));
			String row;
			while ((row=br.readLine())!=null && i < randomNumber)
				i++;
			this.wordToFind = row;
			this.wordToDisplay = this.wordToFind.replaceAll(".", "_");
			br.close();
		}
		catch (Exception FileReadException)
		{
			System.out.println(FileReadException.toString());
		}
	}
	/**
	 * Permits to get the word that player need to find
	 * @return attribute motATrouver
	 */
	public String getWordToFind() {
		return wordToFind;
	}
	/**
	 * Permits to set the word that player need to find
	 * @param wordToFind attribute motATrouver
	 */
	public void setWordToFind(String wordToFind) {
		this.wordToFind = wordToFind;
	}
}