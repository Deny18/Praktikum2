/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Person5 {
    private String nama, jenisKelamin;
    private int umur;
    
    //setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJenisKelamin(String gender){
        this.jenisKelamin = gender;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    //getter
    public String getNama(){
        return this.nama;
    }
    public String getJenisKelamin(){
        return this.jenisKelamin;
    }
    public int getUmuri(){
        return this.umur;
    }
}
