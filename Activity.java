import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Activity {

    public Activity() {
        JFrame frame4 = new JFrame();
        JButton b3=new JButton("Home");
        b3.setBounds(190, 400, 100, 40);
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame4.setVisible(false);
                new GroceryShopManagement();
            }

        });
        JButton b1 = new JButton("Change Price");
        b1.setBounds(150, 100, 200, 40);
        JButton b2 = new JButton("View Bill");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b1) {
                    frame4.setVisible(false);
                    new Change();
                }
            }
        });
        b2.setBounds(150, 150, 200, 40);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == b2) {
                    frame4.setVisible(false);
                    new Bill();
                }
            }
        });
        frame4.add(b1);
        frame4.add(b2);
        frame4.add(b3);
        frame4.setSize(500, 600);
        frame4.setLayout(null);
        frame4.setVisible(true);
        frame4.setVisible(true);
        frame4.setLocationRelativeTo(null);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
