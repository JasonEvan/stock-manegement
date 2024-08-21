/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sa.cobacoba.pelunasan;

public class PelunasanPiutang extends javax.swing.JPanel {

    java.sql.Connection cons;
    javax.swing.JFrame parentFrame;
    public PelunasanPiutang(java.sql.Connection conn, javax.swing.JFrame parentFrame) {
        cons = conn;
        this.parentFrame = parentFrame;
        initComponents();
        setComboBox();
        peringatan.setVisible(false);
    }
    
    private void setComboBox() {
        try (java.sql.Statement stmt = cons.createStatement())
        {
            java.sql.ResultSet resultSet = stmt.executeQuery("SELECT nama_client, kota_client FROM client ORDER BY nama_client");
            while (resultSet.next()) {
                String nama = resultSet.getString("nama_client");
                nama = nama.concat("/");
                nama = nama.concat(resultSet.getString("kota_client"));
                namaClient.addItem(nama);
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        } finally {
            namaClient.setSelectedIndex(-1);
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

        jPanel1 = new javax.swing.JPanel();
        sidebarPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaClient = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nomorTransaksi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tanggalLunas = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        dataPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomorNota = new javax.swing.JComboBox<>();
        peringatan = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        pelunasanButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lunasNota = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNota = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(800, 476));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 476));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 661));
        jPanel1.setLayout(new java.awt.BorderLayout());

        sidebarPanel.setBackground(new java.awt.Color(102, 102, 102));
        sidebarPanel.setPreferredSize(new java.awt.Dimension(200, 476));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lunas Piutang");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Client");

        namaClient.setToolTipText("");
        namaClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaClientActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nomor Transaksi");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Lunas");

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(51, 51, 51));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorder(null);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("dd-MM-yyyy");

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(namaClient, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nomorTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tanggalLunas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaClient, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomorTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalLunas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 87, Short.MAX_VALUE))
        );

        jPanel1.add(sidebarPanel, java.awt.BorderLayout.WEST);

        dataPanel.setBackground(new java.awt.Color(102, 102, 102));
        dataPanel.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(630, 150));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nomor Nota");

        nomorNota.setToolTipText("");
        nomorNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorNotaActionPerformed(evt);
            }
        });

        peringatan.setForeground(new java.awt.Color(255, 0, 0));
        peringatan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peringatan.setText("jLabel9");

        addButton.setBackground(new java.awt.Color(51, 51, 51));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(51, 51, 51));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        pelunasanButton.setBackground(new java.awt.Color(51, 51, 51));
        pelunasanButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        pelunasanButton.setForeground(new java.awt.Color(255, 255, 255));
        pelunasanButton.setText("Pelunasan");
        pelunasanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelunasanButtonActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lunas Nota");

        updateButton.setBackground(new java.awt.Color(51, 51, 51));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peringatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomorNota, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lunasNota)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(pelunasanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomorNota))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pelunasanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lunasNota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peringatan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dataPanel.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        tableNota.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tableNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Nota", "Nilai Nota", "Lunas Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNota);

        dataPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(dataPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try {
            cons.close();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        new com.sa.cobacoba.MainWindow().setVisible(true);
        parentFrame.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        boolean salah = validateAll();
        if (!salah) {
            dataPanel.setVisible(true);
            namaClient.setEditable(false);
            namaClient.setEnabled(false);
            nomorTransaksi.setEditable(false);
            nomorTransaksi.setEnabled(false);
            tanggalLunas.setEditable(false);
            tanggalLunas.setEnabled(false);
            submitButton.setEnabled(false);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private boolean validateAll() {
        try {
            if (namaClient.getSelectedItem().toString().isEmpty()) {
                throw new java.lang.NullPointerException("Nama client kosong");
            }
            
            if (nomorTransaksi.getText().isEmpty()) {
                throw new java.lang.NullPointerException("Nomor transaksi kosong");
            }
            
            if (tanggalLunas.getText().isEmpty()) {
                throw new java.lang.NullPointerException("Tanggal lunas kosong");
            }
        } catch (java.lang.NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
    
    private void nomorNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorNotaActionPerformed
        String nomorNotaString;
        try {
            nomorNotaString = nomorNota.getSelectedItem().toString();
        } catch (java.lang.NullPointerException e) {
            return;
        }
        
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("SELECT saldo_nota FROM jnota WHERE nomor_nota = ?"))
        {
            stmt.setString(1, nomorNotaString);
            java.sql.ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                lunasNota.setText(String.valueOf(resultSet.getInt("saldo_nota")));
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nomorNotaActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String nomorNotaString;
        try {
            nomorNotaString = nomorNota.getSelectedItem().toString();
        } catch (java.lang.NullPointerException e) {
            javax.swing.Timer timer = new javax.swing.Timer(5000, e2 -> peringatan.setVisible(false));
            timer.setRepeats(false);
            peringatan.setText(e.getMessage());
            peringatan.setVisible(true);
            timer.start();
            return;
        }
        
        String lunasNotaString = lunasNota.getText();
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) tableNota.getModel();
        
        for (int i = 0; i < tblModel.getRowCount(); i++) {
            String nomorNotaTable = tblModel.getValueAt(i, 0).toString();
            if (nomorNotaString.equals(nomorNotaTable)) {
                javax.swing.Timer timer = new javax.swing.Timer(5000, e -> peringatan.setVisible(false));
                timer.setRepeats(false);
                peringatan.setText("Nota sudah terinput");
                peringatan.setVisible(true);
                timer.start();
                return;
            }
        }
        
        int saldoNotaInt = 0;
        int nilaiNotaInt = 0;
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("SELECT saldo_nota, nilai_nota FROM jnota "
                    + "WHERE nomor_nota = ?"))
        {
            stmt.setString(1, nomorNota.getSelectedItem().toString());
            java.sql.ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                saldoNotaInt = resultSet.getInt("saldo_nota");
                nilaiNotaInt = resultSet.getInt("nilai_nota");
            }
        } catch(java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        boolean salah = validateForm(saldoNotaInt);
        if (salah) 
            return;
        

        
        // MASUKIN KE TABLE
        String[] data = {nomorNotaString, String.valueOf(nilaiNotaInt), lunasNotaString};
        tblModel.addRow(data);
        

        // SET DEFAULT VALUES
        nomorNota.setSelectedIndex(-1);
        lunasNota.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private boolean validateForm(int saldoNotaInt) {
        try
        {
            if (nomorNota.getSelectedItem().toString().isEmpty())
                throw new java.lang.NullPointerException("Nomor nota kosong");
            
            
            if (lunasNota.getText().isEmpty())
                throw new java.lang.NullPointerException("Harga pelunasan kosong");
            
            
            if (Integer.parseInt(lunasNota.getText()) > saldoNotaInt)
                throw new java.lang.NullPointerException("Pelunasan berlebih");
            
        } catch (java.lang.NullPointerException e) {
            javax.swing.Timer timer = new javax.swing.Timer(5000, e2 -> peringatan.setVisible(false));
            timer.setRepeats(false);
            peringatan.setText(e.getMessage());
            peringatan.setVisible(true);
            timer.start();
            return true;
        }
        
        return false;
    }
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) tableNota.getModel();
        if (tableNota.getSelectedRowCount() == 1) {
            int status = javax.swing.JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus?", "DELETE", javax.swing.JOptionPane.YES_NO_OPTION);
            if (status == 0) {
                // HAPUS
                tblModel.removeRow(tableNota.getSelectedRow());

                // SET ALL DEFAULT VALUES
                nomorNota.setSelectedIndex(-1);
                lunasNota.setText("");

                javax.swing.JOptionPane.showMessageDialog(null, "SUCCESS DELETING", "SUCCESS", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Pilih satu row", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void tableNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNotaMouseClicked
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) tableNota.getModel();

        String notaString = tblModel.getValueAt(tableNota.getSelectedRow(), 0).toString();
        String lunasString = tblModel.getValueAt(tableNota.getSelectedRow(), 2).toString();

        nomorNota.setSelectedItem(notaString);
        lunasNota.setText(lunasString);
    }//GEN-LAST:event_tableNotaMouseClicked

    private void namaClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaClientActionPerformed
        String namaClientString;
        try {
            namaClientString = namaClient.getSelectedItem().toString();
        } catch (java.lang.NullPointerException e) {
            return;
        }
        
        
        int id = 0;
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("SELECT id FROM client "
                + "WHERE nama_client = ? AND kota_client = ?");
                java.util.Scanner scan = new java.util.Scanner(namaClientString))
        {
            scan.useDelimiter("/");
            String nama = scan.next();
            String kota = scan.next();
            
            stmt.setString(1, nama);
            stmt.setString(2, kota);
            java.sql.ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        
        nomorNota.removeAllItems();
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("SELECT nomor_nota FROM jnota "
                + "WHERE id_client = ? AND saldo_nota != 0"))
        {
            stmt.setInt(1, id);
            java.sql.ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                nomorNota.addItem(resultSet.getString("nomor_nota"));
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        } finally {
            nomorNota.setSelectedIndex(-1);
            lunasNota.setText("");
        }
    }//GEN-LAST:event_namaClientActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (tableNota.getSelectedRowCount() != 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Pilih satu row", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) tableNota.getModel();
        int saldoNotaInt = 0;
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("SELECT saldo_nota FROM jnota WHERE nomor_nota = ?"))
        {
            stmt.setString(1, nomorNota.getSelectedItem().toString());
            java.sql.ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                saldoNotaInt = resultSet.getInt("saldo_nota");
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        
        boolean salah = validateForm(saldoNotaInt);
        if (salah) 
            return;
        
        String lunasNotaString = lunasNota.getText();
        
        // UPDATE TABLE
        tblModel.setValueAt(lunasNotaString, tableNota.getSelectedRow(), 2);
        

        // SET DEFAULT VALUES
        nomorNota.setSelectedIndex(-1);
        lunasNota.setText("");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void pelunasanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelunasanButtonActionPerformed
        // get client id
        int id = 0;
        String namaClientString = namaClient.getSelectedItem().toString();
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("SELECT id FROM client "
                + "WHERE nama_client = ? AND kota_client = ?");
                java.util.Scanner scan = new java.util.Scanner(namaClientString))
        {
            scan.useDelimiter("/");
            String nama = scan.next();
            String kota = scan.next();
            
            stmt.setString(1, nama);
            stmt.setString(2, kota);
            
            java.sql.ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        // GET TODAY DATE IN SQL
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("dd-MM-yyyy");
        java.sql.Date sqlDate = null;
        try {
            java.util.Date parsedDate = simpleDateFormat.parse(tanggalLunas.getText());
            sqlDate = new java.sql.Date(parsedDate.getTime());
        } catch (java.text.ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Gagal dapat tanggal hari ini", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        // LOOPING
        // Hitung totalan lunas nota
        int totalLunas = 0;
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel) tableNota.getModel();
        for (int i = 0; i < tblModel.getRowCount(); i++) {
            int lunasNotaInt = Integer.parseInt(tblModel.getValueAt(i, 2).toString());
            String nomorNotaString = tblModel.getValueAt(i, 0).toString();
            totalLunas += lunasNotaInt;
            
            
        // update lunas_nota dan saldo_nota di jnota
            try (java.sql.PreparedStatement stmt = cons.prepareStatement("UPDATE jnota "
                    + "SET lunas_nota = lunas_nota + ?, saldo_nota = nilai_nota - lunas_nota "
                    + "WHERE nomor_nota = ?"))
            {
                stmt.setInt(1, lunasNotaInt);
                stmt.setString(2, nomorNotaString);
                stmt.executeUpdate();
            } catch (java.sql.SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
        // insert ke jlunas
            try (java.sql.PreparedStatement stmt = cons.prepareStatement("INSERT INTO jlunas "
                    + "(nomor_transaksi, tanggal_lunas, id_client, nomor_nota, lunas_nota) "
                    + "VALUES (?, ?, ?, ?, ?)"))
            {
                stmt.setString(1, nomorTransaksi.getText());
                stmt.setDate(2, sqlDate);
                stmt.setInt(3, id);
                stmt.setString(4, nomorNotaString);
                stmt.setInt(5, lunasNotaInt);
                stmt.execute();
            } catch (java.sql.SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        
        // update sldakhir_piutang di client
        try (java.sql.PreparedStatement stmt = cons.prepareStatement("UPDATE client "
                + "SET sldakhir_piutang = sldakhir_piutang - ? WHERE id = ?"))
        {
            stmt.setInt(1, totalLunas);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        
        // success message
        javax.swing.JOptionPane.showMessageDialog(null, "Berhasil terinput data pelunasan", "SUCCESS", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        try {
            cons.close();
            new com.sa.cobacoba.MainWindow().setVisible(true);
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "CLOSING THE PROGRAM", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_pelunasanButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lunasNota;
    private javax.swing.JComboBox<String> namaClient;
    private javax.swing.JComboBox<String> nomorNota;
    private javax.swing.JTextField nomorTransaksi;
    private javax.swing.JButton pelunasanButton;
    private javax.swing.JLabel peringatan;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTable tableNota;
    private javax.swing.JTextField tanggalLunas;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
