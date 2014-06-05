

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * represents a button that begins the sudoku game
 * by creating a sudokuboard and displaying a certain
 * percentage of the numbers on the GUI
 * @author James Perry
 */
public class StartButton extends JButton implements ActionListener {
	Panel panel;
        

	/**
	 * Creates a new solve button.
	 * 
	 * @param sp
	 *            the sudoku panel the button is going to interact with
	 */
	public StartButton(Panel sp) {
		super("START");                
		panel = sp;
		addActionListener(this);
	}

	/**
	 * Called when the button is clicked.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.start();
                

	}
        
       
}