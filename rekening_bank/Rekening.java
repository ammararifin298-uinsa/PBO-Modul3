/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rekening_bank;

/**
 *
 * @author Ammar Arifin
 */
public abstract class Rekening {
    protected String noRek; protected double saldo;
    public Rekening(String noRek,double saldo){this.noRek=noRek;this.saldo=saldo;}
    public void setor(double jumlah){
        saldo+=jumlah;
        System.out.println("Setor: "+jumlah+", Saldo: "+saldo);
    }
    public abstract void tarik(double jumlah);
}