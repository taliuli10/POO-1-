/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

/**
 *
 * @author Taliuli
 */
public class Cliente {
    String nome; 
    String cpf;
    String sobrenome;
    Cliente conjuge;
    
    public void Casamento(Cliente conjuge){
        if(this.conjuge != null){
            this.conjuge = conjuge;
            this.conjuge.conjuge = this;
        }else{
            System.out.println(" Ja esta casado.");
        }
    }
}
