package service;

import model.treinos.DiadeTreino;
import model.treinos.Exercicio;
import model.treinos.Treino;

import java.util.ArrayList;
import java.util.List;

public class TreinosPreDefinidos {

    //  EMAGRECIMENTO
    public static Treino gerarEmagrecimento(int DiadaSemana) {

        List<DiadeTreino> dias = new ArrayList<>();

        if (DiadaSemana == 2){
            DiadeTreino dia1 = new DiadeTreino("Treino A");
            dia1.addExercicio(new Exercicio("Agachamento",3,12));
            dia1.addExercicio(new Exercicio("Supino",3,15));

            dias.add(dia1);

            DiadeTreino dia2 = new DiadeTreino("Treino B");
            dia2.addExercicio(new Exercicio("Leg Press",3,12));
            dia2.addExercicio(new Exercicio("Tríceps",3,12));

            dias.add(dia2);

        } else if (DiadaSemana == 3) {
            // SEGUNDA
            DiadeTreino seg = new DiadeTreino("Segunda");
            seg.addExercicio(new Exercicio("Agachamento", 3, 12));
            seg.addExercicio(new Exercicio("Leg Press", 3, 12));
            seg.addExercicio(new Exercicio("Cadeira Extensora", 3, 15));

            dias.add(seg);


            // Quarta
            DiadeTreino qua = new DiadeTreino("Quarta");
            qua.addExercicio(new Exercicio("Supino", 3, 12));
            qua.addExercicio(new Exercicio("Tríceps", 3, 12));
            qua.addExercicio(new Exercicio("Flexão", 3, 10));

            dias.add(qua);

            // Sexta
            DiadeTreino sex = new DiadeTreino("Sexta");
            sex.addExercicio(new Exercicio("Cadeira Extensora",3,15));

            dias.add(sex);


        } else if (DiadaSemana == 5) {
            String[] nomes = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
            for (String nome : nomes){
                DiadeTreino dia = new DiadeTreino(nome);
                dia.addExercicio(new Exercicio("Agachamento",3,13));
                dia.addExercicio(new Exercicio("Supino", 3, 12));
                dia.addExercicio(new Exercicio("Abdominal",3,15));

                dias.add(dia);
            }


        }
        return new Treino("Emagrecimento" + DiadaSemana + "x", "emagrecimento", dias);

    }

    public static Treino gerarHipertrofia(int diasdaSemana) {

        List<DiadeTreino> dias = new ArrayList<>();

        if (diasdaSemana == 2){
            DiadeTreino a = new DiadeTreino("Treino A");
            a.addExercicio(new Exercicio("Supino reto",3,12));
            a.addExercicio(new Exercicio("Tríceps corda",3,12));
            a.addExercicio(new Exercicio("Elevação lateral",3,12));

            DiadeTreino b = new DiadeTreino("Treino B");
            b.addExercicio(new Exercicio("Agachamento",3,12));
            b.addExercicio(new Exercicio("Leg press",3,12));
            b.addExercicio(new Exercicio("Panturrilha",3,12));

        } else if (diasdaSemana == 3) {
            DiadeTreino seg = new DiadeTreino("Segunda");
            seg.addExercicio(new Exercicio("Supino reto",3,12));
            seg.addExercicio(new Exercicio("Tríceps corda",3,12));

            dias.add(seg);

            DiadeTreino qua = new DiadeTreino("Quarta");
            qua.addExercicio(new Exercicio("Agachamento",3,12));
            qua.addExercicio(new Exercicio("Leg press",3,12));

            dias.add(qua);

            DiadeTreino sex = new DiadeTreino("Sexta");
            sex.addExercicio(new Exercicio("Puxada alta", 3,12));
            sex.addExercicio(new Exercicio("Rosca direta",3,12));

            dias.add(sex);

        } else if (diasdaSemana == 5) {
            String[] nomes = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

            for (String nome : nomes){
                DiadeTreino dia = new DiadeTreino(nome);
                dia.addExercicio(new Exercicio("Supino",3,12));
                dia.addExercicio(new Exercicio("Panturrilha",3,12));
                dia.addExercicio(new Exercicio("Abdominal",3,12));

                dias.add(dia);

            }

        }
        return new Treino("Hipertrofia" + diasdaSemana + "x", "hipertrofia", dias);


    }
    public static Treino gerarSaude(int diasSemana){

        List<DiadeTreino> dias = new ArrayList<>();

        for(int i = 1; i <= diasSemana; i++){

            DiadeTreino dia = new DiadeTreino("Dia" + i);

            dia.addExercicio(new Exercicio("Caminhada",1,20));
            dia.addExercicio(new Exercicio("Bicicleta",1,15));
            dia.addExercicio(new Exercicio("Alongamento",1,15));
            dia.addExercicio(new Exercicio("Abdominal",2,15));

            dias.add(dia);
        }
        return new Treino("Saúde" + diasSemana + "x", "saude", dias);


    }





    }
