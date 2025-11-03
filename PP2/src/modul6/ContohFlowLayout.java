package modul6;

import javax.swing.*;

public class ContohFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);

        JPanel panel = new JPanel();
        panel.add(new JButton("Tombol 1"));
        panel.add(new JButton("Tombol 2"));
        panel.add(new JButton("Tombol tiga"));
        panel.add(new JButton("Tombol Empat Panjang"));
        panel.add(new JButton("Tombol 5"));

        frame.add((panel));

        frame.setVisible(true);
    }
}