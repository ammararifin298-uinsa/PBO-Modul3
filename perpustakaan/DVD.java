/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Ammar Arifin
 */
public class DVD extends Item {
    private int durasi; private String genre;
    public DVD(String j,int t,int d,String g){super(j,t);durasi=d;genre=g;}
    public void tampil(){System.out.println("DVD: "+judul+", Genre "+genre+", "+durasi+" menit ("+tahun+")");}
}