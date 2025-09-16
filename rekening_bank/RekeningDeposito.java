/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rekening_bank;

/**
 *
 * @author Ammar Arifin
 */
public class RekeningDeposito extends Rekening {
    public RekeningDeposito(String noRek,double saldo){super(noRek,saldo);}
    public void tarik(double jumlah){
        System.out.println("Deposito tidak bisa ditarik sebelum jatuh tempo!");
    }
}