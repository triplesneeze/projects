
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * this panel is used to graphically represent the sudokuboard
 * with a two dimensional array of JTextFields
 * @author James Perry
 */
public class Panel extends JPanel {
    
    JTextField[][] jtf;
    SudokuBoard sb;
    boolean started;
    
    public Panel(){
        super();
        
        jtf = new JTextField[9][9];
        sb = new SudokuBoard();
        started = true;
        this.setLayout(new GridLayout(9,9));
                
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                jtf[r][c] = new JTextField(2);  
                Font f = new Font("Dialog", Font.PLAIN, 16);
                        jtf[r][c].setFont(f);
                        jtf[r][c].setHorizontalAlignment(JTextField.CENTER);
               
                
                this.add(jtf[r][c]);
            }            
        }
        
        paint();
        setSize(400,400);
    }
    
    private void paint(){
        for (int r = 3; r < 6; r++) {
            for(int c = 0; c < 3; c++){
                jtf[r][c].setBackground(new Color(200, 200, 200));
            }
            for(int c = 6; c < 9; c++){
                jtf[r][c].setBackground(new Color(200, 200, 200));
            }
        }
        
        for (int c = 3; c < 6; c++) {
            for(int r = 0; r < 3; r++){
                jtf[r][c].setBackground(new Color(200, 200, 200));
            }
            for(int r = 6; r < 9; r++){
                jtf[r][c].setBackground(new Color(200, 200, 200));
            }
        }
        
    }
    
    public void solve(){
        int[][] board = sb.getFinished();
            
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    int num = board[r][c];
                    Font f = new Font("Dialog", Font.PLAIN, 18);
                    jtf[r][c].setFont(f);
                    jtf[r][c].setHorizontalAlignment(JTextField.CENTER);
                    jtf[r][c].setText("" + num);                                                       
                }
            }
    }
    
    public void start(){
        if(sb.solvable()){
            sb.setUpStartBoard(55);
            int[][] board = sb.getStartingBoard();
            
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    int num = board[r][c];
                    if(num != 0){
                        Font f = new Font("Dialog", Font.BOLD, 18);
                        jtf[r][c].setFont(f);
                        jtf[r][c].setHorizontalAlignment(JTextField.CENTER);
                        jtf[r][c].setText("" + num);
                       
                      
                  }
                }
            }
          
        }
       
    }
    
    public void clear(){       
            
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    
                        Font f = new Font("Dialog", Font.BOLD, 18);
                        jtf[r][c].setFont(f);
                        jtf[r][c].setHorizontalAlignment(JTextField.CENTER);
                        jtf[r][c].setText("");
                       
                      
                  }
                }
            sb = new SudokuBoard();
    }
    
    public boolean verify(){
        
        int[][] fin = sb.getFinished();
    
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                String s = jtf[r][c].getText();
                int test = fin[r][c];
                String t = "" + test;
                if(!s.equals(t)){
                    return false;
                }
            }
        }
        return true;
    }
    
   
    public void fillEmpty(){
        int x = 0;
        int y = 0;
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                String s = jtf[r][c].getText();
                
                if(s.equals("") && x == 0 && y == 0){
                    x = r;
                    y = c;
                    
                }
               
            }
        }
        
        int[][] b = sb.getFinished();
        String s = "" + b[x][y];
        jtf[x][y].setText(s);
    }
        

}