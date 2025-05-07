/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab08
 */
public class Editora {
    private String nome;
    private String email;
    
    public Editora(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    
    public String toString(){
        return nome + " (" + email + ")";
    }
}
