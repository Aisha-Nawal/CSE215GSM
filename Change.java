import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;

class Change {

    JLabel label1, label2, label3, label4, label5, label6, label7, label8;
    JTextField amount1, amount2, amount3, amount4, amount5, amount6;
    JButton button,button1;
    JFrame frame3 = new JFrame("Change Price");

    public Change() {
        button = new JButton("Change");
        button.setBounds(100, 400, 80, 30);
        button1=new JButton("Previous");
        button1.setBounds(100, 450, 100, 30);
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame3.setVisible(false);
                new Activity();
            }

        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    Formatter formatter = new Formatter("C:\\Users\\nawal\\OneDrive\\Desktop\\Aisha\\GroceryShopManagement\\src\\Productlist.txt");
                    {
                        formatter.format("%s\n%s\n%s\n%s\n%s\n%s\n", amount1.getText(), amount2.getText(), amount3.getText(), amount4.getText(), amount4.getText(),amount5.getText(),amount6.getText());//productlist text file a product er price ta set hocche
                        formatter.close();
                        JOptionPane.showMessageDialog(null, "Successfully Changed"); //product er price change korar por ekta window pop up hobe oi window tar jonno JOptionPane.showMassageDialog() method ta use kora hoyeche
                    }
                } catch (Exception x) {

                }

            }
        });


        label6 = new JLabel("Goods");
        label6.setBounds(100, 70, 300, 20);
        label6.setFont(new Font("serif", Font.BOLD, 15));
        label7 = new JLabel("Price");
        label7.setFont(new Font("serif", Font.BOLD, 15));
        label7.setBounds(200, 70, 300, 20);
        label1 = new JLabel("Suger");
        label1.setBounds(100, 100, 60, 20);

        label2 = new JLabel("Rice");
        label2.setBounds(100, 150, 60, 20);
        label3 = new JLabel("Spices");
        label3.setBounds(100, 200, 60, 20);
        label4 = new JLabel("Salt");
        label4.setBounds(100, 250, 60, 20);
        label5 = new JLabel("Milk");
        label5.setBounds(100, 300, 60, 20);
        label8 = new JLabel("Oil");
        label8.setBounds(100, 350, 60, 20);
        amount1 = new JTextField();
        amount1.setBounds(200, 100, 50, 20);
        amount2 = new JTextField();
        amount2.setBounds(200, 150, 50, 20);
        amount3 = new JTextField();
        amount3.setBounds(200, 200, 50, 20);
        amount4 = new JTextField();
        amount4.setBounds(200, 250, 50, 20);
        amount5 = new JTextField();
        amount5.setBounds(200, 300, 50, 20);
        amount6 = new JTextField();
        amount6.setBounds(200, 350, 50, 20);
        frame3.add(label1);
        frame3.add(label2);
        frame3.add(label3);
        frame3.add(label4);
        frame3.add(label5);
        frame3.add(label8);
        frame3.add(amount1);
        frame3.add(amount2);
        frame3.add(amount3);
        frame3.add(amount4);
        frame3.add(amount5);
        frame3.add(amount6);
        frame3.add(label6);
        frame3.add(label7);
        frame3.add(button);
        frame3.add(button1);

        frame3.setSize(500, 600);
        frame3.setLayout(null);
        frame3.setLocationRelativeTo(null);
        frame3.setVisible(true);
        frame3.setVisible(true);

        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
