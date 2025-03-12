/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;
/**
 *
 * @author alunolab08
 */

public class Conta {
    double saldo;
    double limite;
    int numero;
    Cliente titular;

    public Conta(double saldoInicial, double limite) {
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    Conta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
}
}
