import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelStorage extends JPanel{
    
    public PanelStorage(){
        // layout and such 
        GridLayout layout = new GridLayout(4, 1, 0, 5);
        this.setLayout(layout);
        this.setBackground(null);
        this.add(new TaskPanel("Name", "yehahaha", "ddsd", 1));
        this.add(new TaskPanel("Name2", "sdsd", "TOOL_TIP_TEXT_KEY", 1));
        this.add(new TaskPanel("Name3", "sdsd", "TOOL_TIP_TEXT_KEY", 1));
        this.add(new TaskPanel("Name4", "sdsd", "TOOL_TIP_TEXT_KEY", 1));

    }

    public void addTask(TaskPanel task){
        this.add(task);
    }
}