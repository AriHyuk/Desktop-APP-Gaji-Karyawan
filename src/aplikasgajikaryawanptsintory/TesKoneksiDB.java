/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasgajikaryawanptsintory;
import java.sql.Connection;
/**
 *
 * @author Ari Awaludin
 */
public class TesKoneksiDB {
    public static void main(String[] args) {
        // Mengambil koneksi
        Connection conn = model.Koneksi.getKoneksi();

        if (conn != null) {
            System.out.println("Koneksi berhasil!");
        } else {
            System.out.println("Koneksi gagal.");
        }
    }
}

