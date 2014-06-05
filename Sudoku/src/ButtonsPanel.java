
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * A class that creates a panel to hold the different types 
 * of buttons that could be used by the user
 * @author James Perry
 */
public class ButtonsPanel extends JPanel {
    
    StartButton start;
    SolveButton solve;
    ClearButton clear;
    CheckButton check;
    HintButton hint;
    JTextField jtf;
    Panel p;
    
    public ButtonsPanel(Panel p){
        this.p = p;
       
        jtf = new JTextField();
        jtf.setText("                ");
        clear = new ClearButton(p, jtf);
        solve = new SolveButton(p);
        start = new StartButton(p);
        check = new CheckButton(p,jtf);
        hint = new HintButton(p);
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(start);
        add(hint);
        add(solve);
        add(clear);
       add(check);
        add(jtf);
              
        
    }
    
    
}