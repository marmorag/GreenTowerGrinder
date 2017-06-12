package greentower.stage.minigames.rushhour.IHM;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import greentower.stage.minigames.rushhour.Position;


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
	private int column;
	/**
	 * Row of the table
	 */
	private int row;
	
	/**
	 * table
	 */
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
		Position pos = new Position(this.column, this.row);
		//int NumCar = this.board[0].isAt(pos);
	}


}
