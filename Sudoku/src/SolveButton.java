
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * this button will solve the sudokuboard
 * @author James Perry
 */
public class SolveButton extends JButton implements ActionListener {
	Panel panel;

	/**
	 * Creates a new solve button.
	 * 
	 * @param sp
	 *            the sudoku panel the button is going to interact with
	 */
	public SolveButton(Panel sp) {
		super("SOLVE");
		panel = sp;
		addActionListener(this);
	}

	/**
	 * Called when the button is clicked.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.solve();

	}
}