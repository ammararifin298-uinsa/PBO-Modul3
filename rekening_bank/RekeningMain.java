/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rekening_bank;

/**
 *
 * @author Ammar Arifin
 */
public class RekeningMain {
    public static void main(String[] args){
        Rekening r1=new RekeningTabungan("001",1000000);
        Rekening r2=new RekeningGiro("002",500000);
        Rekening r3=new RekeningDeposito("003",2000000);
        r1.setor(200000); r1.tarik(300000);
        r2.tarik(800000); r3.tarik(500000);
    }
}