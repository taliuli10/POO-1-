/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioheranca;

/**
 *
 * @author alunolab11
 */
public class contaCorrente extends Conta{
    
    public contaCorrente(double saldoInicial){
        super(saldoInicial);
    }
    
    public void sacar(double valor){
        super.Sacar(valor + 15);
    }
    
    public void aplicarRendimento(){
        saldo += saldo * 0.002;
    }
    
    public String toString(){
        return "conta corrente  - saldo: R$" + saldo;
    }
}
