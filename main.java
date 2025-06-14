// Java program using label (swing)
// to display the message “GFG WEB Site Click”
import java.io.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;


class GFG {
    //setting global vars for colors 
    public static final Color c_main = new Color(46, 46, 45);
    public static void main(String[] args)
    {
        //task counting removal moight use array
        int countOfTasks = 0;

        // Creating instance of JFrame
        Frame frame = new Frame();
        frame.setColorBkg(c_main);
        frame.setIcon("logo.png");
        
        
        frame.header.button_add.addActionListener(e -> {
            addButtonClicked();
        });
    }
    public static void addButtonClicked() {
        System.out.println("infewni");
    }

    

}