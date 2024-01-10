package Desktop;
import javax.swing.*;
import java.awt.*;

public class Chessboard{
    
    JFrame fr = new JFrame("CHESSBOARD"); 
    JButton [][]btn = new JButton[8][8];
    public Chessboard(){

        fr.setSize(800, 700);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        // fr.setLocation(400,100);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to close JVM after exiting frame
        addButton();;
        fr.setVisible(true);

    }

    private void addButton(){

        GridLayout layout = new GridLayout(8,8);
        fr.setLayout(layout);
        for(int i=0; i<8;i++){
            for(int j=0; j<8; j++){

                btn[i][j]=new JButton();
                fr.add(btn[i][j]);
                if((i+j)%2==0){
                    btn[i][j].setBackground(Color.BLACK);
                }else{
                    btn[i][j].setBackground(Color.WHITE);
                }
            }
        }
        setImages();
    }

    private void setImages(){
        ImageIcon bp = new ImageIcon(getClass().getResource("image/bp.gif"));
        ImageIcon wp = new ImageIcon(getClass().getResource("image/wp.gif"));
        for(int i=0;i<8;i++){
                ImageIcon img1 = new ImageIcon(getClass().getResource("image/b"+i+".gif"));
                btn[0][i].setIcon(img1);
                btn[1][i].setIcon(bp);
                ImageIcon img2 = new ImageIcon(getClass().getResource("image/w"+i+".gif"));
                btn[6][i].setIcon(wp); 
                btn[7][i].setIcon(img2);
            }
        }

    public static void main(String[] args) {
        
        new Chessboard();

    }
}
