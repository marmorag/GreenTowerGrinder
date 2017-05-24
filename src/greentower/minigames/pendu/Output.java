package greentower.minigames.pendu;
/**
 * 
 * @author Guillaume
 *
 */
public interface Output {
	/**
	 * Display the game's current state in ASCII art
	 * @param nbErr the current number f error to display
	 * @param motAAfficher	the actualized word to display, masked
	 */
	public void afficherPendu(int nbErr, String motAAfficher);
	
	/**
	 * Ask to input a character
	 */
	public void demanderCaractere();

	/**
	 * Notifiy the player that the given charactere isn't contained in the word
	 */
	public void erreurLettre();

	/**
	 * Notify the player that he loose the game
	 * @param motATrouver 
	 */
	public void notifyLoose(String motATrouver);
	
	/**
	 * Notify the player that he win the game
	 * @param nbCoups 
	 * @param motATrouver 
	 */
	public void notifyWin(int nbCoups, String motATrouver);
}
