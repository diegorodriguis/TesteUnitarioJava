package br.drstecnologia.calculadora;

public class Calculos {
    public double soma(double... numeros){
        double soma = 0;

        if (numeros.length > 0){
            for(double numeroASomar : numeros){
                soma += numeroASomar;
            }
        }

        return soma;
    }

    public boolean informaNumeroPar(int numero){
        if (numero % 2 == 0){
            return true;}
        return false;
    }
    public double raizQuadradaDeDoisNumeros(double numero){
        return Math.sqrt(numero);
    }
}
