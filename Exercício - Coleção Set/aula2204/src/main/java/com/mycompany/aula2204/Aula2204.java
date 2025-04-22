/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2204;

/**
 *
 * @author alunolab11
 */
public class Aula2204 {
 
    public static void main(String[] args) {
        Evento evento = new Evento("Evento Técnico de TI");


        Participante p1 = new Participante("Carlos Silva", "carlos@exemplo.com");
        Participante p2 = new Participante("Ana Souza", "ana@exemplo.com");
        Participante p3 = new Participante("José Oliveira", "jose@exemplo.com");
        Participante p4 = new Participante("Carlos Silva", "carlos@exemplo.com"); 


        evento.adicionarParticipante(p1);
        evento.adicionarParticipante(p2);
        evento.adicionarParticipante(p3);
        evento.adicionarParticipante(p4);  


        evento.listarParticipantes();


        evento.removerParticipante("ana@exemplo.com");


        evento.listarParticipantes();
    }
}
    

