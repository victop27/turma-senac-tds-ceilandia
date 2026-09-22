/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_escolar;

/**
 *
 * @author veronica62924506
 */
public class Professor extends Pessoa {

    public Professor(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou o professor. Me chamo " + nome);
    }
}
