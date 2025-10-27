package modul5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.function.BiPredicate;

public class Latihan4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout");
                frame.setSize(400,300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLayout(new BorderLayout());

                JLabel label = new JLabel("Label ada di atas (North)");
                JButton button = new JButton("Tombol ada di bawah (South)");

                button.addActionListener(e ->{
                    label.setText("Tombol SOUTH diklik");
                });
                frame.add(label, BorderLayout.NORTH);
                frame.add(button, BorderLayout.SOUTH);
                frame.add(new JButton("WEST"), BorderLayout.WEST);
                frame.add(new JButton("EAST"), BorderLayout.EAST);
                frame.add(new JButton("CENTER"), BorderLayout.CENTER);

                frame.setVisible(true);
            }
        });
    }
}
