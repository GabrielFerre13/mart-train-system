package model.treinos;

import java.util.ArrayList;
import java.util.List;

public class DiadeTreino {
    private String nomeDia;
    private List<Exercicio> exercicio = new ArrayList<>();

    public DiadeTreino(String nomeDia) {
        this.nomeDia = nomeDia;
    }

    public String getNomeDia() {
        return nomeDia;
    }

    public List<Exercicio> getExercicio() {
        return exercicio;
    }


    public void addExercicio(Exercicio exercicio) {
        this.exercicio.add(exercicio);
    }
}