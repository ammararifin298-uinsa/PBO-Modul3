/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Ammar Arifin
 */
public class Majalah extends Item {
    private String edisi; private int volume;
    public Majalah(String j,int t,String e,int v){super(j,t);edisi=e;volume=v;}
    public void tampil(){System.out.println("Majalah: "+judul+", Edisi "+edisi+", Vol."+volume+" ("+tahun+")");}
}