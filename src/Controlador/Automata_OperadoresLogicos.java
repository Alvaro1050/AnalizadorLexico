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
 * @author juan
 */
public class Automata_OperadoresLogicos {

    int posIncial;
    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

    public Lexema inicio(Flujo_caracteres flujo) {
        posIncial = flujo.getPosActual();
        cont = flujo.getPosActual();
        car = flujo.getCaracteres();
        aceptada = false;
        q0();

        if (aceptada) {
            Analizador_lexico.flujo.setPosActual(cont);
            return new Lexema(car[posIncial] + "", "Operador logico");

        } else {
            return null;
        }
    }

    public void q0() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if ((car[cont] == '&' || car[cont] == '|' || car[cont] == '!') && aceptada == false) {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;
                aceptada = true;
                q0();

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
