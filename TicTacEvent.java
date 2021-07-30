
/**
 * Program Details: This part of the code is the backend of the tictac program.
 * It takes in user clicks and changes the GUI cards accordingly
 * figures out who the winner is 
 * outputs winners and ties to GUI
 */




/** Import statements for classes */
import javax.swing.*;
import java.awt.event.*;

/*Creates a class that will respond to mouse and keyboard inputs through a process called "listening"*/
public class TicTacEvent implements ItemListener, ActionListener, Runnable {

    TicTac gui; //associates the gameboard with the event
    Thread playing, reseting;
    /*assosciates images from project file to ImageIcon*/
    ImageIcon a = new ImageIcon("x.png");
    ImageIcon b = new ImageIcon("o.png");
    ImageIcon back = new ImageIcon("cardback.jpg");
    /**
     * variables to check for a winner
     */
    int clicks = 0;
    int win = 0;
    int xwin = 0;
    int ywin = 0;
    int catwin = 0;
    int[][] check = new int[4][4];
    
    

    /**
     * associates TicTac and TicTacEvent to be used together
     */
    public TicTacEvent(TicTac in) {
        gui = in;
        /**
         * for loop initiates winner check array
         */
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 3; col++) {
                check[row][col] = 0;
            }
        }
        
    }

    /**
     * public void actionPerformed tells what to do when a button is pressed
     */
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand(); //takes the button name as input from the button that is clicked

        /**
         * the if statements check the command variable and calls the
         * appropriate method
         * pre-conditions: clicks in GUI
         * post-conditions:The functions within run
         */
        if (command.equals("Play")) {
            startPlaying();
        }
        if (command.equals("Reset")) {
            startReseting();
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

    /**
     * for the following void functions from b1 to b16,
     * clicks = clicks + 1 keeps track of the number of boxes chosen. 
     * If structure – puts an X on the board and declares that square to be taken. 
     * Else structure – puts an O on the board and declares that square to be taken
     * 
     * pre-conditions: call in function and clicks
     * post-conditions: change in check[][] array
     */
    void b1() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[0][0].setIcon(a);
            check[0][0] = 1;
        } else {
            gui.boxes[0][0].setIcon(b);
            check[0][0] = 2;
        }
        winner();
    }

    void b2() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[0][1].setIcon(a);
            check[0][1] = 1;
        } else {
            gui.boxes[0][1].setIcon(b);
            check[0][1] = 2;
        }
        winner();
    }

    void b3() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[0][2].setIcon(a);
            check[0][2] = 1;
        } else {
            gui.boxes[0][2].setIcon(b);
            check[0][2] = 2;
        }
        winner();
    }

    void b4() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[0][3].setIcon(a);
            check[0][3] = 1;
        } else {
            gui.boxes[0][3].setIcon(b);
            check[0][3] = 2;
        }
        winner();
    }

    void b5() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[1][0].setIcon(a);
            check[1][0] = 1;
        } else {
            gui.boxes[1][0].setIcon(b);
            check[1][0] = 2;
        }
        winner();
    }

    void b6() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[1][1].setIcon(a);
            check[1][1] = 1;
        } else {
            gui.boxes[1][1].setIcon(b);
            check[1][1] = 2;
        }
        winner();
    }

    void b7() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[1][2].setIcon(a);
            check[1][2] = 1;
        } else {
            gui.boxes[1][2].setIcon(b);
            check[1][2] = 2;
        }
        winner();
    }

    void b8() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[1][3].setIcon(a);
            check[1][3] = 1;
        } else {
            gui.boxes[1][3].setIcon(b);
            check[1][3] = 2;
        }
        winner();
    }

    void b9() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[2][0].setIcon(a);
            check[2][0] = 1;
        } else {
            gui.boxes[2][0].setIcon(b);
            check[2][0] = 2;
        }
        winner();
    }

    void b10() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[2][1].setIcon(a);
            check[2][1] = 1;
        } else {
            gui.boxes[2][1].setIcon(b);
            check[2][1] = 2;
        }
        winner();
    }

    void b11() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[2][2].setIcon(a);
            check[2][2] = 1;
        } else {
            gui.boxes[2][2].setIcon(b);
            check[2][2] = 2;
        }
        winner();
    }

    void b12() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[2][3].setIcon(a);
            check[2][3] = 1;
        } else {
            gui.boxes[2][3].setIcon(b);
            check[2][3] = 2;
        }
        winner();
    }

    void b13() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[3][0].setIcon(a);
            check[3][0] = 1;
        } else {
            gui.boxes[3][0].setIcon(b);
            check[3][0] = 2;
        }
        winner();
    }

    void b14() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[3][1].setIcon(a);
            check[3][1] = 1;
        } else {
            gui.boxes[3][1].setIcon(b);
            check[3][1] = 2;
        }
        winner();
    }

    void b15() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[3][2].setIcon(a);
            check[3][2] = 1;
        } else {
            gui.boxes[3][2].setIcon(b);
            check[3][2] = 2;
        }
        winner();
    }

    void b16() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {
            gui.boxes[3][3].setIcon(a);
            check[3][3] = 1;
        } else {
            gui.boxes[3][3].setIcon(b);
            check[3][3] = 2;
        }
        winner();
    }

    void winner() {
        /**
         * Check rows for winner 
         * uses if structure to check if all entries are X
         * or if all entries are O in a row
         * pre-conditions: Checks the checkarray for it's variables
         * post-conditions: 
         *  changes win to 1, adds numbers to either xwins, ywins or catwins
         *  sets output of JtextAreas to show wins of each person
         * 
         */
        
        for (int x = 0; x <= 3; x++) {
            if ((check[x][0] == check[x][1]) && (check[x][0] == check[x][2]) && (check[x][0] == check[x][3])) { 
                if (check[x][0] == 1) {
                    JOptionPane.showMessageDialog(null, "X is the winner"); //creates a pop up box declaring a winner.
                    win = 1; 
                    xwin++;
                    gui.winsOutput.setText("Player X wins: " + xwin + "\n"  + "Player Y wins: " + ywin); //outputs the wins to JTextArea
                    

                } else if (check[x][0] == 2) {
                    JOptionPane.showMessageDialog(null, "Y is the winner"); //creates a pop up box declaring a winner.
                    win = 1;
                    ywin++;
                    gui.winsOutput.setText("Player X wins: " + xwin + "\n"  + "Player Y wins: " + ywin); //outputs the wins to JTextArea

                }
            }
        }
        /**
         * Check column for winner If structure – checks to see if all entries
         * are X or all entries are O.
         *
         */
        for (int x = 0; x <= 2; x++) {
            if ((check[0][x] == check[1][x]) && (check[0][x] == check[2][x]) && (check[0][x] == check[3][x])) {
                if (check[0][x] == 1) {
                    JOptionPane.showMessageDialog(null, "X is the winner"); //creates a pop up box declaring a winner
                    win = 1;
                    xwin++;
                    gui.winsOutput.setText("Player X wins: " + xwin + "\n"  + "Player Y wins: " + ywin); //outputs the wins to JTextArea

                } else if (check[0][x] == 2) {
                    JOptionPane.showMessageDialog(null, "Y is the winner"); //creates a pop up box declaring a winner
                    win = 1;
                    ywin++;
                    gui.winsOutput.setText("Player X wins: " + xwin + "\n"  + "Player Y wins: " + ywin); //outputs the wins to JTextArea

                }
            }
            
        }
        /**
         * Check diagonals for winner Outside if structure – checks for diagonal
         * matches. Inside if structure – checks for X or O winner.
         */
        if (((check[0][0] == check[1][1]) && (check[0][0] == check[2][2]) && (check[0][0] == check[3][3]))
                || ((check[3][0] == check[2][1]) && (check[3][0] == check[1][2]) && (check[3][0] == check [0][3]))) {
            if ((check[0][0] == 1 && check[1][1] == 1 && check[2][2] == 1 && check[3][3] == 1) 
                    || (check[3][0] == 1 && check[2][1] == 1 && check[1][2] == 1 && check[0][3] == 1)) {
                JOptionPane.showMessageDialog(null, "X is the winner"); // creates a pop up box declaring a winner.
                win = 1;
                xwin++;
                gui.winsOutput.setText("Player X wins: " + xwin + "\n"  + "Player Y wins: " + ywin); //outputs the wins to JTextArea

            } else if ((check[0][0] == 2 && check[1][1] == 2 && check[2][2] == 2 && check[3][3] == 2) 
                    || (check[3][0] == 2 && check[2][1] == 2 && check[1][2] == 2 && check[0][3] == 2)) {
                JOptionPane.showMessageDialog(null, "Y is the winner"); // creates a pop up box declaring a winner.
                win = 1;
                ywin++;
                gui.winsOutput.setText("Player X wins: " + xwin + "\n"  + "Player Y wins: " + ywin); //outputs the wins to JTextArea

            }
        }
        /**
         * Checks if the game is a tie
         * pre-conditions: clicks, win, 
         * Post-conditions: adds one to catwin and outputs catswin text to jtextArea
         *
         * 
         */
        if ((clicks == 16) && (win == 0)) {
            JOptionPane.showMessageDialog(null, "The game is a tie");
            catwin++;
            gui.catwinsOutput.setText("Cat Wins: " + catwin); //outputs the cats wins to a JTextArea

        }
    }

    /**
     * "Thread" is the execution of the program "this" is within an instance
     * method or a constructor, this is a reference to the current object.
     * pre-conditions: funtion called
     * post-conditions: starts new thread, playing thread starts, play button gets disabled
     */
    void startPlaying() {
        playing = new Thread(this);
        playing.start(); //starts the game
        gui.play.setEnabled(false); //disables the play button
    }
    
    /**
     * The funtion enables the play button, resets the clicks and win variables, 
     * for loop also resets both the tictactoe to all cardback and the values of the boxes
     */
    void startReseting() {
        //reseting = new Thread(this);
        //playing.stop();
        //reseting.start();
        gui.play.setEnabled(true);
        clicks = 0;
        win = 0;
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 3; col++) {
                check[row][col] = 0;
                gui.boxes[row][col].setIcon(back); //sets boxes to cardbox

            }
        }
    }
    

    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
