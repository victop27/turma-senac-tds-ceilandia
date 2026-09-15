package catalogofilmes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author geovanna62993406
 */
public class Filme {
   String titulo;
    String diretor;
    String genero;
    int anoLancamento;
    int duracao;
    double nota;

    public Filme(String titulo, String diretor, String genero, int anoLancamento, int duracao, double nota) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.nota = nota;
    }

    public int calcularIdade() {
        return 2026 - anoLancamento;
    }
}

