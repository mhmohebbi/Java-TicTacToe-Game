/**
 *  File Name:      U2A5A1_TicTacToe
 *  Author:         Hossein Mohebbi
 *  Description:    This program uses ArrayLists to create a TicTacToe game with certain modifications to its size

 */
package TiccTac;

import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {
    TicTacEvent tictac = new TicTacEvent(this);
    JPanel row1 = new JPanel();
    JButton[ ] [ ] boxes = new JButton [4][4]; //2-d array to store the values for each square
    JButton play = new JButton ("Play");
    JButton reset = new JButton ("Reset");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("pattern.png");
    int xWin = 0;
    int oWin = 0;
    int ties = 0;
     
    public TicTac() {
        super ("Tic Tac Toe");
        setSize (700,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;

        GridLayout layout1 = new GridLayout(5, 4, 10, 10);
        row1.setLayout(layout1);
        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        
        blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
        blank2.setText("                  Ties: " + ties);
        
        row1.add(blank1);
        row1.add(play);
        row1.add(reset);
        row1.add(blank2);
        add (row1);
        
        reset.addActionListener(tictac);
        play.addActionListener(tictac);
        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }

        setVisible(true);
    }
     
    public static void main(String[] arguments){
        TicTac frame = new TicTac();
    }
}