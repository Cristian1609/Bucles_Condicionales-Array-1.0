/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallercondicionales;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el year a evaluar: ");
        año = entrada.nextInt();
        double operacion = operacion = año % 4;
        System.out.println(operacion);

        if (operacion==0) {
           
            System.out.print("El year "+año+" es bisiesto");
        }else{
            System.out.print("El year "+año+" no es bisiesto");
        }
    }

}
