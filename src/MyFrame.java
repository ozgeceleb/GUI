import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Jthis title goas here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent this from being resized
        this.setSize(420,420); //sets the x-dimension, and y-dimension of frane
        this.setVisible(true);  //make this visible

        ImageIcon image =new ImageIcon("its time to.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of this
        this.getContentPane().setBackground(Color.MAGENTA) ; //change color of background
    }
}
