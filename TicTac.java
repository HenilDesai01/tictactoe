
/**
 * Programmer: Henil Desai
 * Teacher: Mr.Spadafora
 * Class: ICS4UV-01
 * Date: June 20, 2021
 *
 * Program Details: This .java file initalises the TicTacToe GUI
 * The entire program as a whole takes in user click in a game of TicTacToe
 * The program displays the winner of each game through a modal window
 * The game can be reset to be played multiple times and keeps track of how many times someone has won
 */

/**
 *
 * @author hdesa
 */
/*imports drawing classes needed */
import java.awt.*;
import javax.swing.*;

/**
 * the following public class creates the GUI for TicTak
 * pre-conditions: none
 * post-conditions: tictac GUI visualized
 */
public class TicTac extends JFrame {

    TicTacEvent tictac = new TicTacEvent(this);
    JPanel row1 = new JPanel(); //creates outline box
    JButton[][] boxes = new JButton[4][4]; //creates a 3 x 3 2d array in the jframe 
   
    JButton play = new JButton("Play");
    JButton reset = new JButton("Reset");
    JTextArea winsOutput = new JTextArea();
    JTextArea catwinsOutput = new JTextArea();
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("cardback.jpg");

    /**
     * creates the method to draw the game board
     * code below public TikTac() creates buttons and text fields
     */

    public TicTac() {
        super("Tic Tac Toe"); //creates the outer frame with the title.
        setSize(700, 800); //sets size of outerframe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the program to quit running when the window is closed
        FlowLayout layout = new FlowLayout(); // arranges components from left to right, centering them horizontally with five pixel gaps in between.
        setLayout(layout);
        int name = 0;
        String newname;
        GridLayout layout1 = new GridLayout(5, 4, 10, 10); //arranges the components in a rectangular grid, where all cells are of equal size.
        row1.setLayout(layout1);
        /**
         * for loop creates and adds buttons to the GridLayout's first three
         * rows.
         */
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]); //adds remaining components to the GridLayout
            }
        }
        
        /* adds components to the gui*/
        row1.add(winsOutput);
        row1.add(play);
        row1.add(reset);
        row1.add(catwinsOutput);
        add(row1); //adds the GridLayout to the FlowLayout.
        play.addActionListener(tictac); //makes the program ready to handle mouse clicks
        reset.addActionListener(tictac);
        //xwinsOutput.addActionListener(tictac);
        
        /* for loop listens to clicks and changes things in boxes array to change gui*/
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                boxes[x][y].addActionListener(tictac);
            }
        }
        setVisible(true);//shows the FlowLayout on the screen
    }

    /*
        Initializes the frame
        pre-codnitions: The TicTac GUI 
        post-conditions: initialization of TicTac frame

     */
    public static void main(String[] arguments) {
        TicTac frame = new TicTac(); //runs the screen layout class. //joins the two programs to work with each other.

    }

}
