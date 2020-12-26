/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author fadil
 */
public class kasir {
    String Nama_barang;
    int Harga, jumlah, uang, total;
    
public kasir(){
    
}
public kasir(int a){
    jumlah = a;
}

public void setKasir(int jenis_barang){
        switch(jenis_barang){
            case 1:
                Nama_barang = "Pensil";
                Harga = 1500;
                break;
            case 2:
                Nama_barang = "Buku";
                Harga = 2000;
                break;
            case 3:
                Nama_barang = "Penggaris";
                Harga = 4000;
                break;
            case 4:
                Nama_barang = "Penghapus";
                Harga = 2500;
                break;
            case 5:
                Nama_barang = "Bulpoin/pcs";
                Harga = 15000;
                break;
        }
}
private int Hrg(){
    return Harga;
}
public String Nama_barang(){
    return Nama_barang;
}
public int Jumlah(){
    int awalbarang = jumlah * Harga;
    return awalbarang;
}
public int Jumlah(int a, int b){
   uang = a;
   total = b;
   int kembalian = uang - total;
   return kembalian;
}
public String printJumlah(){
    int awalbarang = jumlah * Harga;
    String awal = Integer.toString(awalbarang);
    return awal;
}
public String printJumlah(int a){
    int PH = a;
    String PH1 = Integer.toString(PH);
    return PH1;
}
public String Harga(){
    String harga1 = Integer.toString(Hrg());
    return harga1;
}
public String Banyak(){
    String banyak = Integer.toString(jumlah);
    return banyak;
}
}


