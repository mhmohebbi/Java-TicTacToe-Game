/**
 *  File Name:      U2A5A1_TicTacToe
 *  Author:         Hossein Mohebbi
 *  Description:    This program uses ArrayLists to create a TicTacToe game with certain modifications to its size
 */
package TiccTac;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TicTacEvent implements ItemListener, ActionListener, Runnable {

    TicTac gui;
    Thread playing;
    ImageIcon a = new ImageIcon("x.jpg");
    ImageIcon b = new ImageIcon("o.jpg");
    ImageIcon back = new ImageIcon("pattern.png");
    int clicks = 0;
    int win = 0;
    int[][] check = new int[4][4];
    int xWin = 0;
    int oWin = 0;
    int ties = 0;
    boolean gameStarted = false;

    public void itemStateChanged(ItemEvent event) {
    }

    public void run() {
    }

    public TicTacEvent(TicTac in) {
        gui = in;
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 3; col++) {
                check[row][col] = 0;
            }
        }
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (command.equals("Reset")) {
            /* resetBoard()
               Pre-Condition: no pre-condition
               Post-Condition: Resets the board
             */
            resetBoard();
        }
        if (command.equals("Play")) {
            startPlaying();
        }
        if (command.equals("1")) {
            b1();
        }
        if (command.equals("2")) {
            b2();
        }
        if (command.equals("3")) {
            b3();
        }
        if (command.equals("4")) {
            b4();
        }
        if (command.equals("5")) {
            b5();
        }
        if (command.equals("6")) {
            b6();
        }
        if (command.equals("7")) {
            b7();
        }
        if (command.equals("8")) {
            b8();
        }
        if (command.equals("9")) {
            b9();
        }
        if (command.equals("10")) {
            b10();
        }
        if (command.equals("11")) {
            b11();
        }
        if (command.equals("12")) {
            b12();
        }
        if (command.equals("13")) {
            b13();
        }
        if (command.equals("14")) {
            b14();
        }
        if (command.equals("15")) {
            b15();
        }
        if (command.equals("16")) {
            b16();
        }

    }

    /* b1() and all other card functions
        Pre-Condition: There is no pre-condition
        Post-Condition: Changes the icon of the card and sets its value to an x or o
     */
    void b1() {
        if (check[0][0] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1; //increases the click counter
            if ((clicks % 2) == 1) { //if it is an odd number click it sets the icon to an x
                /* setIcon()
               Pre-Condition: Takes an ImageIcon
               Post-Condition: Sets the icon of the button to the ImageIcon taken
                 */
                gui.boxes[0][0].setIcon(a);
                check[0][0] = 1;
            } else { //if its even it sets it to an o
                gui.boxes[0][0].setIcon(b);
                check[0][0] = 2;
            }
            /* Winner()
           Pre-Condition: Takes no value
           Post-Condition: Creates a Dialog box saying the winner
             */

            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b2() { //code repeats for each button
        if (check[0][1] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen 
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[0][1].setIcon(a);
                check[0][1] = 1;
            } else {
                gui.boxes[0][1].setIcon(b);
                check[0][1] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b3() {
        if (check[0][2] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[0][2].setIcon(a);
                check[0][2] = 1;
            } else {
                gui.boxes[0][2].setIcon(b);
                check[0][2] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b4() {
        if (check[0][3] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[0][3].setIcon(a);
                check[0][3] = 1;
            } else {
                gui.boxes[0][3].setIcon(b);
                check[0][3] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b5() {
        if (check[1][0] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[1][0].setIcon(a);
                check[1][0] = 1;
            } else {
                gui.boxes[1][0].setIcon(b);
                check[1][0] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b6() {
        if (check[1][1] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[1][1].setIcon(a);
                check[1][1] = 1;
            } else {
                gui.boxes[1][1].setIcon(b);
                check[1][1] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b7() {
        if (check[1][2] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[1][2].setIcon(a);
                check[1][2] = 1;
            } else {
                gui.boxes[1][2].setIcon(b);
                check[1][2] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b8() {
        if (check[1][3] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[1][3].setIcon(a);
                check[1][3] = 1;
            } else {
                gui.boxes[1][3].setIcon(b);
                check[1][3] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b9() {
        if (check[2][0] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[2][0].setIcon(a);
                check[2][0] = 1;
            } else {
                gui.boxes[2][0].setIcon(b);
                check[2][0] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b10() {
        if (check[2][1] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[2][1].setIcon(a);
                check[2][1] = 1;
            } else {
                gui.boxes[2][1].setIcon(b);
                check[2][1] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b11() {
        if (check[2][2] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[2][2].setIcon(a);
                check[2][2] = 1;
            } else {
                gui.boxes[2][2].setIcon(b);
                check[2][2] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b12() {
        if (check[2][3] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[2][3].setIcon(a);
                check[2][3] = 1;
            } else {
                gui.boxes[2][3].setIcon(b);
                check[2][3] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b13() {
        if (check[3][0] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[3][0].setIcon(a);
                check[3][0] = 1;
            } else {
                gui.boxes[3][0].setIcon(b);
                check[3][0] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b14() {
        if (check[3][1] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[3][1].setIcon(a);
                check[3][1] = 1;
            } else {
                gui.boxes[3][1].setIcon(b);
                check[3][1] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b15() {
        if (check[3][2] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[3][2].setIcon(a);
                check[3][2] = 1;
            } else {
                gui.boxes[3][2].setIcon(b);
                check[3][2] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void b16() {
        if (check[3][3] == 0 && win == 0 && gameStarted == true) { //checks if the spot has already been chosen
            clicks = clicks + 1;
            if ((clicks % 2) == 1) {
                gui.boxes[3][3].setIcon(a);
                check[3][3] = 1;
            } else {
                gui.boxes[3][3].setIcon(b);
                check[3][3] = 2;
            }
            winner();
        } else if (win == 1) //if someone has already won output a message
        {
            JOptionPane.showMessageDialog(null, "A player has already won. Reset to play again");
        } else if (gameStarted == false) //if the game hasn't started yet let them know
        {
            JOptionPane.showMessageDialog(null, "Press Play to begin playing the game");
        } else { //if its been taken it outputs a dialog box
            JOptionPane.showMessageDialog(null, "You have already chosen that spot");
        }
    }

    void startPlaying() {
        playing = new Thread(this);
        playing.start();
        gui.play.setEnabled(false);
        gameStarted = true;
    }

    /* resetBoard()
       Pre-Condition: no pre-condition
       Post-Condition: Resets the board
     */
    void resetBoard() {
        for (int row = 0; row <= 3; row++) { //loops through all of the cards
            for (int col = 0; col <= 3; col++) {
                check[row][col] = 0; //resets all of the values of the cards
                gui.boxes[row][col].setIcon(back); //resets the icons
                gui.play.setEnabled(true); //enables the play button
                win = 0; //resets variables
                clicks = 0;
                gameStarted = false;
            }
        }
    }

    void winner() {
        for (int x = 0; x <= 3; x++) {
            if ((check[x][0] == check[x][1]) && (check[x][0] == check[x][2]) && (check[x][0] == check[x][3])) {
                if (check[x][0] == 1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                    xWin++;
                    clicks = 0; //resets the click counter
                    gui.blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
                    gui.blank2.setText("                  Ties: " + ties); //outputs the wins and ties for each player
                } else if (check[x][0] == 2) {
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    win = 1;
                    oWin++;
                    clicks = 0; //resets the click counter
                    gui.blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
                    gui.blank2.setText("                  Ties: " + ties); //outputs the wins and ties for each player
                }
            }
        }

        for (int x = 0; x <= 3; x++) {
            if ((check[0][x] == check[1][x]) && (check[0][x] == check[2][x]) && (check[0][x] == check[3][x])) {
                if (check[0][x] == 1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                    xWin++;
                    clicks = 0; //resets the click counter
                    gui.blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
                    gui.blank2.setText("                  Ties: " + ties); //outputs the wins and ties for each player
                } else if (check[0][x] == 2) {
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    win = 1;
                    oWin++;
                    clicks = 0; //resets the click counter
                    gui.blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
                    gui.blank2.setText("                  Ties: " + ties); //outputs the wins and ties for each player
                }
            }
        }

        if (((check[0][0] == check[1][1]) && (check[0][0] == check[2][2]) && (check[0][0] == check[3][3]))) {
            if (check[1][1] == 1) {
                JOptionPane.showMessageDialog(null, "X is the winner");
                win = 1;
                xWin++;
                clicks = 0; //resets the click counter
                gui.blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
                gui.blank2.setText("                  Ties: " + ties); //outputs the wins and ties for each player
            } else if (check[1][1] == 2) {
                JOptionPane.showMessageDialog(null, "O is the winner");
                win = 1;
                oWin++;
                clicks = 0; //resets the click counter
                gui.blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
                gui.blank2.setText("                  Ties: " + ties); //outputs the wins and ties for each player
            }
        }

        if ((check[3][0] == check[2][1]) && (check[3][0] == check[1][2]) && (check[3][0] == check[0][3])) {
            if (check[1][2] == 1) {
                JOptionPane.showMessageDialog(null, "X is the winner");
                win = 1;
                xWin++;
                clicks = 0; //resets the click counter
                gui.blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
                gui.blank2.setText("                  Ties: " + ties); //outputs the wins and ties for each player
            } else if (check[1][2] == 2) {
                JOptionPane.showMessageDialog(null, "O is the winner");
                win = 1;
                oWin++;
                clicks = 0; //resets the click counter
                gui.blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
                gui.blank2.setText("                  Ties: " + ties); //outputs the wins and ties for each player
            }
        }

        if ((clicks >= 16) && (win == 0)) {
            JOptionPane.showMessageDialog(null, "The game is a tie");
            ties++;
            gui.blank1.setText("X Wins: " + xWin + "             O Wins: " + oWin);
            gui.blank2.setText("                  Ties: " + ties); //outputs the wins and ties for each player
            clicks = 0; //resets the click counter
        }
    }

}
