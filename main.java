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
    public static String name = "";
    public static String desc = "";
    public static String color = "";
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
        
        
        int num; 
        //prompt frame thing
        PromptPanel frame2 = new PromptPanel();
        if(frame2.isVisible()){
            frame.header.button_add.setEnabled(false);
        }
        frame2.submit_all.addActionListener(e -> {
            countOfTasks += 1;
            TaskPanel temp = new TaskPanel(frame2.text_name.getText(), frame2.text_desc.getText(), "", countOfTasks);
            temp.description = frame2.l_desc.getText();
            temp.name = frame2.l_name.getText();
            frame.taskHolder.add(temp);
            frame.taskHolder.revalidate();
            frame.taskHolder.repaint();
            frame2.dispose();
            temp.removeBtn.addActionListener(f -> {
                int get = Integer.parseInt(temp.taskNum);
                frame.taskHolder.remove(tasks.get(get));
                tasks.remove(get);
                frame.taskHolder.revalidate();
                frame.taskHolder.repaint();
                countOfTasks -= 1;
            });
            tasks.add(temp);
            frame.header.button_add.setEnabled(true);
        });
        

        //the other stuff
        System.out.println("adding fr");
        
        
        
        
        frame.taskHolder.revalidate();
        frame.taskHolder.repaint();

    }

    public static void remove(){

    }
    

}