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
    int numero;
    String name;
    double limite;
    double saldo;
    
    
    void Sacar(double v){
        System.out.println("Insira sua conta: ");
        if(v > saldo){
            system.out.println("ERRO: Saldo insuficiente.")
            
        } else{
            saldo -= v;
        }
    }

    
    void depostar(double v){
        saldo += v;
        
        
    }
}
