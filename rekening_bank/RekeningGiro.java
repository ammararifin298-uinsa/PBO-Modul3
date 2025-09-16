/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rekening_bank;

/**
 *
 * @author Ammar Arifin
 */
public class RekeningGiro extends Rekening {
    public RekeningGiro(String noRek,double saldo){super(noRek,saldo);}
    public void tarik(double jumlah){
        if(saldo-jumlah>=-500000) saldo-=jumlah;
        System.out.println("Tarik Giro: Saldo "+saldo);
    }
}