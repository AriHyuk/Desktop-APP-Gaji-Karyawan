/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Ari Awaludin
 */

import javax.swing.JOptionPane; 
import model.Pekerjaan; 
import view.FormLihatPekerjaan; 
import view.FormUtama;

public class PekerjaanController {
    private final Pekerjaan pekerjaan = new 
Pekerjaan(); 
    private FormLihatPekerjaan formLihatPekerjaan; 
     
    public void simpan(javax.swing.JTextField 
kodePekerjaanTextField,  
            javax.swing.JTextField 
namaPekerjaanTextField, 
            javax.swing.JComboBox 
jumlahTugasComboBox){ 
 

        if 
(!kodePekerjaanTextField.getText().equals("")){ 
            
pekerjaan.setKodePekerjaan(kodePekerjaanTextFiel
 d.getText()); 
            
pekerjaan.setNamaPekerjaan(namaPekerjaanTextFi
 eld.getText()); 
            pekerjaan.setJumlahTugas(Integer.parseInt( 
                    
jumlahTugasComboBox.getSelectedItem().toString()
 )); 
             
            if (pekerjaan.simpan()){ 
                
FormUtama.formPekerjaan.setKodePekerjaan(""); 
                
FormUtama.formPekerjaan.setNamaPekerjaan(""); 
                
FormUtama.formPekerjaan.setJumlahTugas(1); 
            }  else { 
                if (pekerjaan.getPesan().length() > 0){ 
                    JOptionPane.showMessageDialog(null, 
pekerjaan.getPesan(), "Kesalahan", 
JOptionPane.ERROR_MESSAGE); 
                } 
            } 
        } else { 
            JOptionPane.showMessageDialog(null, 
"Kode pekerjaan tidak boleh kosong", "Kesalahan", 
JOptionPane.ERROR_MESSAGE); 
        } 
    } 
     
    public void hapus(javax.swing.JTextField 
kodePekerjaanTextField){ 
        if 
(!kodePekerjaanTextField.getText().equals("")){ 
            if 
(pekerjaan.hapus(kodePekerjaanTextField.getText()
 )){ 
                
FormUtama.formPekerjaan.setKodePekerjaan(""); 
                
FormUtama.formPekerjaan.setNamaPekerjaan(""); 
                
FormUtama.formPekerjaan.setJumlahTugas(1); 
            }  else { 
                JOptionPane.showMessageDialog(null, 
pekerjaan.getPesan(), "Kesalahan", 
JOptionPane.ERROR_MESSAGE); 
            } 
        } else { 
            JOptionPane.showMessageDialog(null, 
"Kode pekerjaan tidak boleh kosong", "Kesalahan", 
JOptionPane.ERROR_MESSAGE); 
        } 
    } 
     
    public void cari(javax.swing.JTextField 
kodePekerjaanTextField){ 
        if 
(!kodePekerjaanTextField.getText().equals("")){ 
            if 
(pekerjaan.baca(kodePekerjaanTextField.getText()))
 { 
                
FormUtama.formPekerjaan.setNamaPekerjaan(peke
 rjaan.getNamaPekerjaan()); 
                
FormUtama.formPekerjaan.setJumlahTugas(pekerja
 an.getJumlahTugas()); 
            } else { 
                
FormUtama.formPekerjaan.setNamaPekerjaan(""); 
                
FormUtama.formPekerjaan.setJumlahTugas(1); 
                 
                JOptionPane.showMessageDialog(null, 
pekerjaan.getPesan(), "Kesalahan", 
JOptionPane.ERROR_MESSAGE); 
            } 
        } else { 
 

            JOptionPane.showMessageDialog(null, 
"Kode pekerjaan tidak boleh kosong", "Kesalahan", 
JOptionPane.ERROR_MESSAGE); 
        } 
    } 
     
    public void tampilkanDaftar(){ 
        formLihatPekerjaan = new 
FormLihatPekerjaan(null,true); 
        if (pekerjaan.bacaData()){ 
            
formLihatPekerjaan.tampilkanData(pekerjaan.getList
 ()); 
             
            formLihatPekerjaan.setVisible(true); 
            if 
(!formLihatPekerjaan.getKodePekerjaanDipilih().equ
 als("")){ 
                
FormUtama.formPekerjaan.setKodePekerjaan(formL
 ihatPekerjaan.getKodePekerjaanDipilih()); 
                if 
(pekerjaan.baca(formLihatPekerjaan.getKodePekerj
 aanDipilih())){ 
                    
FormUtama.formPekerjaan.setNamaPekerjaan(peke
 rjaan.getNamaPekerjaan()); 
 

                    
FormUtama.formPekerjaan.setJumlahTugas(pekerja
 an.getJumlahTugas()); 
                } else { 
                    
FormUtama.formPekerjaan.setNamaPekerjaan(""); 
                    
FormUtama.formPekerjaan.setJumlahTugas(1); 
                } 
            } 
        }  else { 
            JOptionPane.showMessageDialog(null, 
pekerjaan.getPesan()); 
        } 
    }
}
