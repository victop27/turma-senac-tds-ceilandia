/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca;

/**
 *
 * @author ana60397316
 */
public class Livro {
    String Titulo;
    String Autor;
    String Genero;
    int anoPublicacao;
    int numeroPaginas;
    int anoAtual;
    int idade;
    double Preco;
    
public Livro (String tituloInformado, String autorInformado, String generoInformado,int anoPublicacaoInf, int numeroPaginasInf,
        double precoInformado){
   Titulo = tituloInformado;
   Autor = autorInformado;
   Genero = generoInformado;
   anoPublicacao = anoPublicacaoInf;
   numeroPaginas = numeroPaginasInf;
   anoAtual = 2026;
   Preco = precoInformado;
}
public void calcular(){
  idade = anoAtual - anoPublicacao ; 
System.out.println("Idade é" + idade);
}
}
