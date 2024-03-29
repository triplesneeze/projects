
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * the GUI that contains the SudokuBoard and the ButtonsPanel
 * @author James Perry
 */
public class GUI {
    
    JFrame frame;
    Panel panel;
    
    ButtonsPanel buttons;
    SudokuBoard sb;
    
    
    public GUI(){
        frame = new JFrame("SUDOKU");
        sb = new SudokuBoard();
        panel = new Panel();
        buttons = new ButtonsPanel(panel);
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
                frame.add(buttons, BorderLayout.SOUTH);
                //frame.add(timer, BorderLayout.NORTH);
                frame.add(new JPanel(),BorderLayout.EAST);
                frame.add(new JPanel(),BorderLayout.WEST);
		

		frame.setResizable(false);
		frame.setVisible(true);
		frame.pack();
                frame.setSize(600, 400);
                
                
        
    }
    
    
    

}
