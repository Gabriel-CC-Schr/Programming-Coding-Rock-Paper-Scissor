import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class RockPaperScissorGUI extends JFrame{
    public RockPaperScissorGUI () {
        //invokes jframe constructor and add title to the Gui
        super( "Rock Paper Scissor Game" );
        
        // set the size of the GUI
        setSize(450, 574);

        //set layout to null to disable default layout management, so we can use absolute positioning for the elements 
        // (i,e. settint x,y coordinates and width and height of values)
        setLayout(null);

        // terminate the java virtual machine when closing the GUI
        setDefaultCloseOperation();

        //load GUI in the senter oof the screen every time we runn the application 
        setLocationRelativeTo(null);

        // add GUI components
        addGuiComponents();
    }

    private void addGuiComponents() {
        // creare a computer score label
        JLabel computerScoreLabel = new JLabel("Computer : 0");

        // set the x,y coordinates and width and height of the label
        computerScoreLabel.setBounds(0,43,450,30);

        // set the font to have a font familyt of dialog, font-weight of bold and font-size of 26
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));

        //place the text in the center 
        computerScoreLabel.setHorizontalAlignment(SwingConstants.Cenrter);

        // add to Gui
        add(computerScoreLabel);

        
    }
}