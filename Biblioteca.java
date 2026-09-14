/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.biblioteca;

/**
 *
 * @author ana60397316
 */
public class Biblioteca {

    public static void main(String[] args) {
    Livro Livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Romance/Realismo", 1899, 256, 25.0);
    Livro Livro2 = new Livro("Grande Sertao:Veredas", "João Guimarães Rosa", "Modernismo", 1956, 600, 59.0);
    Livro Livro3 = new Livro("O Alquimista", "Paulo Coelho", "Ficção/filosofia", 1988, 208,  35.0);   
    Livro Livro4 = new Livro("Capitães de Areia", "Jorge Amado", "Romance Social", 1937, 280,30.0);
    Livro Livro5 = new Livro("Vidas Secas", "Graciliano Ramos", "Modernismo", 1938, 176,28.0);
    Livro Livro6 = new Livro("A Hora da Estrela", "Clarice Lispector", "Modernismo", 1977, 88,22.0);
    Livro Livro7 = new Livro("Quincas Borba ", "Machado de Assis", "Realismo", 1891, 288,25.0);
    Livro Livro8 = new Livro("O Cortiço", "Aluisio Azevedo", "Naturalismo", 1890, 320,22.0);
    Livro Livro9 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", "Realismo", 1881, 160,24.0);
    Livro Livro10 = new Livro("Iracema", "José Alencar", "Romance", 1865, 120,18.0);
    Livro Livro11 = new Livro("O Auto da Compadecida", "Ariano Suassuna", "Teatro/Comédia", 195, 208,35.0);
    Livro Livro12 = new Livro("Sítio do Picapau Amarelo", "Monteiro Lobato", "Literatura Infantojuvenil", 1920, 192,27.0);
    Livro Livro13 = new Livro("Ensaio Sobre a Cegueira", "José Saramago", "Ficção Distópica", 1995, 312,48.0);
    Livro Livro14 = new Livro("Cem Anos de Solidão", "Gabriel Garcia Márquez", "Realismo Mágico", 1967, 448,55.0);
    Livro Livro15 = new Livro("1984", "George Orwell", "Ficção Distópica", 1949, 336,40.0);
    
    System.out.println("Titulo" + Livro1.Titulo);
    System.out.println("Autor" + Livro1.Autor);
    System.out.println("Genero" + Livro1.Genero);
    System.out.println("Ano de Publicação" + Livro1.anoPublicacao);
    Livro1.calcular();
    System.out.println("Número de paginas" + Livro1.numeroPaginas);
    System.out.println("Preço" + Livro1.Preco);
    
    
    System.out.println("Titulo" + Livro2.Titulo);
    System.out.println("Autor" + Livro2.Autor);
    System.out.println("Genero" + Livro2.Genero);
    System.out.println("Ano de PUblicação" + Livro2.anoPublicacao);
    Livro2.calcular();
    System.out.println("Número de paginas" + Livro2.numeroPaginas);
    System.out.println("Preço" + Livro2.Preco);
    
    System.out.println("Titulo" + Livro3.Titulo);
    System.out.println("Autor" + Livro3.Autor);
    System.out.println("Genero" + Livro3.Genero);
    System.out.println("Ano de PUblicação" + Livro3.anoPublicacao);
    Livro3.calcular();
    System.out.println("Número de paginas" + Livro3.numeroPaginas);
    System.out.println("Preço" + Livro3.Preco);
    
    System.out.println("Titulo" + Livro4.Titulo);
    System.out.println("Autor" + Livro4.Autor);
    System.out.println("Genero" + Livro4.Genero);
    System.out.println("Ano de PUblicação" + Livro4.anoPublicacao);
    Livro4.calcular();
    System.out.println("Número de paginas" + Livro4.numeroPaginas);
    System.out.println("Preço" + Livro4.Preco);
    
    System.out.println("Titulo" + Livro5.Titulo);
    System.out.println("Autor" + Livro5.Autor);
    System.out.println("Genero" + Livro5.Genero);
    System.out.println("Ano de PUblicação" + Livro5.anoPublicacao);
    Livro5.calcular();
    System.out.println("Número de paginas" + Livro5.numeroPaginas);
    System.out.println("Preço" + Livro5.Preco);
    
    System.out.println("Titulo" + Livro6.Titulo);
    System.out.println("Autor" + Livro6.Autor);
    System.out.println("Genero" + Livro6.Genero);
    System.out.println("Ano de PUblicação" + Livro6.anoPublicacao);
    Livro6.calcular();
    System.out.println("Número de paginas" + Livro6.numeroPaginas);
    System.out.println("Preço" + Livro6.Preco);
    
    System.out.println("Titulo" + Livro7.Titulo);
    System.out.println("Autor" + Livro7.Autor);
    System.out.println("Genero" + Livro7.Genero);
    System.out.println("Ano de PUblicação" + Livro7.anoPublicacao);
    Livro7.calcular();
    System.out.println("Número de paginas" + Livro7.numeroPaginas);
    System.out.println("Preço" + Livro7.Preco);
    
    System.out.println("Titulo" + Livro8.Titulo);
    System.out.println("Autor" + Livro8.Autor);
    System.out.println("Genero" + Livro8.Genero);
    System.out.println("Ano de PUblicação" + Livro8.anoPublicacao);
    Livro8.calcular();
    System.out.println("Número de paginas" + Livro8.numeroPaginas);
    System.out.println("Preço" + Livro8.Preco);
    
    System.out.println("Titulo" + Livro9.Titulo);
    System.out.println("Autor" + Livro9.Autor);
    System.out.println("Genero" + Livro9.Genero);
    System.out.println("Ano de PUblicação" + Livro9.anoPublicacao);
    Livro9.calcular();
    System.out.println("Número de paginas" + Livro9.numeroPaginas);
    System.out.println("Preço" + Livro9.Preco);
    
    System.out.println("Titulo" + Livro10.Titulo);
    System.out.println("Autor" + Livro10.Autor);
    System.out.println("Genero" + Livro10.Genero);
    System.out.println("Ano de PUblicação" + Livro10.anoPublicacao);
    Livro10.calcular();
    System.out.println("Número de paginas" + Livro10.numeroPaginas);
    System.out.println("Preço" + Livro10.Preco);
    
    System.out.println("Titulo" + Livro11.Titulo);
    System.out.println("Autor" + Livro11.Autor);
    System.out.println("Genero" + Livro11.Genero);
    System.out.println("Ano de PUblicação" + Livro11.anoPublicacao);
    Livro11.calcular();
    System.out.println("Número de paginas" + Livro11.numeroPaginas);
    System.out.println("Preço" + Livro11.Preco);
    
    System.out.println("Titulo" + Livro11.Titulo);
    System.out.println("Autor" + Livro11.Autor);
    System.out.println("Genero" + Livro11.Genero);
    System.out.println("Ano de PUblicação" + Livro11.anoPublicacao);
    Livro11.calcular();
    System.out.println("Número de paginas" + Livro11.numeroPaginas);
    System.out.println("Preço" + Livro11.Preco);
    
    System.out.println("Titulo" + Livro12.Titulo);
    System.out.println("Autor" + Livro12.Autor);
    System.out.println("Genero" + Livro12.Genero);
    System.out.println("Ano de PUblicação" + Livro12.anoPublicacao);
    Livro12.calcular();
    System.out.println("Número de paginas" + Livro12.numeroPaginas);
    System.out.println("Preço" + Livro12.Preco);
    
    System.out.println("Titulo" + Livro13.Titulo);
    System.out.println("Autor" + Livro13.Autor);
    System.out.println("Genero" + Livro13.Genero);
    System.out.println("Ano de PUblicação" + Livro13.anoPublicacao);
    Livro13.calcular();
    System.out.println("Número de paginas" + Livro13.numeroPaginas);
    System.out.println("Preço" + Livro13.Preco);
    
    System.out.println("Titulo" + Livro14.Titulo);
    System.out.println("Autor" + Livro14.Autor);
    System.out.println("Genero" + Livro14.Genero);
    System.out.println("Ano de PUblicação" + Livro14.anoPublicacao);
    Livro14.calcular();
    System.out.println("Número de paginas" + Livro14.numeroPaginas);
    System.out.println("Preço" + Livro14.Preco);
    
    System.out.println("Titulo" + Livro15.Titulo);
    System.out.println("Autor" + Livro15.Autor);
    System.out.println("Genero" + Livro15.Genero);
    System.out.println("Ano de PUblicação" + Livro15.anoPublicacao);
    Livro15.calcular();
    System.out.println("Número de paginas" + Livro15.numeroPaginas);
    System.out.println("Preço" + Livro15.Preco);

    Livro Livro16 = new Livro ("Quarto de Despejo", "Carolina Maria de Jesus", "Autobiografia / Literatura Social", 1960, 200, 32.0 );
    System.out.println("Titulo" + Livro16.Titulo);
    System.out.println("Autor" + Livro16.Autor);
    System.out.println("Genero" + Livro16.Genero);
    System.out.println("Ano de PUblicação" + Livro16.anoPublicacao);
    Livro16.calcular();
    System.out.println("Número de paginas" + Livro16.numeroPaginas);
    System.out.println("Preço" + Livro16.Preco);
    
    Livro16.Preco = 50.0;
    
    System.out.println("Titulo" + Livro16.Titulo);
    System.out.println("Autor" + Livro16.Autor);
    System.out.println("Genero" + Livro16.Genero);
    System.out.println("Ano de PUblicação" + Livro16.anoPublicacao);
    Livro16.calcular();
    System.out.println("Número de paginas" + Livro16.numeroPaginas);
    System.out.println("Preço" + Livro16.Preco);
    }
}
