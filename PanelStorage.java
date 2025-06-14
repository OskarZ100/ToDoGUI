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
        this.setBackground(new Color(31, 31, 31));

    }

    public void addTask(TaskPanel task){
        this.add(task);
    }

}