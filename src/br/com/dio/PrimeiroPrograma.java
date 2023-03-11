package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println (gato);

        Livro livro1 = new Livro("O Problema dos 3 corpos", 300);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer nunPaginas;

    public Livro(String nome, Integer nunPaginas) {
        this.nome = nome;
        this.nunPaginas = nunPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNunPaginas() {
        return nunPaginas;
    }

    public void setNunPaginas(Integer nunPaginas) {
        this.nunPaginas = nunPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nunPaginas=" + nunPaginas +
                '}';
    }
}