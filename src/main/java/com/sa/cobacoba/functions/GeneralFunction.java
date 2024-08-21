/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sa.cobacoba.functions;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author jasonevan
 */
public class GeneralFunction {
    
    public static int getLaba(java.sql.Connection cons, String nomorNotaString) {
        String query = "SELECT nama_barang, harga_barang, qty_barang FROM jual WHERE nomor_nota = ?";
        
        int totalLaba = 0;
        try (java.sql.PreparedStatement stmt = cons.prepareStatement(query))
        {
            stmt.setString(1, nomorNotaString);
            java.sql.ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                
                int laba = 0;
                String namaBarangString = resultSet.getString("nama_barang");
                int hargaJual = resultSet.getInt("harga_barang");
                int qty = resultSet.getInt("qty_barang");
                
                
                int hargaBeli = 0;
                query = "SELECT harga_barang FROM stock WHERE nama_barang = ?";
                try (java.sql.PreparedStatement stmt2 = cons.prepareStatement(query))
                {
                    stmt2.setString(1, namaBarangString);
                    java.sql.ResultSet result = stmt2.executeQuery();
                    while (result.next()) {
                        hargaBeli = result.getInt("harga_barang");
                    }
                }
                
                
                laba = (hargaJual - hargaBeli) * qty;
                totalLaba += laba;
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            return 0;
        }
        
        return totalLaba;
    }
    
    public static java.sql.Date date2SQLDate(String tanggalNotaString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        java.sql.Date sqlDate;
        try {
            java.util.Date parsedDate = simpleDateFormat.parse(tanggalNotaString);
            sqlDate = new java.sql.Date(parsedDate.getTime());
        } catch (java.text.ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Gagal dapat tanggal, format tanggal mungkin salah", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return sqlDate;
    }
    
    public static String sqlDate2String(java.sql.Date sqlDate) {
        // METHOD PARSE: Ubah String (dengan format tertentu) -> Date
        // METHOD FORMAT: Ubah Date -> String (dengan format tertentu)
        
        String dateString;
        try {
            SimpleDateFormat databaseFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = databaseFormat.parse(String.valueOf(sqlDate));
            
            SimpleDateFormat displayFormat = new SimpleDateFormat("dd-MM-yyyy");
            dateString = displayFormat.format(date);
        } catch (ParseException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Gagal dapat tanggal, format tanggal mungkin salah", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return dateString;
    }
}
