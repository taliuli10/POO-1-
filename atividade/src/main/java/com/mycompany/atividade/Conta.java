/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;
/**
 *
 * @author alunolab08
 */
import java.util.Scanner;

public class Conta {
    Scanner scan = new Scanner(System.in);
    
    
    int numero;
    String nome;
    double limite;
    double saldo;
    
    
    void Imprmir(){
        System.out.println("-----------------------");
        System.out.println(nome);
        System.out.println("-----------------------");
        System.out.println("numero:  " +numero);
        System.out.println("Limite: " +limite);
        System.out.println("Saldo: " +saldo);
    }
    
    void Sacar(double v){
        System.out.println("Insira sua conta: ");
        nome = scan.nextLine();
        if(v > saldo){
            System.out.println("ERRO: Saldo insuficiente.");
            
        } else{
            saldo -= v;
            System.out.println("saque de" + v + "realizado com sucesso.");
            System.out.println("seu saldo agora e de: " + saldo);
        }
    }

    
    void Depositar(double v){
        saldo += v;
        
        
    }
}
