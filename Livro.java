/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veronica62924506
 */
public class Livro {

    String titulo;
    String autor;
    String genero;
    int anoPublicacao;
    int numeroPaginas;
    double preco;

    // Construtor
    public Livro(String titulo, String autor, String genero,
                 int anoPublicacao, int numeroPaginas, double preco) {

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }

    // Método para calcular a idade do livro
    public int calcularIdade() {
        return 2026 - anoPublicacao;
    }

    // Método para exibir as informações
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Idade do livro: " + calcularIdade() + " anos");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis",
                "Romance", 1899, 256, 29.90);

        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry",
                "Fábula", 1943, 96, 24.90);

        Livro livro3 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling",
                "Fantasia", 1997, 264, 39.90);

        Livro livro4 = new Livro("O Hobbit", "J.R.R. Tolkien",
                "Fantasia", 1937, 310, 45.90);

        Livro livro5 = new Livro("1984", "George Orwell",
                "Ficção científica", 1949, 328, 34.90);

        Livro livro6 = new Livro("A Hora da Estrela", "Clarice Lispector",
                "Romance", 1977, 88, 27.90);

        Livro livro7 = new Livro("Capitães da Areia", "Jorge Amado",
                "Romance", 1937, 280, 32.90);

        Livro livro8 = new Livro("O Cortiço", "Aluísio Azevedo",
                "Naturalismo", 1890, 224, 25.90);

        Livro livro9 = new Livro("Percy Jackson e o Ladrão de Raios", "Rick Riordan",
                "Fantasia", 2005, 400, 42.90);

        Livro livro10 = new Livro("Coraline", "Neil Gaiman",
                "Fantasia", 2002, 162, 29.90);

        Livro livro11 = new Livro("It: A Coisa", "Stephen King",
                "Terror", 1986, 1104, 59.90);

        Livro livro12 = new Livro("Extraordinário", "R.J. Palacio",
                "Drama", 2012, 320, 35.90);

        Livro livro13 = new Livro("Jogos Vorazes", "Suzanne Collins",
                "Distopia", 2008, 400, 39.90);

        Livro livro14 = new Livro("A Menina que Roubava Livros", "Markus Zusak",
                "Drama", 2005, 480, 44.90);

        Livro livro15 = new Livro("Vidas Secas", "Graciliano Ramos",
                "Romance", 1938, 176, 26.90);

        // Exibindo os livros
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();
        livro4.exibirInformacoes();
        livro5.exibirInformacoes();
        livro6.exibirInformacoes();
        livro7.exibirInformacoes();
        livro8.exibirInformacoes();
        livro9.exibirInformacoes();
        livro10.exibirInformacoes();
        livro11.exibirInformacoes();
        livro12.exibirInformacoes();
        livro13.exibirInformacoes();
        livro14.exibirInformacoes();
        livro15.exibirInformacoes();

        // Desafio extra
        Livro livro16 = new Livro("O Diário de Anne Frank", "Anne Frank",
                "Biografia", 1947, 352, 36.90);

        livro16.exibirInformacoes();

        // Alterando uma informação após a criação
        livro16.preco = 29.90;

        System.out.println("Após alterar o preço:");
        livro16.exibirInformacoes();
    }
}

