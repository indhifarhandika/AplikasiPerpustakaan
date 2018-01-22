/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationbelajar;



/**
 *
 * @author linux
 */
public class User {
    
    private int no;
    private int kode_buku;
    private String buku;
    private String tgl_pinjam;
    private String tgl_kembali;
    private String status;
    private int nis;
    
    public User(int no, int kode_buku, String buku, String tgl_pinjam, String tgl_kembali, String status, int nis){
        this.no = no;
        this.kode_buku = kode_buku;
        this.buku = buku;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.status = status;
        this.nis = nis;
    }
    
    public int getNo(){
        return no;
    }
    
    public int getKodeBuku(){
        return kode_buku;
    }
    
    public String getBuku(){
        return buku;
    }
    
    public String getTglPinjam(){
        return tgl_pinjam;
    }
    
    public String getTglKembali(){
        return tgl_kembali;
    }
    
    public String getStatus(){
        return status;
    }
    
    public int getNis(){
        return nis;
    }
}
