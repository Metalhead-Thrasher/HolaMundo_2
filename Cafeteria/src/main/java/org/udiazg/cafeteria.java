package org.udiazg;

import java.util.Locale;
import java.util.Scanner;

public class cafeteria
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
                int opcion = 0;
        while (opcion != 2){
            System.out.println("==============================");
            System.out.println("      CAFETERÍA ESCOLAR");
            System.out.println("1.- Registrar compra.");
            System.out.println("2.- Salir.");
            System.out.println("==============================");
            System.out.println("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 1:
                    System.out.println("==============================");
                    System.out.println("       REGISTRAR COMPRA");
                    System.out.println("==============================");
                    System.out.println("Nombre del cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.println("¿Cuántos productos comprará?");
                    int productos = scanner.nextInt();
                    while (productos < 1)
                    {
                        System.out.println("Debe ser al menos uno. ¿Cuántos productos comprará?: ");
                        productos = scanner.nextInt();
                    }

                    double subtotal = 0;

                    for (int i = 1; i<= productos; i++)
                    {
                        System.out.println("Producto " + i);
                        System.out.println("Precio:");
                        double precio = scanner.nextDouble();
                        System.out.println("Cantidad: ");
                        int cantidad = scanner.nextInt();

                        double importe = precio * cantidad;
                        subtotal += importe;
                        System.out.println(String.format(Locale.US, "Importe: $%.2f", importe));
                    }
                    double descuento;
                    if (subtotal >= 300){
                        descuento = subtotal * 0.10;
                    } esle if (subtotal>= 100){
                        descuento = subtotal * 0.05;{
                    } else
                }
            }
        }
    }
}
