/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sa.cobacoba.setting;

/**
 *
 * @author jasonevan
 */
public class SettingWindow extends javax.swing.JFrame {

    java.sql.Connection cons;
    public SettingWindow(java.sql.Connection conn) {
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

        dataPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        restoreMenu = new javax.swing.JMenu();
        backupMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 750));

        dataPanel.setBackground(new java.awt.Color(51, 51, 51));
        dataPanel.setLayout(new java.awt.BorderLayout());

        jMenuBar1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(78, 30));

        restoreMenu.setText("Restore");
        restoreMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restoreMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(restoreMenu);

        backupMenu.setText("Backup");
        backupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backupMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(backupMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backupMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupMenuMouseClicked
        
    }//GEN-LAST:event_backupMenuMouseClicked

    private void restoreMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restoreMenuMouseClicked
        RestorePanel restore = new RestorePanel(cons, this);
        
        dataPanel.removeAll();
        dataPanel.add(restore, java.awt.BorderLayout.CENTER);
        dataPanel.revalidate();
        dataPanel.repaint();
    }//GEN-LAST:event_restoreMenuMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu backupMenu;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu restoreMenu;
    // End of variables declaration//GEN-END:variables
}
