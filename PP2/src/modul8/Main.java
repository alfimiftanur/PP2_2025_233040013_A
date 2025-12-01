package modul8;

import modul8.controller.PersegiPanjangController;
import modul8.view.PersegiPanjangView;
import modul8.model.PersegiPanjangModel;


public class Main {
    public static void main(String[] args) {
        PersegiPanjangModel model = new PersegiPanjangModel();

        PersegiPanjangView view = new PersegiPanjangView();

        PersegiPanjangController controller = new PersegiPanjangController(model, view);

        view.setVisible(true);

    }
}