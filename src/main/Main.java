package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton btn = new JButton();
        JLabel label = new JLabel();
        label.setText("0000");
        label.setBounds(100, 50, 100, 30);
        btn.setText("1-0");
        btn.setBounds(100, 100, 100, 30);

        btn.addActionListener(new ActionListener() {
            int i=0;
            @Override
            public void actionPerformed(ActionEvent e) {

                i++;

                if (i%2==0){
                    label.setText("0000");
                }
                else{
                    label.setText("1111");
                }
            }
        });


        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(btn);
        frame.add(label);
    }
}
