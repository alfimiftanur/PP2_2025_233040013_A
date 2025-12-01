package modul8.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PersegiPanjangView extends JFrame {
    private JTextField txtPanjang = new JTextField(10);
    private  JTextField txtLebar = new JTextField(10);
    private JLabel lblHasil = new JLabel("-");
    private JLabel lblHasilKeliling = new JLabel("-");
    private JButton btnHitungLuas = new JButton("Hitung Luas");
    private JButton btnHitungKeliling = new JButton("Hitung Keliling");
    private JButton btnReset = new JButton("Reset");

    public PersegiPanjangView(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);
        this.setLayout(new GridLayout(8,2,10,10));
        this.setTitle("MVC Kalkulator");

        this.add(new JLabel("Panjang: "));
        this.add(txtPanjang);
        this.add(new JLabel("Lebar: "));
        this.add(txtLebar);
        this.add(new JLabel("Hasil Luas: "));
        this.add(lblHasil);
        this.add(new JLabel("Hasil Keliling:"));
        this.add(lblHasilKeliling);
        this.add(new JLabel(""));
        this.add(btnHitungLuas);
        this.add(new JLabel(""));
        this.add(btnHitungKeliling);
        this.add(new JLabel(""));
        this.add(btnReset);
    }
    public double getPanjang(){
        return Double.parseDouble(txtPanjang.getText());
    }

    public double getLebar(){
        return Double.parseDouble(txtLebar.getText());
    }

    public void setHasilLuas(double hasil){
        lblHasil.setText(String.valueOf(hasil));
    }
    public void setHasilKeliling(double hasil) {
        lblHasilKeliling.setText(String.valueOf(hasil));
    }

    public void tampilkanePesanError(String pesan){
        JOptionPane.showMessageDialog(this, pesan);
    }

    public void addHitungLuas(ActionListener listener){
        btnHitungLuas.addActionListener(listener);
    }

    public void addHitungKeliling(ActionListener listener){
        btnHitungKeliling.addActionListener(listener);
    }

    public void addResetListener(ActionListener listener) {
        btnReset.addActionListener(listener);
    }

    public void clearInput() {
        txtPanjang.setText("");
        txtLebar.setText("");
        lblHasil.setText("-");
        lblHasilKeliling.setText("-");
    }
}
