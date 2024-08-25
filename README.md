# SETUP SEBELUM PAKAI

1. **Download [Java 22](https://www.oracle.com/java/technologies/downloads/#jdk22-mac) dan [MySQL](https://dev.mysql.com/downloads/mysql/)**

2. Buat Database MySQL dengan nama `db_sa`, atau bisa dengan perintah berikut:
```bash
CREATE DATABASE db_sa;

USE db_sa
```

3. Buat table dengan salid kode sebagai berikut:
- Table Stock
```bash
CREATE TABLE stock (
    id INT NOT NULL AUTO_INCREMENT,
    nama_barang VARCHAR(50) NOT NULL,
    stock_awal INT NOT NULL,
    stock_akhir INT NOT NULL,
    harga_barang INT NOT NULL,
    qty_in INT NOT NULL,
    qty_out INT NOT NULL,
    jual_barang INT NULL,
    satuan_barang VARCHAR(10) NOT NULL,
    modal INT NOT NULL,
    rusak_barang INT NOT NULL DEFAULT 0,
    PRIMARY KEY (id)
);
```