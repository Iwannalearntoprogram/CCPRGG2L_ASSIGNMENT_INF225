import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.stream.events.StartDocument;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.awt.event.ActionEvent;




public class TryAgain extends JFrame{
    TryAgain(){


        JButton tryAgaiButton = new JButton();
        JButton exitButton = new JButton();


        //Try Again Button

        tryAgaiButton.setText("Play Again");
        tryAgaiButton.setFont(new Font("Times New Roman", Font.BOLD, 25));

        EventHandler handler1 = new EventHandler();
        tryAgaiButton.addActionListener(handler1);


        //Exit Button
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Times New Roman", Font.BOLD, 25));

        EventHandler1 handler2= new EventHandler1();
        exitButton.addActionListener(handler2);
        


        //Adds Try and exit Button
        this.add(tryAgaiButton);
        this.add(exitButton);


     //Frame Layout
     this.setLayout(new FlowLayout());

     //Frame Title
     this.setTitle("Snake Game");
     //Closes Java Program
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     //Frame size Adjustment
     this.setSize(800,800);
     //Puts Frame in the Middle
     this.setLocationRelativeTo(null);
     //Makes Frame Appear
     this.setVisible(true);
     // Disable Resize
     this.setResizable(true);
     // Set Background Color
     this.getContentPane().setBackground(Color.magenta);


    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new MainMenu();

            dispose();

        }




    }


    private class EventHandler1 implements ActionListener{

        public void actionPerformed(ActionEvent event){


            dispose();

        }




    }


}


