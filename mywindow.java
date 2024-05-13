import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class mywindow extends JFrame
{
    private JLabel heading;
    private JLabel clocklabel;
    private Font font = new Font("",Font.BOLD,35);

    mywindow(){
        setTitle("MY CLOCK");
        setSize(400, 400);
        setLocation(300,50);
        this.createGUI();
        setVisible(true);
    }
    public void createGUI(){
    // gui
    heading = new JLabel("DIGITAL CLOCK");
    clocklabel = new JLabel("CLOCK");
    heading.setFont(font);
    clocklabel.setFont(font);   
    
    this.setLayout(new GridLayout(2,1));
    this.add(heading);
    this.add(clocklabel);
    this.startclock();

    }
    public void startclock()
    {
         
     Timer timer = new Timer(1000,new ActionListener() {
        public void actionPerformed (ActionEvent e){
      //  String Datetime = new Date().toLocaleString();                 // for am and pm
      //  String Datetime = new Date().toString();                       // for simple time
       Date d = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss : a");                     // for  time in hour minutes seconds format
       String Datetime = sdf.format(d);
        clocklabel.setText(Datetime);
        }
        
     } );

     timer.start();
     



            //   BY THREADING (TRY ND CATCH)
/* 
     Thread t = new Thread(){
        public void run()
        {
        try
        { 
            while (true)
             {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss : a");                     // for  time in hour minutes seconds format
                String Datetime = sdf.format(d);
                 clocklabel.setText(Datetime);
                 Thread.sleep(1000);
        }
        }

        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
     };
     t.start();

*/
    }
}