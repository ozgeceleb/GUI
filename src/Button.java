import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;


public class Button extends JFrame implements ActionListener{

      JButton button;

    javax.swing.JLabel label =new javax.swing.JLabel();


    Button() {

        ImageIcon icon2= new ImageIcon("kid.jpg");

        ImageIcon icon =new ImageIcon("leftThumb.png");

         //create a label
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
       // button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            label.setVisible(true);

            // System.out.println("poo");
            // button.setEnabled(false);

        }
    }
}
