import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Employee {

    public Employee() {
        JFrame frame2 = new JFrame("Employee");

        JLabel label1 = new JLabel("Enter Username ");
        label1.setBounds(50, 30, 100, 30);
        frame2.add(label1);
        JTextField userName = new JTextField();

        userName.setBounds(50, 50, 150, 20);
        frame2.add(userName);
        JLabel l2 = new JLabel("Enter Password ");
        l2.setBounds(50, 80, 100, 30);

        frame2.add(l2);
        JPasswordField userPass = new JPasswordField();
        userPass.setBounds(50, 100, 150, 20);

        frame2.add(userPass);
        JButton login = new JButton("Login");
        login.setBounds(180, 150, 100, 20);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String name = userName.getText();
                String pass = userPass.getText();

                if (name.equals("Admin") && pass.equals("12345")) {
                    frame2.setVisible(false);
                    new Activity();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }

            }

        });
        {

        }
        frame2.add(login);

        frame2.setSize(500, 600);
        frame2.setLayout(null);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
