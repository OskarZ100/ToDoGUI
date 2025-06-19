import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PromptPanel extends JFrame{

    JButton  submit_name = new JButton();
    JButton submit_desc = new JButton();
    JButton submit_all = new JButton();

    JPanel pan_name = new JPanel();
    JPanel pan_desc = new JPanel();
    JPanel pan_submitArea = new JPanel();

    public PromptPanel(){
        //setting frame properteis 
        this.setLayout(new BorderLayout());
        this.setTitle("FILL IN TASK INFO");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(800, 500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        //creating the text holders
        JTextField text_name = new JTextField();
        JTextArea text_desc = new JTextArea();
        
        //panel 800, 150 
        //store all the things in a flowlayout panel
        //make sure on the submit button  press that the names are not editable again
        //and that when they press the full submite that it all sends 
        //the other submits are kind of just to see what it would look like 
        //then the all submit is to enable the remove byutton and all the other ones along with it 

        //ADDING EVERYTHING
        this.add(submit_name);
        this.add(submit_desc);
        this.add(submit_all);
    }
}
