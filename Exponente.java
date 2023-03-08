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
public class Exponente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, potencia, resultado;
        System.out.print("digite  un numero: ");
        numero = entrada.nextDouble();
        System.out.print("digite la potencia: ");
        potencia = entrada.nextDouble();

        resultado = Math.pow(numero, potencia);

        if (potencia == 0) {
            resultado = 1;
            System.out.println(resultado);
        } else if (potencia > 0) {
            System.out.println(resultado);
        } else if (potencia<0) {
           double rta;
           rta=1/resultado;
            System.out.println(resultado);

        }
    }

}
