/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2204;

/**
 *
 * @author alunolab11
 */
import java.util.HashSet;
import java.util.Set;

class Evento {
    private String nome;
    private Set<Participante> participantes;

    public Evento(String nome) {
        this.nome = nome;
        this.participantes = new HashSet<>();
    }

    public void adicionarParticipante(Participante participante) {
        if (participantes.add(participante)) {
            System.out.println(participante.getNome() + " foi adicionado ao evento.");
        } else {
            System.out.println("Participante com e-mail " + participante.getEmail() + " já está cadastrado.");
        }
    }

    public void removerParticipante(String email) {
        boolean removido = participantes.removeIf(participante -> participante.getEmail().equals(email));
        if (removido) {
            System.out.println("Participante com e-mail " + email + " removido do evento.");
        } else {
            System.out.println("Nenhum participante encontrado com o e-mail " + email + ".");
        }
    }

    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("Não há participantes cadastrados.");
        } else {
            System.out.println("Lista de participantes do evento '" + nome + "':");
            for (Participante participante : participantes) {
                System.out.println(participante);
            }
        }
    }
}

