/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Main5 {
    public static void main(String[] args){
        //Membuat object
        Person5 person1 = new Person5();
        Person5 person2 = new Person5();
        
        //Memanggil atribut dan memberi nilai
        person1.setNama("Anton");
        person2.setNama("Riko");
        
        person1.setJenisKelamin("Laki_laki");
        person2.setJenisKelamin("Laki-laki");
        
        person1.setUmur(22);
        person2.setUmur(24);
        
        System.out.println("Nama\t\t: " + person1.getNama());
        System.out.println("Jenis Kelamin\t: " + person1.getJenisKelamin());
        System.out.println("Umur\t\t: " + person1.getUmuri());
        System.out.println("\nNama\t\t: " + person2.getNama());
        System.out.println("Jenis Kelamin\t: " + person2.getJenisKelamin());
        System.out.println("Umur\t\t: " + person2.getUmuri());
    }
}
