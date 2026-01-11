
package proyectofinaldataops;

import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class comprasClientes {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String nombreCliente;
        double compra1, compra2, compra3;
        double totalCompras, promedioCompras;

        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = sc.nextLine();

        System.out.print("Ingrese la compra 1: ");
        compra1 = sc.nextDouble();

        System.out.print("Ingrese la compra 2: ");
        compra2 = sc.nextDouble();

        System.out.print("Ingrese la compra 3: ");
        compra3 = sc.nextDouble();

        totalCompras = compra1 + compra2 + compra3;
        promedioCompras = totalCompras / 3;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Total compras : " + totalCompras);
        System.out.println("Promedio compras : " + promedioCompras);
        System.out.println("GRACIAS TOTALES : " + promedioCompras);
     }
}
