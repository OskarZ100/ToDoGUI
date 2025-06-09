import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame{
    public Frame(){
        this.setTitle("!TO DO APP!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(700, 700);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void setColorBkg(Color color){
        this.getContentPane().setBackground(color);
    }


    public void setIcon(String image){
        ImageIcon logo = new ImageIcon(image);
        this.setIconImage(logo.getImage());
    }

}
