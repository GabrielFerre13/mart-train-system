package util;

public class SaudeService {

    public static double calcularImc(double peso, double altura){
        return peso / (altura * altura);
    }



    public static String classificarImc(double imc){
       if (imc < 18.5) return "Abaixo do peso";
       else if (imc < 25) return "Peso normal";
       else if (imc < 30) return "Sobrepeso";
       else return "Obsidade!";
    }

}
