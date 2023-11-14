import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class Bill {
    JTextArea text;
    JButton b1;
    public Bill() {
        text = new JTextArea();
        JFrame f3 = new JFrame("Bill");
        try{


            FileReader reader = new FileReader (new File("C:\\Users\\nawal\\OneDrive\\Desktop\\Aisha\\GroceryShopManagement\\src\\bill.txt"));
            BufferedReader br = new BufferedReader(reader);
            text.read(br,null);
            br.close();
            text.requestFocus();


        }
        catch(Exception x)
        {
            System.out.println(x);
        }
        b1=new JButton("Previous");
        b1.setBounds(100, 400, 100, 30);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                f3.setVisible(false);
                new Activity();
            }

        });

        text.setBounds(10,30,300,300);
        f3.add(b1);
        f3.add(text);
        f3.setSize(500, 600);
        f3.setLayout(null);
        f3.setVisible(true);
        f3.setVisible(true);
        f3.setLocationRelativeTo(null);
        JScrollPane scrollPane = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(20,20,200,300);
        f3.add(scrollPane);

        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}