package modul5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class tugas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout");
                frame.setSize(400,300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLayout(new BorderLayout());

                JLabel label = new JLabel("Label ada di atas (North)");
                JButton sbutton = new JButton("Button (South)");
                JButton wbutton = new JButton("Button (West)");
                JButton ebutton = new JButton("Button (East)");
                JButton cbutton = new JButton("Button (Center)");

                sbutton.addActionListener(e -> {
                    label.setText("Tombol SOUTH diklik");
                });

                wbutton.addActionListener(e -> {
                    label.setText("Tombol WEST diklik");
                });

                ebutton.addActionListener(e -> {
                    label.setText("Tombol EAST diklik");
                });

                cbutton.addActionListener(e -> {
                    label.setText("Tombol CENTER diklik");
                });

                frame.add(label, BorderLayout.NORTH);
                frame.add(sbutton, BorderLayout.SOUTH);
                frame.add(new JButton("WEST"), BorderLayout.WEST);
                frame.add(wbutton, BorderLayout.WEST);
                frame.add(new JButton("EAST"), BorderLayout.EAST);
                frame.add(ebutton, BorderLayout.EAST);
                frame.add(new JButton("CENTER"), BorderLayout.CENTER);
                frame.add(cbutton, BorderLayout.CENTER);

                frame.setVisible(true);
            }
        });
    }
}
