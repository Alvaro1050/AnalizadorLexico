/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.Automata_menos_menos;
import Modelo.Flujo_caracteres;
import Modelo.Lexema;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class TestAutomataMenosMenos {
    
   @Test
    public void TestAutomataMenosMenosCorrecto() {
         Automata_menos_menos fun = new Automata_menos_menos();
        char[] caracteres = "--".toCharArray();
        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
        int esperado = 1;
        int resultadoMetodo;
        if (resultado != null) {
            resultadoMetodo = 1;
        } else {
            resultadoMetodo = 0;
        }

        assertEquals(esperado, resultadoMetodo);

    }

    @Test
    public void TestAutomataMenosMenosInCorrecto() {
       Automata_menos_menos fun = new Automata_menos_menos();
        char[] caracteres = "dhsbcdh".toCharArray();
        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
        int esperado = 0;
        int resultadoMetodo;
        if (resultado != null) {
            resultadoMetodo = 1;
        } else {
            resultadoMetodo = 0;
        }

        assertEquals(esperado, resultadoMetodo);

    }
    
}
