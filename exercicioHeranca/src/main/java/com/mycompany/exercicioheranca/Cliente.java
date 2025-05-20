/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioheranca;

import java.util.*;
/**
 *
 * @author alunolab11
 */
public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas;
    
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }
    
    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
    
    public void mostrarSaldos(){
        System.out.println("Cliente: " + nome + " - Cpf: " + cpf);
        for(Conta c : contas){
            System.out.println(c);
        }
    }
 
    

    
}
