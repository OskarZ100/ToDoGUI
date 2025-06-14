import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.plaf.TreeUI;

public class TaskPanel extends JPanel{
    
    String name;
    String description;
    String textColor;
    String taskNum;
    JPanel wordStorage = new JPanel(new BorderLayout());

    public TaskPanel(String name, String desc, String color, int number){
        //basic init
        this.name = name;
        this.description = desc;
        this.textColor = color;
        this.taskNum = String.valueOf(number);
        this.setBackground(new Color(51, 51, 51));
        

        //styling and sizing
        this.setPreferredSize(new Dimension(500,80));

        
        //word storage style and layouts
        this.setLayout(new BorderLayout());
        wordStorage.setPreferredSize(new Dimension(500,80));

        //adding words 
        JLabel l_name = new JLabel(name);
        JTextArea l_desc = new JTextArea(description);
        JLabel l_tasknum = new JLabel(taskNum + ") ");
        JPanel topHold = new JPanel();
        topHold.setBackground(null);
        topHold.setLayout(new FlowLayout(FlowLayout.LEFT));
        topHold.add(l_tasknum);
        topHold.add(l_name);
        wordStorage.add(topHold, BorderLayout.PAGE_START);

        wordStorage.add(l_desc);
        l_desc.setAlignmentY(SwingConstants.TOP);
        wordStorage.setBackground(null);
        
        //styling the words
        Font font_task = new Font("Arial", Font.BOLD, 17);
        Font font_taskN = new Font("Arial", Font.BOLD, 30);
        Font font_taskNum = new Font("Arial", Font.BOLD, 30);
        l_desc.setLineWrap(true);
        l_desc.setEditable(false);
        l_desc.setBackground(null);
        l_name.setBackground(null);
        l_tasknum.setBackground(null);

        l_name.setForeground(Color.white);
        l_tasknum.setForeground(Color.white);
        l_desc.setForeground(new Color(189, 189, 188));




        l_name.setFont(font_taskN);
        l_desc.setFont(font_task);
        l_tasknum.setFont(font_taskNum);

        this.add(wordStorage, BorderLayout.WEST);

        //BUTTONS
        JButton remove = new JButton();
        remove.setPreferredSize(new Dimension(100,80));
        remove.setText("REMOVE");
        remove.setFocusPainted(false);
        this.add(remove, BorderLayout.EAST);

    }
}



//hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
//this is the max length a line should be
