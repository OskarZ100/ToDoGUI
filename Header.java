import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.text.html.ImageView;

public class Header extends JPanel{

    
    JLabel main_text = new JLabel("WELCOME TO THE TO DO LIST!");
    JButton button_info = new JButton();
    JButton button_add = new JButton();

    ImageIcon img_info = new ImageIcon("info.png");
    ImageIcon img_add = new ImageIcon("addition.png");
    

    public Header(){
        //adding to the header 
        this.add(main_text);
        this.add(Box.createRigidArea(new Dimension(70, 0)));
        this.add(button_info);
        this.add(button_add);

        //setting the size and background
        this.setPreferredSize(new Dimension(250,75));
        this.setBackground(null);

        //button action adding for clicks
        this.button_add.addActionListener(e -> {
            addButtonClicked();
        });
        this.button_info.addActionListener(e -> {
            infoButtonClicked();
        });

        //my borders 
        Border emptyBorder = BorderFactory.createEmptyBorder();
        Border whiteBottom = BorderFactory.createMatteBorder(0, 0, 2, 0,Color.WHITE);

        //adding border
        this.setBorder(whiteBottom);
        

        //setting texts and icons for buttons
        this.button_add.setText("ADD");
        this.button_info.setText("INFO");
        this.button_add.setVerticalTextPosition(SwingConstants.BOTTOM);
        this.button_info.setVerticalTextPosition(SwingConstants.BOTTOM);


        //fonts
        Font font_main = new Font("Arial", Font.BOLD, 25);

        //styling the texts in here
        this.main_text.setForeground(Color.WHITE);
        this.main_text.setFont(font_main);

        //image fixes
        Image img = img_add.getImage();
        Image newimg = img.getScaledInstance( 25, 25,  java.awt.Image.SCALE_SMOOTH ) ;  
        img_add = new ImageIcon( newimg );
        Image img2 = img_info.getImage();
        Image newimg2 = img2.getScaledInstance( 25, 25,  java.awt.Image.SCALE_SMOOTH ) ;  
        img_info = new ImageIcon( newimg2 );

        //button styling
        this.button_add.setFocusPainted(false);
        this.button_info.setFocusPainted(false);
        this.button_add.setIcon(img_add);
        this.button_info.setIcon(img_info);
        this.button_info.setPreferredSize(new Dimension(100,50));
        this.button_add.setPreferredSize(new Dimension(90,50));

        



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
