/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioheranca;

/**
 *
 * @author alunolab11
 */
public abstract class Conta {
    protected double saldo;
    
    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }
    
    public void Sacar(double valor){
        saldo -= valor;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public abstract void aplicarRendimento();
    
    public double getSaldo(){
        return saldo;
    }

}
