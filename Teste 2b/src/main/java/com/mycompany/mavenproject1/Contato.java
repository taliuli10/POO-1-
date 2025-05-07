/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab08
 */
public class Contato {
    private String tipo;
    private String contato;
    
    public Contato(String tipo, String contato){
        this.tipo = tipo;
        this.contato = contato;
    }
    
    public String toString(){
        return tipo + ": " + contato;
    }
}
