package modul8.controller;


import modul8.model.PersegiPanjangModel;
import modul8.view.PersegiPanjangView;
import  java.awt.event.*;

public class PersegiPanjangController {
    private PersegiPanjangModel model;
    private PersegiPanjangView view;

    public PersegiPanjangController(PersegiPanjangModel model, PersegiPanjangView view){
        this.model = model;
        this.view = view;

        this.view.addHitungLuas(new HitungLuasListener());
        this.view.addHitungKeliling(new HitungKelilingListener());
        this.view.addResetListener(new ResetListener());
    }

    class HitungLuasListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                double p = view.getPanjang();
                double l = view.getLebar();

                model.setPanjang(p);
                model.setLebar(l);

                model.hitungLuas();
                model.hitungKeliling();

                double hasilLuas = model.getLuas();
                view.setHasilLuas(hasilLuas);
            } catch (NumberFormatException ex){
                view.tampilkanePesanError("Masukkan angka yang valid!");
            }
        }
    }

    class HitungKelilingListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                double p = view.getPanjang();
                double l = view.getLebar();

                model.setPanjang(p);
                model.setLebar(l);

                model.hitungLuas();
                model.hitungKeliling();

                double hasilKeliling = model.getKeliling();
                view.setHasilKeliling(model.getKeliling());
            } catch (NumberFormatException ex){
                view.tampilkanePesanError("Masukkan angka yang valid!");
            }
        }
    }

    class ResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.clearInput();
        }
    }

}
