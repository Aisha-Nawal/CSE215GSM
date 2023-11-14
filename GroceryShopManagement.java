import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class  GroceryShopManagement{
    public static void main(String[] args) {
        new GroceryShopManagement();
    }


    public GroceryShopManagement() { //code run korar por j page show kore oitar kaz kortese ei class
        JFrame frame1 = new JFrame("Grocery Shop Management"); //jframe hocche java pager shoabar upore panel er bam side frame er nam sr jonno kaz kortese

        JButton button1 = new JButton("Admin"); //jbutton button show er kaz kortese r button a likha ta set kore dicche
        JButton button2 = new JButton("Customer");
        JLabel label1 = new JLabel("Choose an option");
        label1.setFont(new Font("serif", Font.PLAIN, 25));//code run korar por javar j window ta pop up kore oitar moddhe "Choose an option" likha ta kon style,front r size er hobe tar kaz kortese "setFront"
        label1.setBounds(150, 40, 300, 25);//"Choose an option" likha ta kon side a hobe r likha ta koto tuku hieght porjonto hobe ta r kaz kortese "setBounds"

        button1.setBounds(180, 100, 100, 40);//button ta koto tuku jayga nibe kon side a hobe oitar jonno kaz kortese "setBounds"
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

        frame1.setSize(500, 600);//run korar por j window ta pop up hocche oi framer size set korci "setSize" diye
        frame1.setLayout(null);
        frame1.setVisible(true);//"setVisible diye amra frame ta k visible korchi window te"
        frame1.setLocationRelativeTo(null);//frame ta ki window er center a anar jonno
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//"setDefaultCloseOperation" method diye program ta k close korchi r method er moddhe JFrame obj call diye "EXIT_ON_CLOSE" likha ta likhte hobe

    }
}