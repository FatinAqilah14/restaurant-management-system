import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForGUI extends JFrame {
    private JTextField username;
    private JTextField password;
    private JButton btnOK;
//    {
//
//        if (username.getText().equals("") && password.getText().equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Blank is not alowed");
//        }
//    };

    private JButton btnClear;
    private JLabel lbWelcome;
    private JPanel mainPanel;

    public ForGUI() {
        setContentPane(mainPanel);
        setTitle("WELCOME");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (username.getText().equals("") && password.getText().equals(""))
            {
                JOptionPane.showMessageDialog(ForGUI.this, "Email or Password Invalid", "Try again", JOptionPane.ERROR_MESSAGE);
            }
                else
                    dispose();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username.setText("");
                password.setText("");
            }
        });
    }


    public static void main(String[] args) {
        ForGUI myGUI = new ForGUI();
    }

}
