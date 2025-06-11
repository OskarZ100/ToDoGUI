import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame{

    Header header = new Header();

    public Frame(){
        this.setTitle("!TO DO APP!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(700, 700);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.add(header, BorderLayout.NORTH);
    }

    public void setColorBkg(Color color){
        this.getContentPane().setBackground(color);
    }


    public void setIcon(String image){
        ImageIcon logo = new ImageIcon(image);
        this.setIconImage(logo.getImage());
    }

}
