/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro_escolar;

/**
 *
 * @author veronica62924506
 */
public class Cadastro_Escolar {

    public static void main(String[] args) {

        Pessoa aluno = new Aluno("Verônica");
        Pessoa professor = new Professor("Carlos");

        aluno.apresentar();
        professor.apresentar();
    }
}
    
