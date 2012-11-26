package BackEnd;

/**
 * 
 * @author Joy. Created Nov 3, 2012.
 */
public interface Backend {

	/**
	 * Returns an array of the names of the slots. If a slot does not have a
	 * player, the name is "Empty".
	 * 
	 * @return slots of number
	 */
	String[] getSlots();

	/**
	 * Returns the name of the text file of the player in slot i
	 * 
	 * @param slot
	 *            number
	 * @return text file name
	 */
	String getPlayer(int i);

	/**
	 * Deletes old file in slot i and creates new file for new player. Returns
	 * the name of the text file of that slot.
	 * 
	 * @param slot
	 *            number
	 * @return text file name
	 */
	String setPlayer(int i);

	/**
	 * Adds the round number and average to the end of the text file.
	 * 
	 * @param slot
	 *            number
	 * @param average
	 *            time in last round
	 * @param average
	 */
	void addInfo(int i, double average);

}
