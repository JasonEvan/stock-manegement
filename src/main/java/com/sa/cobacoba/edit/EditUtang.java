/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sa.cobacoba.edit;


public class EditUtang extends javax.swing.JPanel {

    java.sql.Connection cons = null;
    private javax.swing.JFrame parentFrame;
    javax.swing.JMenu jMenu1; 
    javax.swing.JMenu jMenu2; 
    javax.swing.JMenu jMenu3;
    javax.swing.JMenu jMenu4;
    public EditUtang(java.sql.Connection conn, javax.swing.JFrame parentFrame,
                     javax.swing.JMenu jMenu1, javax.swing.JMenu jMenu2, javax.swing.JMenu jMenu3, 
                     javax.swing.JMenu jMenu4) {
        this.parentFrame = parentFrame;
        this.jMenu1 = jMenu1;
        this.jMenu2 = jMenu2;
        this.jMenu3 = jMenu3;
        this.jMenu4 = jMenu4;
        
        cons = conn;
        initComponents();
        peringatan.setVisible(false);
        try {
            cons.setAutoCommit(false);
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        nomorNota = new javax.swing.JTextField();
        dataPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lunasNota = new javax.swing.JTextField();
        peringatan = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        submitButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1350, 750));
        setLayout(new java.awt.BorderLayout());

        sidebarPanel.setBackground(new java.awt.Color(51, 51, 51));
        sidebarPanel.setPreferredSize(new java.awt.Dimension(200, 750));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Utang");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nomor Nota");

        okButton.setBackground(new java.awt.Color(102, 102, 102));
        okButton.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(102, 102, 102));
        cancelButton.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        nomorNota.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarPanelLayout.createSequentialGroup()
                        .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomorNota, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sidebarPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomorNota, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );

        add(sidebarPanel, java.awt.BorderLayout.LINE_START);

        dataPanel.setBackground(new java.awt.Color(102, 102, 102));
        dataPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 150));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lunas Nota");

        lunasNota.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        peringatan.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        peringatan.setForeground(new java.awt.Color(255, 0, 0));
        peringatan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peringatan.setText("jLabel7");

        updateButton.setBackground(new java.awt.Color(51, 51, 51));
        updateButton.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        submitButton1.setBackground(new java.awt.Color(51, 51, 51));
        submitButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        submitButton1.setForeground(new java.awt.Color(255, 255, 255));
        submitButton1.setText("Submit");
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lunasNota, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(263, 263, 263)
                                .addComponent(submitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(peringatan, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(507, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(submitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lunasNota, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peringatan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        dataPanel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Transaksi", "Tanggal Lunas", "Nomor Nota", "Nilai Nota", "Lunas Nota", "Saldo Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        dataPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(dataPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String nomorNotaString = nomorNota.getText();
        
        nomorNota.setEditable(false);
        nomorNota.setEnabled(false);
        jMenu1.setEnabled(false);
        jMenu2.setEnabled(false);
        jMenu3.setEnabled(false);
        jMenu4.setEnabled(false);
        
        // kosongin table
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        tblModel.setRowCount(0);

        // tampilin data
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("SELECT "
                + "bl.nomor_transaksi, "
                + "bl.tanggal_lunas, "
                + "bn.nomor_nota, "
                + "bn.nilai_nota, "
                + "bn.lunas_nota, "
                + "bn.saldo_nota "
                + "FROM blunas bl JOIN bnota bn "
                + "ON bl.nomor_nota = bn.nomor_nota "
                + "WHERE bn.nomor_nota LIKE ? "
                + "AND bl.nomor_transaksi IS NOT NULL "
                + "ORDER BY bn.tanggal_nota"))
        {
            stmt.setString(1, nomorNotaString + "%");
            java.sql.ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                String[] row = {
                    resultSet.getString("nomor_transaksi"),
                    String.valueOf(resultSet.getDate("tanggal_lunas")),
                    resultSet.getString("nomor_nota"),
                    String.valueOf(resultSet.getInt("nilai_nota")),
                    String.valueOf(resultSet.getInt("lunas_nota")),
                    String.valueOf(resultSet.getInt("saldo_nota"))
                };
                tblModel.addRow(row);
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        String lunasNotaString = tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();
        
        lunasNota.setText(lunasNotaString);
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        if (jTable1.getSelectedRowCount() != 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Pilih satu row", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        boolean salah = validateFormEdit();
        if (salah)
            return;
                    
        
        String lunasNotaString = lunasNota.getText();
        int lunasNotaInt = Integer.parseInt(lunasNotaString);
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        
        String nomorNotaString = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String nomorTransaksiString = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        int nilaiNotaInt = Integer.parseInt(tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString());
        
        // update to table
        tblModel.setValueAt(lunasNotaString, jTable1.getSelectedRow(), 4);
        tblModel.setValueAt(nilaiNotaInt - lunasNotaInt, jTable1.getSelectedRow(), 5);
        
        // update to database blunas
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("UPDATE blunas "
                + "SET lunas_nota = ? WHERE nomor_nota = ? AND nomor_transaksi = ?"))
        {
            stmt.setInt(1, lunasNotaInt);
            stmt.setString(2, nomorNotaString);
            stmt.setString(3, nomorTransaksiString);
            stmt.executeUpdate();
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        // update to database bnota
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("UPDATE bnota "
                + "SET lunas_nota = ?, saldo_nota = nilai_nota - lunas_nota "
                + "WHERE nomor_nota = ? AND nilai_nota = ?"))
        {
            stmt.setInt(1, lunasNotaInt);
            stmt.setString(2, nomorNotaString);
            stmt.setInt(3, nilaiNotaInt);
            stmt.executeUpdate();
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        // set default values
        lunasNota.setText("");
    }//GEN-LAST:event_updateButtonActionPerformed
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        try {
            cons.rollback();
            cons.close();
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        parentFrame.dispose();
        new com.sa.cobacoba.MainWindow().setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
        try {
            cons.commit();
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        javax.swing.JOptionPane.showMessageDialog(null, "Success Editing", "SUCCESS", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        parentFrame.dispose();
        new com.sa.cobacoba.MainWindow().setVisible(true);
    }//GEN-LAST:event_submitButton1ActionPerformed

    private boolean validateFormEdit() {
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        int nilaiNotaInt = Integer.parseInt(tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString());
        
        try {
            int lunasNotaInt = Integer.parseInt(lunasNota.getText());
            if (lunasNotaInt > nilaiNotaInt)
                throw new Exception("Nilai pelunasan melebihi nilai nota");
        } catch (Exception e) {
            javax.swing.Timer timer = new javax.swing.Timer(5000, e2 -> peringatan.setVisible(false));
            peringatan.setText(e.getMessage());
            timer.setRepeats(false);
            peringatan.setVisible(true);
            timer.start();
            return true;
        }
        
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lunasNota;
    private javax.swing.JTextField nomorNota;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel peringatan;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JButton submitButton1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
