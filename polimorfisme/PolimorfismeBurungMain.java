/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author Ammar Arifin
 */
import java.util.Scanner;
public class PolimorfismeBurungMain {
    public static void main(String[] args){
        Hewan[] hewanArray={new Anjing(),new Kucing(),new Burung()};
        System.out.println("1. Anjing\n2. Kucing\n3. Burung");
        System.out.print("Masukkan pilihan (1-3): ");
        Scanner sc=new Scanner(System.in);
        int pilih=sc.nextInt();
        if(pilih>=1 && pilih<=3) hewanArray[pilih-1].suara();
        else System.out.println("Pilihan tidak valid.");
        sc.close();
    }
}