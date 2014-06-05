
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * the hint button will randomly choose a cell from the
 * sudokuboard and fill in the correct number
 * @author James Perry
 */
public class HintButton extends JButton implements ActionListener {
	

	Panel sp;
        

	/**
	 * Creates a new clear button.
	 * 
	 * @param sp
	 *            the sudoku panel the button is going to interact with
	 */
	public HintButton(Panel sp) {
		super("HINT");
		this.sp = sp;
                
		addActionListener(this);
	}

	

    @Override
    public void actionPerformed(ActionEvent e) {
        sp.fillEmpty();
        
    }
}
