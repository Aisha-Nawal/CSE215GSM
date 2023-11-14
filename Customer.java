import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
class Customer extends JFrame implements ActionListener {
    JLabel label, label2, label3, label4;
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    JButton button;
    JTextField amount1, amount2, amount3, amount4, amount5, amount6, quantity1, quantity2, quantity3, quantity4, quantity5, quantity6;
    float sugarP, riceP, saltP, milkP, spiceP, oilP;
    public void check() {
        try {

            File file = new File("C:\\Users\\nawal\\OneDrive\\Desktop\\Aisha\\GroceryShopManagement\\src\\Productlist.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                sugarP = scan.nextFloat();
                riceP = scan.nextFloat();
                spiceP = scan.nextFloat();
                saltP = scan.nextFloat();
                milkP = scan.nextFloat();
                oilP = scan.nextFloat();

            }
            scan.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Customer() {

        check();
        label = new JLabel("Choose the items and quantity ");
        label.setBounds(50, 40, 300, 20);
        label.setFont(new Font("serif", Font.BOLD, 20));
        label2 = new JLabel("Goods");
        label2.setBounds(120, 70, 300, 20);
        label2.setFont(new Font("serif", Font.BOLD, 15));
        label3 = new JLabel("Price");
        label3.setFont(new Font("serif", Font.BOLD, 15));
        label3.setBounds(200, 70, 300, 20);
        label4 = new JLabel("Quantity");
        label4.setFont(new Font("serif", Font.BOLD, 15));

        label4.setBounds(270, 70, 300, 25);

        amount1 = new JTextField(Float.toString(sugarP));
        amount1.setBounds(200, 100, 50, 20);
        amount2 = new JTextField(Float.toString(riceP));
        amount2.setBounds(200, 150, 50, 20);
        amount3 = new JTextField(Float.toString(spiceP));
        amount3.setBounds(200, 200, 50, 20);
        amount4 = new JTextField(Float.toString(saltP));
        amount4.setBounds(200, 250, 50, 20);
        amount5 = new JTextField(Float.toString(milkP));
        amount5.setBounds(200, 300, 50, 20);
        amount6 = new JTextField(Float.toString(oilP));
        amount6.setBounds(200, 350, 50, 20);

        quantity1 = new JTextField();
        quantity1.setBounds(270, 100, 50, 20);
        quantity2 = new JTextField();
        quantity2.setBounds(270, 150, 50, 20);
        quantity3 = new JTextField();
        quantity3.setBounds(270, 200, 50, 20);
        quantity4 = new JTextField();
        quantity4.setBounds(270, 250, 50, 20);
        quantity5 = new JTextField();
        quantity5.setBounds(270, 300, 50, 20);
        quantity6 = new JTextField();
        quantity6.setBounds(270, 350, 50, 20);

        cb1 = new JCheckBox("Suger");
        cb1.setBounds(100, 100, 60, 20);
        cb2 = new JCheckBox("Rice");
        cb2.setBounds(100, 150, 60, 20);
        cb3 = new JCheckBox("Spices");
        cb3.setBounds(100, 200, 70, 20);
        cb4 = new JCheckBox("Salt");
        cb4.setBounds(100, 250, 60, 20);
        cb5 = new JCheckBox("Milk");
        cb5.setBounds(100, 300, 60, 20);

        cb6 = new JCheckBox("Oil");
        cb6.setBounds(100, 350, 60, 20);

        button = new JButton("Order");
        button.setBounds(100, 400, 80, 30);
        button.addActionListener(this);
        add(label);
        add(label2);
        add(label3);
        add(label4);
        add(amount1);
        add(amount2);
        add(amount3);
        add(amount4);
        add(amount5);
        add(amount6);
        add(quantity1);
        add(quantity2);

        add(quantity3);

        add(quantity4);
        add(quantity5);

        add(quantity6);

        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(cb5);
        add(cb6);
        add(button);
        setSize(500, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    BufferedWriter bufferedWriter = null;

    @Override
    public void actionPerformed(ActionEvent ae) {
        float amount = 0;
        String msg = "";
        if (cb1.isSelected()) {

            amount = amount + sugarP * parseInt(quantity1.getText());

        }
        if (cb2.isSelected()) {
            amount = amount + riceP * parseInt(quantity2.getText());

        }
        if (cb3.isSelected()) {
            amount = amount + spiceP * parseInt(quantity3.getText());

        }
        if (cb4.isSelected()) {
            amount = amount + saltP * parseInt(quantity4.getText());

        }
        if (cb5.isSelected()) {
            amount = amount + milkP * parseInt(quantity5.getText());

        }
        if (cb6.isSelected()) {
            amount = amount + oilP * parseInt(quantity6.getText());

        }
        msg += "-----------------\nSuccesfully Purchased\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + amount);
        try {

            bufferedWriter = new BufferedWriter(new FileWriter(new File("C:\\Users\\nawal\\OneDrive\\Desktop\\Aisha\\GroceryShopManagement\\src\\bill.txt"), true));
            try{if (parseInt(quantity1.getText()) >= 1) {
                bufferedWriter.write("Sugar\n" + sugarP + "\n");
            }}
            catch(Exception x1){

            }


            try{   if (parseInt(quantity2.getText()) >= 1) {
                bufferedWriter.write("Rice\n" + riceP + "\n");
            }}
            catch(Exception x2){

            }

            try{ if (parseInt(quantity3.getText()) >= 1) {
                bufferedWriter.write("Spices\n" + spiceP + "\n");
            }}
            catch(Exception x3){

            }

            try{if (parseInt(quantity4.getText()) >= 1) {
                bufferedWriter.write("Salt\n" + saltP + "\n");
            }}
            catch(Exception x4){

            }
            try{ if (parseInt(quantity5.getText()) >= 1) {
                bufferedWriter.write("Milk\n" + milkP + "\n");
            }
            }
            catch(Exception x5){

            }
            try{ if (parseInt(quantity6.getText()) >= 1) {
                bufferedWriter.write("Oil\n" + oilP + "\n");
            }
            }
            catch(Exception x6){

            }

            bufferedWriter.write("Total amount"+amount);

        } catch (FileNotFoundException exception) {
            System.out.println("file not found");
        } catch (IOException exception) {
            System.out.println("I/O Error");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e1) {
                System.out.println("I/O error");
            }
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
