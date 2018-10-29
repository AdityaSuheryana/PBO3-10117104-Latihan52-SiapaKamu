/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan52.siapakamu;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan nama dan posisinya itu siapa 
 * (Dosen/Mahasiswa)
 */
public class PBO310117104Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
       
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMatakuliah("PBO");
        System.out.println("NIP Dosen : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        mhs.setNama("Nindi");
        mhs.setKelas("PBO2");
        mhs.setUmur(17);
        System.out.println("NIM MAHASISWA : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        
    
    
    
    }
    
}
