//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//class LoginDialog extends JDialog {
//    private final JTextField tbUsername;
//    private final JTextField tbPassword;
//    private int result = -1;
//    public LoginDialog(Frame window, JTextField tbPassword) {
//        super(window, "Login", true);
//
//        this.setLayout(new GridLayout(0, 2));
//        this.add(new JLabel("Username: "));
//        this.add(tbUsername = new JTextField());
//
//
//
//
//        JButton cancel = new JButton("Cancel");
//        cancel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                result = JOptionPane.CANCEL_OPTION;
//                setVisible(false);
//            }
//        });
//        this.add(cancel);
//    }
//
//
//
//    public int showDialog() {
//        setLocationRelativeTo(getParent());
//        pack();
//        setVisible(true);
//        return result;
//    }
//    public String getUsername() {
//        return tbUsername.getText();
//    }
//    public String getPassword() {
//        return tbPassword.getText();
//    }
//    public void actionPerformed(ActionEvent e) {
//        LoginDialog diag = new LoginDialog();
//        if (diag.showDialog() == JOptionPane.OK_OPTION) {
//            tbUsername.setText(diag.getUsername());
//            tbPassword.setText(diag.getPassword());
//        }
//    }
//}