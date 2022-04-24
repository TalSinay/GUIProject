import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;




    private static final String[] animals={"lion","bear","turtle","girafe","elefent"};




    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu backGroundMenu;
    JMenu helpMenu;
    JMenuItem NoneItem;
    JMenuItem ImageItem;
    JMenuItem greenItem;
    JMenuItem helpItem;
    JMenuItem exitItem;
    Button Add;
    Button Move;
    Button Clear;
    Button Food;
    Button Info;
    Button Exit;
    ImageIcon image1=new ImageIcon("DSCF1401.JPG");
    JLabel label1=new JLabel(image1);


    MyFrame(){

        this.setTitle("zoo");//Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button
        this.setSize(800,600);//set size of frame
        this.setLayout(new FlowLayout());
        ImageIcon image =new ImageIcon("zooLogo.jpg");//set the image
        this.setIconImage(image.getImage());//put the image in high-left

        menuBar=new JMenuBar();

         fileMenu = new JMenu("File");
         backGroundMenu = new JMenu("Background");
         helpMenu = new JMenu("Help");

         NoneItem=new JMenuItem("None");
         ImageItem=new JMenuItem("Image");
         greenItem=new JMenuItem("Green");
         helpItem=new JMenuItem("Help");
         exitItem=new JMenuItem("Exit");

         NoneItem.addActionListener(this);
        exitItem.addActionListener(this);
        helpItem.addActionListener(this);
        ImageItem.addActionListener(this);
        greenItem.addActionListener(this);

        fileMenu.add(exitItem);
        backGroundMenu.add(ImageItem);
        backGroundMenu.add(greenItem);
        backGroundMenu.add(NoneItem);
        helpMenu.add(helpItem);

        menuBar.add(fileMenu);
        menuBar.add(backGroundMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);



        BorderLayout myBorderLayout = new BorderLayout();
        myBorderLayout.setHgap(20);
        myBorderLayout.setVgap(50);
        this.setLayout(myBorderLayout);//layout


        Add =new Button("Add Animal");
        Move =new Button("Move Animal");
        Clear =new Button("Clear");
        Food =new Button("Food");
        Info =new Button("Info");
        Exit =new Button("Exit");

        Add.setBackground(Color.WHITE);
        Move.setBackground(Color.WHITE);
        Clear.setBackground(Color.WHITE);
        Food.setBackground(Color.WHITE);
        Info.setBackground(Color.WHITE);
        Exit.setBackground(Color.WHITE);



        JPanel panel=new JPanel();//panel
        panel.setPreferredSize(new Dimension(100, 25));
        panel.add(Add);
        panel.add(Move);
        panel.add(Clear);
        panel.add(Food);
        panel.add(Info);
        panel.add(Exit);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER,60,2));
        panel.setBackground(Color.BLUE);
        this.add(panel,myBorderLayout.SOUTH);







        this.setVisible(true);//make frame

    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Exit){
            System.exit(0);

        }






        if(e.getSource()==exitItem){
            System.exit(0);

        }
        if(e.getSource()==NoneItem){
            this.getContentPane().setBackground(null);

        }
        if(e.getSource()==greenItem){
            this.getContentPane().setBackground(Color.GREEN);

        }
        if(e.getSource()==helpItem){

        }
        if(e.getSource()==ImageItem){
            this.getContentPane().add(label1);

        }



        }

    }


