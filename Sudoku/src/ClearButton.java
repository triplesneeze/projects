
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * the clear button will clear the game board of all numbers
 * @author James Perry
 */
public class ClearButton extends JButton implements ActionListener {
	
		Panel sp;
        JTextField jtf;

	/**
	 * Creates a new clear button.
	 * 
	 * @param sp--> the sudoku panel the button is going to interact with
	 */
	public ClearButton(Panel sp, JTextField jtf) {
		super("CLEAR");
		this.sp = sp;
                this.jtf = jtf;
		addActionListener(this);
	}

	

    @Override
    public void actionPerformed(ActionEvent e) {
        sp.clear();
        jtf.setText("  ");
        
    }
        
}