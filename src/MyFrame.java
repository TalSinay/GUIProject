import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Tal Windows");//Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button
        this.setSize(420,420);//set size of frame
        this.setVisible(true);//make frame
        ImageIcon image =new ImageIcon("zooLogo.jpg");//set the image
        this.setIconImage(image.getImage());//put the image in high-left
        this.getContentPane().setBackground(Color.YELLOW);//set the background to color
    }
}
