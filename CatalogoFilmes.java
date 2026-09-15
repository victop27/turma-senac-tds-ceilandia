/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catalogofilmes;

/**
 *
 * @author geovanna62993406
 */
public class CatalogoFilmes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Filme filme1 = new Filme("Interestelar", "Christopher Nolan", "Ficção científica", 2014, 169, 8.7);

        Filme filme2 = new Filme("Titanic", "James Cameron", "Romance", 1997, 195, 7.9);
  
  System.out.println("FILME 1");
System.out.println("Título: " + filme1.titulo);
System.out.println("Diretor: " + filme1.diretor);
System.out.println("Gênero: " + filme1.genero);
System.out.println("Ano de lançamento: " + filme1.anoLancamento);
System.out.println("Duração: " + filme1.duracao + " minutos");
System.out.println("Nota: " + filme1.nota);
System.out.println("Há " + filme1.calcularIdade() + " anos foi lançado.");

System.out.println();

System.out.println("FILME 2");
System.out.println("Título: " + filme2.titulo);
System.out.println("Diretor: " + filme2.diretor);
System.out.println("Gênero: " + filme2.genero);
System.out.println("Ano de lançamento: " + filme2.anoLancamento);
System.out.println("Duração: " + filme2.duracao + " minutos");
System.out.println("Nota: " + filme2.nota);
System.out.println("Há " + filme2.calcularIdade() + " anos foi lançado.");
    }
    
}
