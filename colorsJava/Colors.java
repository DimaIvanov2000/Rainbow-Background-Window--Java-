import java.awt.*;
import javax.swing.*;

public class Colors extends JFrame
{

    /**
     * Constructor for objects of class Colors
     */
    public Colors()
    {
        // initialise instance variables

        //1. Create the frame.
        JFrame frame = new JFrame("Colors!");

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //3. Create components and put them in the frame.
        JPanel panel = new JPanel();   
        frame.add(panel, "Center");
        panel.setBackground(Color.RED);
        
        //4. Size the frame.
        frame.setSize(1200, 800);
        setLayout(null);
        frame.setResizable(true);
       
        //5. Show it.
        frame.setVisible(true);
        
        //6. Modify the frame.
        paintFrameComponents newPaint = new paintFrameComponents(panel, 50);
        newPaint.paintRGBEfficient();

    }

    public static void main(String[] args) {
        JFrame newFrameInstance = new Colors();
    }
   
} // class CopyOfFrame_Example
