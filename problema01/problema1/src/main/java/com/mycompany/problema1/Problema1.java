
package com.mycompany.problema1;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double precio;
        int numprod;
        
        System.out.print("Ingrese el precio de un producto: ");
        precio = sc.nextDouble();
        
        System.out.print("Ingrese el numero de producto(s): ");
        numprod = sc.nextInt();
        
        Producto p1 = new Producto(precio, numprod);
        
        p1.calcularDescuento();
        p1.calcularPrecioFinal();
        
        System.out.println("Descuento aplicado: " + p1.getDescuento());
        System.out.println("Precio final de la compra: " + p1.getPrecioFinal());
    }
}
