/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12_03_2025_ClasseTeste;

/**
 *
 * @author alunolab12
 */
public class Teste {
    
    public static int quantidade = 0;
    
    
    public int a;
    public int b;
    private int c;
    
     public Teste(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
        quantidade++;
    }
    
    public Teste(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Para ver o private inr c ( NA MAIN ):
    public int getC(){
        return this.c;
    }
    
    // Para modificar o private int c ( NA MAIN ): 
    public void setC(int c){
        this.c = c;
    } 
    
    public void ImprimeA (){
        System.out.println(this.a);
    }
    
    public void ImprimeB (){
        System.out.println(this.b);
    }
    
    public void ImprimeC (){
        System.out.println(this.c);
    }
    
    public static void Imprimir(){
        boolean qunatidade;
        System.out.println(quantidade);
    }
}