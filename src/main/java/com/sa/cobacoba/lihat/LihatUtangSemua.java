/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sa.cobacoba.lihat;

import com.sa.cobacoba.functions.GeneralFunction;

public class LihatUtangSemua extends javax.swing.JPanel {

    java.sql.Connection cons;
    public LihatUtangSemua(java.sql.Connection conn) {
        cons = conn;
        initComponents();
        seeAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1350, 665));
        setPreferredSize(new java.awt.Dimension(1350, 665));
        setLayout(new java.awt.BorderLayout());

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Cli", "Kota", "Nomor Nota", "Tanggal Nota", "Nilai Transaksi", "Lunas Nota", "Tanggal Lunas", "Saldo Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void seeAll() {
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        if (tblModel.getRowCount() != 0) {
            tblModel.setRowCount(0);
        }
        
        
        long totalNilaiNota = 0, totalLunasNota = 0;
        boolean adaPelunasan = false;
        try (java.sql.Statement stmt = cons.createStatement())
        {
            java.sql.ResultSet resultSet = stmt.executeQuery("SELECT b.nomor_nota, b.tanggal_nota, b.nilai_nota, "
                + "c.nama_client, c.kota_client, c.id "
                + "FROM bnota b JOIN client c "
                + "ON b.id_client = c.id "
                + "ORDER BY b.tanggal_nota");
            
            while (resultSet.next()) {
                int idClient = resultSet.getInt("id");
                String nama = resultSet.getString("nama_client");
                String kota = resultSet.getString("kota_client");
                String nomor_nota = resultSet.getString("nomor_nota");
                String tanggal_nota = GeneralFunction.sqlDate2String(resultSet.getDate("tanggal_nota"));
                int nilaiNotaInt = resultSet.getInt("nilai_nota");
                totalNilaiNota += (long) nilaiNotaInt;
                String nilai_nota = String.format("%,d", nilaiNotaInt);
                int saldoNotaInt = nilaiNotaInt;
                adaPelunasan = false;
                
                try (java.sql.PreparedStatement stmt2 = cons.prepareStatement("SELECT tanggal_lunas, lunas_nota "
                        + "FROM blunas WHERE id_client = ? AND nomor_nota = ? "
                        + "ORDER BY tanggal_lunas"))
                {
                    stmt2.setInt(1, idClient);
                    stmt2.setString(2, nomor_nota);
                    java.sql.ResultSet result = stmt2.executeQuery();
                    while (result.next()) {
                        
                        adaPelunasan = true;
                        String tanggal_lunas = GeneralFunction.sqlDate2String(result.getDate("tanggal_lunas"));
                        int lunasNotaInt = result.getInt("lunas_nota");
                        totalLunasNota += (long) lunasNotaInt;
                        String lunas_nota = String.format("%,d", lunasNotaInt);
                        saldoNotaInt -= lunasNotaInt;
                        
                        String[] row = {
                            nama,
                            (kota == null) ? "" : kota,
                            nomor_nota,
                            tanggal_nota,
                            nilai_nota,
                            lunas_nota,
                            tanggal_lunas,
                            String.valueOf(saldoNotaInt)
                        };
                        
                        tblModel.addRow(row);
                    }
                    
                    if (!adaPelunasan) {
                        String[] row = {
                            nama,
                            (kota == null) ? "" : kota,
                            nomor_nota,
                            tanggal_nota,
                            nilai_nota,
                            "0",
                            "",
                            nilai_nota
                        };
                        tblModel.addRow(row);
                    }
                    
                    String[] row = {"","","","","","","",""};
                    tblModel.addRow(row);
                }
                
            }
            
            long saldoNotaTerakhir = totalNilaiNota - totalLunasNota;
            String[] row = {"", "", "TOTAL", "", String.format("%,d", totalNilaiNota), String.format("%,d", totalLunasNota), 
                            "", String.format("%,d", saldoNotaTerakhir)};
            
            tblModel.addRow(row);
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
