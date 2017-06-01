package greentower.minigames.rushhour;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;


/**
 * Listen Action button
 *
 * @author gavinr
 *
 */
class ButtonListener implements ActionListener
{
	/**
	 * Column of the table
	 */
	@SuppressWarnings("unused")
	private int column;
	/**
	 * Row of the table
	 */
	@SuppressWarnings("unused")
	private int row;
	/**
	 * table
	 */
	@SuppressWarnings("unused")
	private JTable table;

	/**
	 * Set column number
	 * @param col
	 */
	public void setColumn(int col){
		this.column = col;
	}

	/**
	 * Set row number
	 * @param row
	 */
	public void setRow(int row){
		this.row = row;
	}
	/**
	 *
	 * @param table
	 */
	public void setTable(JTable table){
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		// TO DO when someone hit the button
	}


}
