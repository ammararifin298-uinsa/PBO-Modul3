/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Ammar Arifin
 */
public class Buku extends Item {
    private String pengarang; private int halaman;
    public Buku(String j,int t,String p,int h){super(j,t);pengarang=p;halaman=h;}
    public void tampil(){System.out.println("Buku: "+judul+", "+pengarang+", "+halaman+" halaman ("+tahun+")");}
}