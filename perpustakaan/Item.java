/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Ammar Arifin
 */
public class Item {
    protected String judul; protected int tahun;
    public Item(String judul,int tahun){this.judul=judul;this.tahun=tahun;}
    public void tampil(){System.out.println(judul+" ("+tahun+")");}
}