import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        /*
        JFrame frame=new JFrame();
        frame.setTitle("Tal Windows");//Title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button
        frame.setSize(420,420);//set size of frame
        frame.setVisible(true);//make frame
        ImageIcon image =new ImageIcon("zooLogo.jpg");//set the image
        frame.setIconImage(image.getImage());//put the image in high-left
        frame.getContentPane().setBackground(Color.YELLOW);//set the background to color
        */
        ImageIcon image=new ImageIcon("zooLogo.jpg");//set a picture on the frame
        JLabel label=new JLabel();//create a label
        label.setText("Hello customer");//set text of label
        label.setIcon(image);//build the image in frame
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left,center,right of the image
        label.setVerticalTextPosition(JLabel.TOP);//set text left,right,center of image icon
        label.setForeground(Color.BLUE);//set color to the text
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//set a type for the text

        MyFrame myFrame=new MyFrame();
        myFrame.add(label);




    }
}
