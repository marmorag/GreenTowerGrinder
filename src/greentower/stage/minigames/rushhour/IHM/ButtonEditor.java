package greentower.stage.minigames.rushhour.IHM;
import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 * Permits to display buttons
 * @author gavinr
 */
public class ButtonEditor extends DefaultCellEditor
{
	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Button
	 */
	protected JButton button;
	/**
	 * Button
	 */
	private ButtonListener bListener;

	/**
	 * @param checkbox
	 */
	@SuppressWarnings("unqualified-field-access")
	public ButtonEditor(JCheckBox checkbox)
	{
		super(checkbox);
		this.bListener = new ButtonListener();
		this.button = new JButton();
		this.button.setOpaque(true);
		this.button.addActionListener(bListener);
	}

	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int col)
	{
		this.bListener.setRow(row);
		this.bListener.setColumn(col);
		this.bListener.setTable(table);
		this.button.setText((String)((JButton) value).getText());
		return this.button;
	}
}
