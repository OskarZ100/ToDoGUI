import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PromptPanel extends JFrame{

    JLabel l_name = new JLabel("Name:");
    JLabel l_desc = new JLabel("Description:");
    JLabel l_all = new JLabel("SUBMIT");

 
    JButton submit_all = new JButton();

    JPanel pan_name = new JPanel();
    JPanel pan_desc = new JPanel();
    JPanel pan_submitArea = new JPanel();

    JTextField text_name = new JTextField();
        JTextArea text_desc = new JTextArea();
    public PromptPanel(){
        //setting frame properteis 
        GridLayout layout = new GridLayout(3, 1, 0, 5);
        this.setLayout(layout);
        this.setTitle("FILL IN TASK INFO");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(800, 500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        //creating the text holders
        
        
        //panel 800, 150 
        //store all the things in a flowlayout panel
        //make sure on the submit button  press that the names are not editable again
        //and that when they press the full submite that it all sends 
        //the other submits are kind of just to see what it would look like 
        //then the all submit is to enable the remove byutton and all the other ones along with it 

        //text feilds
        text_desc.setPreferredSize(new Dimension(200, 50));
        text_name.setPreferredSize(new Dimension(200, 20));


        //panels styling
        pan_name.setPreferredSize(new Dimension(800,150));
        pan_desc.setPreferredSize(new Dimension(800,150));
        pan_submitArea.setPreferredSize(new Dimension(800,150));

        //add to panels
        pan_name.add(l_name);
        pan_name.add(text_name);
   
        

        pan_desc.add(l_desc);
        pan_desc.add(text_desc);


        pan_submitArea.add(l_all);
        pan_submitArea.add(submit_all);


        //ADDING EVERYTHING
        this.add(pan_name);
        this.add(pan_desc);
        this.add(pan_submitArea);
    }
}
