/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Flujo_caracteres;
import Modelo.Lexema;

/**
 *
 * @author alvar
 */
public class Automata_parentesis {

    int posInicial;

    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

    public Lexema inicio(Flujo_caracteres flujo) {
        cont = flujo.getPosActual();
        posInicial = flujo.getPosActual();

        car = flujo.getCaracteres();
        aceptada = false;
        q0F();
        if (aceptada) {
            Analizador_lexico.flujo.setPosActual(cont);
            return new Lexema(car[posInicial] + "", "separador");
        } else {
            return null;
        }
    }

    public void q0F() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if ((car[cont] == '(' || car[cont] == ')') && aceptada == false) {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                aceptada = true;
                q0F();

               } else if (car[cont] == ' ') {
                validarEspacios();
            }
        }
    }

    public void validarEspacios() {
        if (car[cont] == ' ') {
            cont++;
            validarEspacios();
        }
    }
}
