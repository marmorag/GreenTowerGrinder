package greentower.minigames.rushhour.IHM;
import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 *
 * @author gavinr
 *
 */
public class ButtonEditor extends DefaultCellEditor
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	protected JButton button;
	/**
	 *
	 */
	private ButtonListener bListener = new ButtonListener();

	/**
	 * @param checkbox
	 */
	@SuppressWarnings("unqualified-field-access")
	public ButtonEditor(JCheckBox checkbox){
		super(checkbox);

		this.button = new JButton();
		this.button.setOpaque(true);
		this.button.addActionListener(bListener);
	}

	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int col){
		this.bListener.setRow(row);
		this.bListener.setColumn(col);
		this.bListener.setTable(table);
		this.button.setText((String)((JButton) value).getText());
		return this.button;
	}
}
