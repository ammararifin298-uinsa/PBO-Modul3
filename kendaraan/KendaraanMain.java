/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author Ammar Arifin
 */
import java.util.Scanner;
public class KendaraanMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Pilih kendaraan (mobil/motor): ");
        String pilih=sc.nextLine();
        Kendaraan k=pilih.equalsIgnoreCase("mobil")?new Mobil():new Motor();
        k.nyalakanMesin();
        k.matikanMesin();
        sc.close();
    }
}