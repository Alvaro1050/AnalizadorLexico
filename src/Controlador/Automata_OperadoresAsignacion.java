/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Flujo_caracteres;

/**
 *
 * @author juan
 */
public class Automata_OperadoresAsignacion {

    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

   public void inicio(Flujo_caracteres flujo) {
        cont = flujo.getPosActual();
        car = flujo.getCaracteres();
        aceptada = false;
        q0();
    }

    public void q0() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == '+' || car[cont] == '-' || car[cont] == '*' || car[cont] == '/'
                    || car[cont] == '%') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                qF();

            } else {

                aceptada = false;

            }
        }
    }

    public void qF() {
        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == '=') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                aceptada = true;

            } else {

                aceptada = false;

            }
        }
    }
}
