/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alat_elektronik;

/**
 *
 * @author Ammar Arifin
 */
import java.util.Scanner;
public class AlatElektronikMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Pilih alat (tv/radio): ");
        String pilih=sc.nextLine();
        AlatElektronik alat=pilih.equalsIgnoreCase("tv")?new Televisi():new Radio();
        alat.hidupkan();
        alat.matikan();
        sc.close();
    }
}