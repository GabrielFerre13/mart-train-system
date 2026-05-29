package model.alunos;

import model.treinos.Treino;

public class Aluno {
    private String nome;
    private double altura;
    private double peso;
    private String objetivo;
    private Treino treino;

    public Aluno(String nome, double altura, double peso, String objetivo) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public String getNome() {
        return nome;
    }

    public String getObjetivo() {
        return objetivo;
    }
    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Treino getTreino() {
        return treino;
    }
}

