/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.Automata_CapturarDato;
import Controlador.Automata_Delimitador;
import Controlador.Automata_Funcion;
import Controlador.Automata_Mensaje;
import Controlador.Automata_OperadoresAritmeticos;
import Controlador.Automata_OperadoresAsignacion;
import Controlador.Automata_OperadoresLogicos;
import Controlador.Automata_OperadoresRelaciones;
import Controlador.Automata_SumarNR;
import Controlador.Automata_boo;
import Controlador.Automata_cadena;
import Controlador.Automata_case;
import Controlador.Automata_comilla;
import Controlador.Automata_continuar;
import Controlador.Automata_contrario;
import Controlador.Automata_corchete_cerrado;
import Controlador.Automata_decimal;
import Controlador.Automata_defecto;
import Controlador.Automata_derivarFuncion;
import Controlador.Automata_diples;
import Controlador.Automata_dividirNR;
import Controlador.Automata_entero;
import Controlador.Automata_flotante;
import Controlador.Automata_hallarLimite;
import Controlador.Automata_igual;
import Controlador.Automata_integrarFuncion;
import Controlador.Automata_llave_cerrado;
import Controlador.Automata_main;
import Controlador.Automata_mas_mas;
import Controlador.Automata_menos_menos;
import Controlador.Automata_multiplicarNR;
import Controlador.Automata_nada;
import Controlador.Automata_parentesis_cerrado;
import Controlador.Automata_resolverVectores;
import Controlador.Automata_restarNR;
import Controlador.Automata_retornar;
import Controlador.Automata_romper;
import Controlador.Automata_si;
import Controlador.Automata_vacio;
import Modelo.Flujo_caracteres;
import Modelo.Lexema;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Lenovo
 */
public class AutomatasTest {

     
    
     
    
     
    
    
     
    
    
     
     
    
    
     
     
    
     
    
    
     
     
    
     
    
    
     
    
    
    
    
    
    
     
    
    
    
     
    
     
     
    
    
     
    
    
     
    
    
     
    
    
    
    
    
    
    
     
    
     
    
     
    
     
    
     
    
    
//     @Test
//    public void TestAutomataMenosCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "-".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataMenosInCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "dfgfhj".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//    
//     @Test
//    public void TestAutomataDividirCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "/".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataDividirInCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "dfgfhj".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//    
//     @Test
//    public void TestAutomataPorCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "*".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataPorInCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "dfgfhj".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//    
//     @Test
//    public void TestAutomataModuloCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "%".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataModuloInCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "dfgfhj".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//    
//     @Test
//    public void TestAutomataCorrecto() {
//         Automata_OperadoresAsignacion fun = new Automata_OperadoresAsignacion();
//        char[] caracteres = "-".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataMenosIgualInCorrecto() {
//        Automata_OperadoresAsignacion fun = new Automata_OperadoresAsignacion();
//        char[] caracteres = "".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
    
}


