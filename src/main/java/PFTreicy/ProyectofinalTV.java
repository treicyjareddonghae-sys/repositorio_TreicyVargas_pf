package PFTreicy;

import java.util.Scanner;
public class ProyectofinalTV{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el monto de la primera compra: ");
        double compra1 = sc.nextDouble();

        System.out.print("Ingrese el monto de la segunda compra: ");
        double compra2 = sc.nextDouble();

        System.out.print("Ingrese el monto de la tercera compra: ");
        double compra3 = sc.nextDouble();

        System.out.print("Ingrese el monto de la cuarta: ");
        double compra4 = sc.nextDouble();
        
        double totalCompras = compra1 + compra2 + compra3 + compra4;
        double promedioCompras = totalCompras / 4;

        System.out.println("\n--- Resultados ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Total de compras     : " + totalCompras);
        System.out.println("Promedio de compras  : " + promedioCompras);

        sc.close();
    }
}
