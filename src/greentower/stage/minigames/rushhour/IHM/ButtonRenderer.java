package greentower.stage.minigames.rushhour.IHM;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * Permits to develop IHM
 * @author gavinr
 */
public class ButtonRenderer extends JButton implements TableCellRenderer
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean isFocus, int row, int col){
		this.setText(((JButton) value).getText());
		return this;
	}

}
