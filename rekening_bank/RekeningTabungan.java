/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rekening_bank;

/**
 *
 * @author Ammar Arifin
 */
public class RekeningTabungan extends Rekening {
    public RekeningTabungan(String noRek,double saldo){super(noRek,saldo);}
    public void tarik(double jumlah){
        if(saldo>=jumlah) saldo-=jumlah;
        System.out.println("Tarik Tabungan: Saldo "+saldo);
    }
}