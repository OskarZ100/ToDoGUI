// Java program using label (swing)
// to display the message “GFG WEB Site Click”
import java.io.*;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;


class GFG {
    //setting global vars for colors 
    public static final Color c_main = new Color(46, 46, 45);
    public static ArrayList<TaskPanel> tasks = new ArrayList<>();
    public static int countOfTasks = 0;
    public static Frame frame = new Frame();
    public static void main(String[] args)
    {
        //task counting removal moight use array
        
        

        // Creating instance of JFrame
        
        frame.setColorBkg(c_main);
        frame.setIcon("logo.png");
        
        
        frame.header.button_add.addActionListener(e -> {
            System.out.println("Yo adding buytton click");
            if(countOfTasks == 4){
                //no
                System.out.println("is foru");

            }else{
                System.out.println("adding");

                addButtonClicked();
            }
            
        });
    }
    public static void addButtonClicked() {
        //prompt
        System.out.println("adding fr");
        TaskPanel temp = new TaskPanel("name test", "hello", "idc", 0);
        frame.taskHolder.add(temp);
        tasks.add(temp);
        countOfTasks += 1;
        frame.taskHolder.revalidate();
        frame.taskHolder.repaint();

    }

    

}