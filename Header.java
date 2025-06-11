import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header extends JPanel{

    JLabel main_text = new JLabel("WELCOME TO THE TO DO LIST!");
    JButton button_info = new JButton();
    JButton button_add = new JButton();

    ImageIcon img_info = new ImageIcon();
    ImageIcon img_add = new ImageIcon();

    public Header(){
        this.add(main_text);
        this.add(button_info);
        this.add(button_add);
        this.setPreferredSize(new Dimension(250,75));
        this.setBackground(null);
        this.button_add.addActionListener(e -> {
            addButtonClicked();
        });
        this.button_info.addActionListener(e -> {
            infoButtonClicked();
        });
    }

    public void addButtonClicked(){
        //new task screen
        System.out.println("THE ADD BUTTON WAS CLICKED");
    }

    public void infoButtonClicked(){
        //new task screen
        System.out.println("THE INFO BUTTON WAS CLICKED");
    }
}
