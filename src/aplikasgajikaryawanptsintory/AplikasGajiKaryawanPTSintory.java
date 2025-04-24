package aplikasgajikaryawanptsintory;

import view.FormUtama; // pastikan ini sesuai dengan package FormUtama kamu
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AplikasGajiKaryawanPTSintory {

    public static void main(String[] args) {
        try {
            // Opsional: buat tampilannya lebih modern
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        // Menjalankan FormUtama
        java.awt.EventQueue.invokeLater(() -> {
            new FormUtama().setVisible(true);
        });
    }
}
