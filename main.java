// Java program using label (swing)
// to display the message “GFG WEB Site Click”
import java.io.*;
import java.awt.Color;
import javax.swing.*;

// Main class
class GFG {
    public static Color c_main = new Color(46, 46, 45);
    // Main driver method
    public static void main(String[] args)
    {
        // Creating instance of JFrame
        JFrame frame = new JFrame();
        frame = initialSetUp(frame);
        

    }

    public static JFrame initialSetUp(JFrame frame){
        //setting basic contraints
        frame.setTitle("!TO DO APP!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);

        //making the logo icon thing
        ImageIcon logo = new ImageIcon("logo.png");
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(c_main);
        return frame;
    }
}