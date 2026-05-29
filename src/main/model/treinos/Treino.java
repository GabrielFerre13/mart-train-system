package model.treinos;

import java.util.List;

public class Treino {
    private String nome;
    private String objetivo;
    private List<DiadeTreino> dias;

    public Treino(String nome, String objetivo, List<DiadeTreino> dias){
        this.nome = nome;
        this.objetivo = objetivo;
        this.dias = dias;
    }
    public String getNome() {
        return nome;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public List<DiadeTreino> getDias() {
        return dias;
    }
}
