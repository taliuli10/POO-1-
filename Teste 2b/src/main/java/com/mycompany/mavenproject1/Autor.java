/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab08
 */
import java.util.*;

public class Autor {
    private String nome;
    private String abrev;
    private List<Contato> contatos = new ArrayList<>();
    
    public Autor(String nome, String abrev){
        this.nome = nome;
        this.abrev = abrev;
    }
 
    public void adcContato(String tipo, String contato){
        contatos.add(new Contato(tipo, contato));
    }
    
    public String toString(){
        return nome + " (" + abrev + ") - Contatos: " + contatos;
    }
}