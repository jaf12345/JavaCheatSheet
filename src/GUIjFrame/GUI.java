package GUIjFrame;
import javax.swing.JFrame;
import java.awt.*;

public class GUI {
    public static void ehh (String [] arr) {
        //J frame = a GUI window to add componenets
        JFrame frame = new JFrame(); //Creates the frame
        frame.setVisible(true); //make frame visible
        frame.setSize(420,420); //set x and y dimensions of the frame
        frame.setTitle("Jframe title goes here"); //sets titile of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// this will set the x button in the window to actully end the runtime
        //its defult setting is .HIDE_ON_CLOSE
        frame.setResizable(false);//prevent frame from being resized
        frame.getContentPane().setBackground(Color.cyan); //change colour of background


    }
}
