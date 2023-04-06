package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        livro livro = new livro(nome: "Nome do livro aqui exemplo", npag: 300);
        System.out.println(livro);
        /*int  a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}
class Livro {
    private String nome;
    private Interger npag;

    public Livro(String nome, Interger npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Interger getNpag() {
        return npag;
    }

    public void setNpag(Interger npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}
