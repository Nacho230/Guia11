/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_ej03;

import Entidad.Cartas;
import Entidad.Palos;
import Servicio.JuegoServicio;
import java.util.Scanner;
import utilidad.UTILIDAD;

/**
 *
 * @author nacho
 */
public class Guia11_Ej03 {

    /**
     * @param args the command line arguments
     * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        UTILIDAD u1 = new UTILIDAD();
        Cartas c1 = new Cartas();
        Palos p1 = new Palos();
        JuegoServicio js = new JuegoServicio();
        int menu = 0;

        do {

            System.out.println("CARTAS ESPAÑOLAS");
            System.out.println("------------------------------------------");
            System.out.println("1. Crear baraja \n"
                    + "2. Mezclar cartas  \n"
                    + "3. Pedir siguiente carta \n"
                    + "4. Mostrar cantidad de cartas disponibles \n"
                    + "5. Pedir cartas \n"
                    + "6. Mostrar las cartas que ya salieron del mazo \n"
                    + "7. Mostrar mazo  \n"
                    + "8. Salir");
            System.out.println("");
            System.out.println("Ingrese la opcion");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    js.crearBaraja();
                    u1.esperar(2);
                    break;
                case 2:
                    js.barajar();
                    u1.esperar(2);
                    break;
                case 3:
                    js.siguienteCarta();
                    u1.esperar(2);
                    break;
                case 4:
                    js.cartasDisponibles();
                    u1.esperar(2);
                    break;
                case 5:
                    js.darCartas();
                    u1.esperar(2);
                    break;
                case 6:
                    js.cartasMonton();
                    u1.esperar(2);
                    break;
                case 7:
                    js.mostrarBaraja();
                    u1.esperar(2);
                    break;
                case 8:
                    System.out.println("Saliendo...");

                    break;
                default:
                    System.out.println("Ingreseaste mal una opción del menú, aprendé a contar");
            }

        } while (menu != 8);

    }

}
