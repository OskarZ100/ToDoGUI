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
            System.out.println("THE COUNT: " + countOfTasks);
            String descT = frame2.l_desc.getText();
            String nameT = frame2.l_name.getText();

            
            TaskPanel temp = new TaskPanel(frame2.text_name.getText(), frame2.text_desc.getText(), "", countOfTasks+1);

            if(nameT.length() > 10){
                System.out.println("NO");
            }else{
                countOfTasks += 1;
            System.out.println("THE COUNT: " + countOfTasks);

                temp.description = descT;
                temp.name = nameT;
                frame.taskHolder.add(temp);
                frame.taskHolder.revalidate();
                frame.taskHolder.repaint();
                frame2.dispose();
                temp.removeBtn.addActionListener(f -> {
                    int thisCount = Integer.parseInt(temp.taskNum);
                    countOfTasks -= 1;
                    int loopCount = 0;
                    for(TaskPanel pan : tasks){
                        if(Integer.parseInt(pan.taskNum) == thisCount){
                            frame.taskHolder.remove(tasks.get(loopCount));
                            tasks.remove(loopCount);
                            break;
                        }
                        loopCount += 1;
                    }
                    loopCount = 0;
                    for(TaskPanel pan : tasks){
                        tasks.get(loopCount).taskNum = String.valueOf(loopCount);
                        pan.l_tasknum.setText((loopCount+1) + ") ");
                        loopCount += 1;
                    }
                    frame.taskHolder.revalidate();
                    frame.taskHolder.repaint();
                    /*int get = Integer.parseInt(temp.taskNum);
                    get -= 1;
            System.out.println("THE GET: " + get);

                    frame.taskHolder.remove(tasks.get(get));
                    tasks.remove(get);
                    frame.taskHolder.revalidate();
                    frame.taskHolder.repaint();
                    countOfTasks -= 1;
            System.out.println("THE COUNT: " + countOfTasks);
*/
                });
                tasks.add(temp);
                frame.header.button_add.setEnabled(true); 
            }
            
        });
        

        //the other stuff
        System.out.println("adding fr");
        
        
        
        
        frame.taskHolder.revalidate();
        frame.taskHolder.repaint();

    }

    public static void remove(){

    }
    

}