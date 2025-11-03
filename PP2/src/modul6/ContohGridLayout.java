package modul6;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class ContohGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        frame.setLayout(new GridLayout(3, 3, 5, 5));
        frame.add(new JLabel("Label 1"));
        frame.add(new JTextField());
        frame.add(new JLabel("Label 2"));
        frame.add(new JPasswordField());
        frame.add(new JButton("Login"));
        frame.add(new JButton("Batal"));


        frame.setVisible(true);
    }
}
