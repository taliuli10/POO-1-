/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioheranca;

/**
 *
 * @author alunolab11
 */
public class contaPoupanca extends Conta {

    public contaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }
    
    
    public void sacar(double valor){
        super.Sacar(valor + 15);
    }
    
    public void aplicarRendimento(){
        saldo += saldo * 0.005;
    }
    
    public String toString(){
        return "conta poupanca - saldo: R$" + saldo;
    }
}
