import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myPanel extends JPanel implements ActionListener {
    JPanel panel = new JPanel();
    JButton button1=new JButton();
    myPanel() {



       this.setPreferredSize(new Dimension(100, 100));
       this.setBackground(Color.CYAN);


   }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
