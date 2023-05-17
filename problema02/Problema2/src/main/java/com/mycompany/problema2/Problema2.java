
package com.mycompany.problema2;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int eleccion = -1;
        Empleado[] empleados = new Empleado[50];
        int nEmpleados = 0;
   
        while (eleccion != 0){
            System.out.println("\n1. Agregar un empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            eleccion = sc.nextInt();
        
            switch (eleccion){
                case 1: 
                    System.out.print("\nIngrese el nombre del empleado: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = sc.nextDouble();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = sc.nextInt();
                
                    Empleado empleado = new Empleado(nombre, salario, edad);
                    empleados[nEmpleados] = empleado;
                    nEmpleados = nEmpleados+1;
                    System.out.print("Empleado agregado con exito.\n");
                    break;
             
                case 2:
                    System.out.println("información de los empleados:");
                    for(int i = 0; i < nEmpleados; i++){
                        System.out.print(empleados[i].mostrarInformacion());
                    }
                    break;
                
                case 3: 
                    System.out.print("\nIngrese un porcentaje de aumento salarial: ");
                    double porcentajeAumento = sc.nextDouble();
                    
                    double salarioPromedio = 0;
                    for (int i = 0; i < nEmpleados; i++){
                    salarioPromedio = (salarioPromedio + empleados[i].getSalarioEmpleado())/nEmpleados;
                    }
                    System.out.println("\nSalarios actualizados:");
                    for (int i = 0; i < nEmpleados; i++){
                        if(empleados[i].getSalarioEmpleado() <= salarioPromedio){
                            double salarioAumentado = empleados[i].getSalarioEmpleado() + (empleados[i].getSalarioEmpleado())*(porcentajeAumento/100);
                            empleados[i].setSalarioEmpleado(salarioAumentado);
                        }
                        System.out.print(empleados[i].mostrarInformacion());
                    }
                    break;
                    
                case 0: 
                    break;
                    
                default:
                    System.out.println("\nPor favor ingrese un numero entre 0 y 3");
            }
        
        }
        
    }
}
