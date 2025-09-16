/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Ammar Arifin
 */
import java.util.*;
public class PerpustakaanMain {
    public static void main(String[] args){
        ArrayList<Item> daftar=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Tambah item? (buku/majalah/dvd/selesai): ");
        String jenis=sc.nextLine();
        while(!jenis.equalsIgnoreCase("selesai")){
            if(jenis.equalsIgnoreCase("buku")){
                System.out.print("Judul: ");String j=sc.nextLine();
                System.out.print("Tahun: ");int t=sc.nextInt();sc.nextLine();
                System.out.print("Pengarang: ");String p=sc.nextLine();
                System.out.print("Halaman: ");int h=sc.nextInt();sc.nextLine();
                daftar.add(new Buku(j,t,p,h));
            }else if(jenis.equalsIgnoreCase("majalah")){
                System.out.print("Judul: ");String j=sc.nextLine();
                System.out.print("Tahun: ");int t=sc.nextInt();sc.nextLine();
                System.out.print("Edisi: ");String e=sc.nextLine();
                System.out.print("Volume: ");int v=sc.nextInt();sc.nextLine();
                daftar.add(new Majalah(j,t,e,v));
            }else if(jenis.equalsIgnoreCase("dvd")){
                System.out.print("Judul: ");String j=sc.nextLine();
                System.out.print("Tahun: ");int t=sc.nextInt();sc.nextLine();
                System.out.print("Durasi: ");int d=sc.nextInt();sc.nextLine();
                System.out.print("Genre: ");String g=sc.nextLine();
                daftar.add(new DVD(j,t,d,g));
            }
            System.out.print("Tambah item? (buku/majalah/dvd/selesai): ");
            jenis=sc.nextLine();
        }
        System.out.println("\nDaftar Item:");
        for(Item i:daftar){i.tampil();}
        sc.close();
    }
}