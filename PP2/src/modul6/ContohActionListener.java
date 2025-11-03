package modul6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContohActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" Contoh ActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Halo, klik tombol di samping!");
        JButton button = new JButton("Klik Saya!");

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol klik diklik");
            }
        };
        button.addActionListener(listener);
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
