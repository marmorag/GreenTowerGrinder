package greentower.minigames.rushhour;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 *
 * @author gavinr
 *
 */
public class ButtonRenderer extends JButton implements TableCellRenderer
{
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean isFocus, int row, int col){
		this.setText(((JButton) value).getText());
		return this;
	}

}
