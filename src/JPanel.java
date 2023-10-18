import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;

public class JPanel extends JLabel{
    JPanel() {


        //JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("thumb.png");


        JLabel label = new JLabel();
        this.setText("Hi");
        this.setIcon(icon);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setVisible(true);
        redPanel.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}