package app;

import model.treinos.DiadeTreino;
import model.treinos.Exercicio;
import model.treinos.Treino;
import service.TreinosPreDefinidos;
import util.SaudeUtil;

import java.util.Scanner;

public class TreinoApp {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("BEM VINDO AO TREINO APP");
        System.out.println();
        System.out.println("Qual e seu nome? : ");
        String nome = sc.next();
        System.out.println();
        System.out.println("Sua idade: ");
        System.out.println();
        int idade = sc.nextInt();
        System.out.println();
        System.out.println("Seu peso: ");
        double peso = sc.nextInt();
        System.out.println();
        System.out.println("Sua Altura (ex: 1,75): ");
        double altura = sc.nextDouble();
        double imc = SaudeUtil.calcularImc(peso, altura);
        System.out.printf("Seu IMC : %.2f%n ", imc);
        System.out.println("Classificação: " + SaudeUtil.classificarImc(imc));
        System.out.println();
        System.out.println("\nEscolha seu objetivo:");
        System.out.println("1 - Emagrecimento");
        System.out.println("2 - Hipertrofia");
        System.out.println("3 - Saude");

        int objetivo = sc.nextInt();
        System.out.println();

        System.out.println("\nQuantos dias por semana? (2, 3, 5)");
        int dias = sc.nextInt();

        Treino treino;

        switch (objetivo){
            case 1:
                treino = TreinosPreDefinidos.gerarEmagrecimento(dias);
                break;
            case 2:
                treino= TreinosPreDefinidos.gerarHipertrofia(dias);
                break;
            case 3:
                treino = TreinosPreDefinidos.gerarSaude(dias);
                break;
            default:
                System.out.println("Opcao invalida!");
                return;
        }
        System.out.println("\n====SEU TREINO====");
        System.out.println("nome: " + treino.getNome());
        for (DiadeTreino dia : treino.getDias()) {
            System.out.println("\n" + dia.getNomeDia());

        for (Exercicio ex : dia.getExercicio()) {
            System.out.println("-" + ex.getNome());
        }
        }
        sc.close();

    }
}
