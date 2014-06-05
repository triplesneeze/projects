
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * this button determines whether or not the 
 * numbers that are currently on the SudokuBoard
 * are a valid solution.
 * SOME BOARDS MAY HAVE MULTIPLE SOLUTIONS (after initial setup)
 * BUT WILL BE CONSIDERED WRONG BECAUSE EACH BOARD ONLY HAS ONE PROGRAMMED SOLUTION
 * ^^^this is due to the way the sudokuboard is imnplemented^^^FIXFIXFIXFIX
 * @author James Perry
 */
public class CheckButton extends JButton implements ActionListener {
    
	Panel panel;
        JTextField jtf;
        

	/**
	 * Creates a new solve button.
	 * 
	 * @param sp
	 *            the sudoku panel the button is going to interact with
	 */
	public CheckButton(Panel sp, JTextField jtf) {
		super("CHECK SOLUTION");
                this.jtf = jtf;
		panel = sp;
		addActionListener(this);
                
	}

	/**
	 * Called when the button is clicked.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
             
		if(panel.verify()){
                    
                    jtf.setText("  RIGHT");
                }
                else{
                    jtf.setText(" WRONG");
                }
                
              
	}
        
       
}
