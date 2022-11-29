package br.drstecnologia.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculosTest {

//    Cenario de Test
//    Preparação do Cenario
//    Execuçao
//    Resultdos / Verificações

    @Test
    public void retornarZeroQuandoNadaInformado(){
        Calculos numeroASomar = new Calculos();
        double esperado = 0;
        double atual = numeroASomar.soma();
        Assertions.assertEquals(esperado, atual);
    }

    @Test
    public void retornarSomaQuandoValoresInformados(){

        Calculos numeroASomar = new Calculos();
        double atual = numeroASomar.soma(21,23);
        double esperado = 44;
        assertEquals(esperado, atual);
    }

    @Test
    void informaNumeroPar() {
        Calculos paraVerificar = new Calculos();
        boolean informaNumeroPar = paraVerificar.informaNumeroPar(8);
        assertTrue(informaNumeroPar);
    }
    @Test
    void informaNumeroImpar() {
        Calculos paraVerificar = new Calculos();
        boolean informaNumeroPar = paraVerificar.informaNumeroPar(5);
        assertFalse(informaNumeroPar);
    }

    @Test
    void raizQuadradaDeDoisNumeros() {
        Calculos numeroACalcular = new Calculos();
        double atual = numeroACalcular.raizQuadradaDeDoisNumeros(144);
        double esperado = 12;
        assertEquals(esperado, atual);
    }
}