/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab08
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Editora e1 = new Editora("teste", "teste@gmail.com");
        Editora e2 = new Editora("dsadasdsa0", "dsadasd@dasdsa");
        
        Autor a1 = new Autor("aaaa", "bbbb");
        Autor a2 = new Autor("bbbb", "cccccc");
        
        a1.adcContato("email", "testeee@gmail.com");
        a2.adcContato("telefone", "362158792");
        
        livro l1 = new livro("teste", 2023, e1);
        livro l2 = new livro("aaaaa", 2025, e2);
        
        System.out.println(l1);
        System.out.println(l2);
    }
}
