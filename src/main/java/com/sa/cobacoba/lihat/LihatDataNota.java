/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sa.cobacoba.lihat;

import com.sa.cobacoba.functions.GeneralFunction;

public class LihatDataNota extends javax.swing.JPanel {

    java.sql.Connection cons;
    public LihatDataNota(java.sql.Connection conn) {
        cons = conn;
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        nomorNota = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1350, 665));
        setPreferredSize(new java.awt.Dimension(1350, 665));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setMinimumSize(new java.awt.Dimension(1350, 130));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nomor Nota");

        nomorNota.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        nomorNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorNotaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomorNota, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(969, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomorNota, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(16, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 0));

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Nota", "Tanggal Nota", "Nama Client", "Kota", "Nama Barang", "Qty Barang", "Harga Satuan", "Total Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void nomorNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorNotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        if (tblModel.getRowCount() != 0)
            tblModel.setRowCount(0);
        
        if (nomorNota.getText().isEmpty())
            return;
        
        try {
            Integer.parseInt(nomorNota.getText());
        } catch (java.lang.NumberFormatException e) {
            return;
        }
        
        String nomorNotaString = nomorNota.getText();        
        String query = "SELECT "
                + "j.nomor_nota, j.tanggal_nota, j.nama_barang, j.harga_barang, j.qty_barang, j.total_harga, "
                + "c.nama_client, c.kota_client "
                + "FROM jual j LEFT JOIN client c "
                + "ON j.id_client = c.id "
                + "WHERE j.nomor_nota LIKE '" + nomorNotaString + "%'"
                + "ORDER BY j.tanggal_nota, j.created_at";
        
        String nomorNotaTable, nama, kota, namaBarang;
        java.sql.Date sqlDate;
        int qtyBarang, totalHarga, hargaBarang;
        long totalHargaSemua = 0;
        try (java.sql.Statement stmt = cons.createStatement()) {
            java.sql.ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                nomorNotaTable = resultSet.getString("nomor_nota");
                sqlDate = resultSet.getDate("tanggal_nota");
                nama = resultSet.getString("nama_client");
                kota = resultSet.getString("kota_client");      
                namaBarang = resultSet.getString("nama_barang");
                hargaBarang = resultSet.getInt("harga_barang");
                qtyBarang = resultSet.getInt("qty_barang");
                totalHarga = resultSet.getInt("total_harga");
                totalHargaSemua += (long) totalHarga;
                
                String[] row = {nomorNotaTable, 
                                GeneralFunction.sqlDate2String(sqlDate), 
                                nama, kota, namaBarang, String.valueOf(qtyBarang), 
                                String.format("%,d", hargaBarang), 
                                String.format("%,d", totalHarga)};
                tblModel.addRow(row);
            }
            
            String[] row = {"", "", "TOTAL", "", "", "", "", String.format("%,d", totalHargaSemua)};
            System.out.println(String.format("%,d", totalHargaSemua));
            tblModel.addRow(row);
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error querying data nota", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomorNota;
    // End of variables declaration//GEN-END:variables
}
