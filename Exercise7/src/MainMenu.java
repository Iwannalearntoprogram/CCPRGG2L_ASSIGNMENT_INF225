import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.stream.events.StartDocument;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu extends JFrame{

    MainMenu(){


        // JLabel
        JLabel imageLabel= new JLabel();

        //Cat image Downloaded from internet
        ImageIcon frogImage= new ImageIcon("frog.gif");

        //Set image to label
        imageLabel.setIcon(frogImage);


        //Jbutton
        JButton starButton = new JButton("Start Game");
        // make a Start Game Button
        starButton.setText("Start Game");
        starButton.setFont(new Font("Arial", Font.BOLD, 25));

        //Add event to start button
        EventHandler handler=new EventHandler();
        starButton.addActionListener(handler);

        
        //Adds image to frame
        this.add(imageLabel);
        //Adds Button
        this.add(starButton);

        //Frame Layout
        this.setLayout(new FlowLayout());

        //Frame Title
        this.setTitle("Snake Game");
        //Closes Java Program
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Frame size Adjustment
        this.setSize(500,484);
        //Puts Frame in the Middle
        this.setLocationRelativeTo(null);
        //Makes Frame Appear
        this.setVisible(true);
        // Disable Resize
        this.setResizable(true);
        // Set Background Color
        this.getContentPane().setBackground(Color.magenta);


    }

    //Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            // Goes to game frame
            new ColorMenu();

            // Closes Frame
            dispose();
        }



    }


    
    
}
