/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author Ari Awaludin
 */
public class FormPekerjaan extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormPekerjaan
     */
    public FormPekerjaan() {
        initComponents();
        setItemBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kodePekerjaanLable = new javax.swing.JLabel();
        namaPekerjaanLable = new javax.swing.JLabel();
        jumlahTugasLable = new javax.swing.JLabel();
        lihatButton = new javax.swing.JButton();
        namaPekerjaanTextField = new javax.swing.JTextField();
        kodePekerjaanTextField = new javax.swing.JTextField();
        jumlahTugasComboBox = new javax.swing.JComboBox<>();
        hapusButton = new javax.swing.JPanel();
        simpanButton = new javax.swing.JButton();
        tutupButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setTitle("Master Data Pekerjaan");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pekerjaan"));

        kodePekerjaanLable.setText("Kode Pekerjaan");

        namaPekerjaanLable.setText("Nama Pekerjaan");

        jumlahTugasLable.setText("Jumlah Tugas");

        lihatButton.setText("Lihat");

        kodePekerjaanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodePekerjaanTextFieldActionPerformed(evt);
            }
        });

        jumlahTugasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jumlahTugasLable)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaPekerjaanLable)
                            .addComponent(kodePekerjaanLable))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jumlahTugasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(kodePekerjaanTextField)
                                    .addGap(18, 18, 18)
                                    .addComponent(lihatButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(namaPekerjaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodePekerjaanLable)
                    .addComponent(lihatButton)
                    .addComponent(kodePekerjaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPekerjaanLable)
                    .addComponent(namaPekerjaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahTugasLable)
                    .addComponent(jumlahTugasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        hapusButton.setBackground(new java.awt.Color(153, 255, 204));

        simpanButton.setText("Simpan");

        tutupButton.setText("Tutup");
        tutupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutupButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Hapus");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hapusButtonLayout = new javax.swing.GroupLayout(hapusButton);
        hapusButton.setLayout(hapusButtonLayout);
        hapusButtonLayout.setHorizontalGroup(
            hapusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hapusButtonLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(simpanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(93, 93, 93)
                .addComponent(tutupButton)
                .addGap(78, 78, 78))
        );
        hapusButtonLayout.setVerticalGroup(
            hapusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hapusButtonLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(hapusButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(tutupButton)
                    .addComponent(deleteButton))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setItemBox() {
        jumlahTugasComboBox.removeAllItems();
        for(int i=1; i<=6; i++) {
            if (i !=5) {
                jumlahTugasComboBox.addItem(Integer.toString(i));
            }
        }
    }
    
    public void setKodePekerjaan(String kodePekerjaan) {
        kodePekerjaanTextField.setText(kodePekerjaan);
    }
    
    public String getKodePekerjaan() {
        return kodePekerjaanTextField.getText();
    }
    
    public void setNamaPekerjaan(String namaPekerjaan) {
        namaPekerjaanTextField.setText(namaPekerjaan);
    }
    
    public void setJumlahTugas(int jumlahTugas) {
        jumlahTugasComboBox.setSelectedItem(jumlahTugas);
    }
    
    public int getJumlahTugas() {
        return Integer.parseInt(jumlahTugasComboBox.getSelectedItem().toString());
    }
    
    private void kodePekerjaanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodePekerjaanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodePekerjaanTextFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void tutupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tutupButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel hapusButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jumlahTugasComboBox;
    private javax.swing.JLabel jumlahTugasLable;
    private javax.swing.JLabel kodePekerjaanLable;
    private javax.swing.JTextField kodePekerjaanTextField;
    private javax.swing.JButton lihatButton;
    private javax.swing.JLabel namaPekerjaanLable;
    private javax.swing.JTextField namaPekerjaanTextField;
    private javax.swing.JButton simpanButton;
    private javax.swing.JButton tutupButton;
    // End of variables declaration//GEN-END:variables
}
