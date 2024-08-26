# SETUP SEBELUM PAKAI

1. **Download [Java 22](https://www.oracle.com/java/technologies/downloads/#jdk22-mac) dan [MySQL](https://dev.mysql.com/downloads/mysql/)**

2. Buat Database MySQL dengan nama `db_sa`, atau bisa dengan perintah berikut:
```bash
CREATE DATABASE db_sa;

USE db_sa
```

3. Buat table dengan salin kode sebagai berikut:
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

- Table Salesman
```bash
CREATE TABLE salesman (
    id INT NOT NULL AUTO_INCREMENT,
    nama_sales VARCHAR(100) NOT NULL,
    no_depan INT NULL,
    no_nota INT NOT NULL,
    no_telp_sales VARCHAR(20) NULL,
    kode_sales VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);
```
