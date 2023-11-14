import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class  GroceryShopManagement{
    public static void main(String[] args) {
        new GroceryShopManagement();
    }


    public GroceryShopManagement() {
        JFrame frame1 = new JFrame("Grocery Shop Management");

        JButton button1 = new JButton("Admin");
        JButton button2 = new JButton("Customer");
        JLabel label1 = new JLabel("Choose an option");
        label1.setBounds(150, 40, 300, 25);

        button1.setBounds(180, 100, 100, 40);
        button2.setBounds(180, 150, 100, 40);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button1) {
                    frame1.setVisible(false);
                    new Employee();
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == button2) {
                    frame1.setVisible(false);
                    new Customer();
                }
            }
        });
        frame1.add(button1);
        frame1.add(button2);
        frame1.add(label1);

        frame1.setSize(500, 600);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}