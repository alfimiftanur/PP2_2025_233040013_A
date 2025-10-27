package modul5;

import javax.swing.*;
import java.awt.*;

public class Latihan2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Jendela dengan Label");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//                1. Buatkan komponen JLabel
                JLabel label = new JLabel("Ini adalah Jlabel");

//                2. tambahkan Jlabel ke Jframe
//                Secara default, Jframe menggunakan BorderLayout
//                dan .add() akan menambahkannya ke bagian tengah (CENTER)
                frame.add(label);

                frame.setVisible(true);
            }
        });
    }
}
