import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class paintFrameComponents
{
    // instance variables
    private JPanel panel;
    int sleep;
    
    int cr=255;
    int cg=0;
    int cb=0;
    int i;
    Color newCol;

    /**
     * Constructor for objects of class paintFrameComponents
     */
    public paintFrameComponents(JPanel inPanel, int inSleep) {
        panel           = inPanel;
        sleep           = inSleep;
    }

    /**
     * Methods
     */
    
    public void paintRGBColors() { 
        while(true)
        {
            if(cr==255&&cg<255)
            {
                cg++;
            }
            else if(cg==255&&cr>0)
            {
                cr--;
            }
            else if(cg==255&&cb<255)
            {
               cb++;
            }
            else if(cb==255&&cg>0)
            {
                cg--;
            }
            else if(cb==255&&cr<255)
            {
                cr++;
            }
            else if(cr==255&&cb>0)
            {
                cb--;
            }
            
            draw();

            try        
            {
                Thread.sleep(sleep);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
    }    
    
    public void paintRGBEfficient() {
        i=0;
        while(true){
            i=(i+1)%1536;
            cr=(Math.abs(((i+512)%1536)-1023)-Math.abs(((i+512)%1536)-768)-Math.abs(((i+512)%1536)-255)+Math.abs((i+512)%1536))/2;
            cg=(Math.abs((i%1536)-1023)-Math.abs((i%1536)-768)-Math.abs((i%1536)-255)+Math.abs(i%1536))/2;
            cb=(Math.abs(((i-512)%1536)-1023)-Math.abs(((i-512)%1536)-768)-Math.abs(((i-512)%1536)-255)+Math.abs((i-512)%1536))/2;
            
            draw();
            
            try        
            {
                Thread.sleep(sleep);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    private void draw()
    {
        newCol=new Color(cr,cg,cb);
        panel.setBackground(newCol);
    }
    
} // class paintFrameComponents
