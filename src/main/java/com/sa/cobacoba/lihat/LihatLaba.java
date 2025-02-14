/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sa.cobacoba.lihat;

import com.sa.cobacoba.functions.GeneralFunction;

public class LihatLaba extends javax.swing.JPanel {

    java.sql.Connection cons;
    public LihatLaba(java.sql.Connection conn) {
        cons = conn;
        initComponents();
        setComboBox();
    }
    
    private void setComboBox() {
        for (int i = 0; i < 12; i++) {
            pilihanBulan.addItem(String.valueOf((i+1) + "-" + "2024"));
        }
        pilihanBulan.setSelectedIndex(-1);
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
        pilihanBulan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1350, 665));
        setPreferredSize(new java.awt.Dimension(1350, 665));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 130));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bulan");

        pilihanBulan.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

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
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pilihanBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(938, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pilihanBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Nota", "Tanggal Nota", "Nama Langganan", "Total", "Laba"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        if (tblModel.getRowCount() != 0) {
            tblModel.setRowCount(0);
        }
        
        int bulan = 0, tahun = 0;
        try (java.util.Scanner scan = new java.util.Scanner(pilihanBulan.getSelectedItem().toString())){
            scan.useDelimiter("-");
            bulan = scan.nextInt();
            tahun = scan.nextInt();
        } catch (java.lang.NullPointerException e) {
            return;
        }
        
        String query = "SELECT nama_sales FROM salesman";
        try (java.sql.Statement stmt = cons.createStatement())
        {
            java.sql.ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                
                String namaSalesString = resultSet.getString("nama_sales");
                tblModel.addRow(new String[] {
                    namaSalesString,
                    "",
                    "",
                    "",
                    ""
                });
                
                long totalNota = 0, totalLaba = 0;
                
                query = "SELECT "
                            + "co.nomor_nota, "
                            + "co.tanggal_nota, "
                            + "co.total, "
                            + "co.nama_sales, "
                            + "c.nama_client, "
                            + "c.kota_client "
                        + "FROM ( "
                            + "SELECT "
                                + "id_client, "
                                + "nomor_nota, "
                                + "tanggal_nota, "
                                + "SUM(total_harga) AS total, "
                                + "nama_sales "
                            + "FROM jual "
                            + "WHERE "
                                + "YEAR(tanggal_nota) = ? AND MONTH(tanggal_nota) = ? "
                            + "GROUP BY " 
                                + "id_client, nomor_nota, tanggal_nota, nama_sales "
                        + ") AS co "
                        + "LEFT JOIN client c "
                        + "ON co.id_client = c.id "
                        + "WHERE co.nama_sales = ? "
                        + "ORDER BY co.tanggal_nota";
                try (java.sql.PreparedStatement stmt2 = cons.prepareStatement(query))
                {
                    stmt2.setInt(1, tahun);
                    stmt2.setInt(2, bulan);
                    stmt2.setString(3, namaSalesString);
                    java.sql.ResultSet result = stmt2.executeQuery();
                    while (result.next()) {
                        
                        String nomorNotaString = result.getString("nomor_nota");
                        int nilaiNota = result.getInt("total");
                        totalNota += (long) nilaiNota;
                        
                        int laba = GeneralFunction.getLaba(cons, nomorNotaString);
                        totalLaba += (long) laba;
                        
                        String nama = result.getString("nama_client");
                        String kota = result.getString("kota_client");
                        if (kota != null) {
                            nama = nama.concat("/");
                            nama = nama.concat(kota);
                        }
                        
                        tblModel.addRow(new String[] {
                            nomorNotaString,
                            GeneralFunction.sqlDate2String(result.getDate("tanggal_nota")),
                            nama,
                            String.format("%,d", nilaiNota),
                            String.format("%,d", laba)
                        });
                        
                    }
                }
                
                tblModel.addRow(new String[] {
                    "TOTAL",
                    "",
                    "",
                    String.format("%,d", totalNota),
                    String.format("%,d", totalLaba),
                });
                
                tblModel.addRow(new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                });
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> pilihanBulan;
    // End of variables declaration//GEN-END:variables
}
