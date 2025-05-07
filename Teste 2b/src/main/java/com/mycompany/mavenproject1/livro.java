/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.*;
        
public class livro {
    private String titulo;
    private int anoPublic;
    private Editora editora;
    private List<Autor> autores = new ArrayList<>();;
    
    public livro(String titulo, int anoPublic, Editora editora){
        this.titulo = titulo;
        this.anoPublic = anoPublic;
        this.editora = editora;
    }
    
    public void adcAutor(Autor autor){
        autores.add(autor);
    }
    
    public String toString(){
        return titulo + anoPublic + "Editora: " + editora +  autores;
    }
}
