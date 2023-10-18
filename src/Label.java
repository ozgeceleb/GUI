import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabel extends JFrame{
    JLabel() {
    
//JLabel = a GUI display area for a string of text, an image, or both

    ImageIcon image= new ImageIcon("kid.jpg");
    Border border =BorderFactory.createLineBorder(Color.green,3);
    javax.swing.JLabel label =new javax.swing.JLabel(); //create a label
        
        label.setText("Bro, do you even code ?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(javax.swing.JLabel.CENTER); //set text left, center, right of imageicon
    //  label.setVerticalTextPosition(JLabel.TOP); //set text top center bottom of imageicon
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(-25);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(javax.swing.JLabel.CENTER); //set vertical position of icon+text with in label
        label.setHorizontalAlignment(javax.swing.JLabel.CENTER); //SET HORİZONTAL POSİTİON icon+TEXT WİTH İN LABEL
    //  label.setBounds(100,100,250,250); //set x,y position with in frame as well as dimensions


    JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
    //  frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

}}
