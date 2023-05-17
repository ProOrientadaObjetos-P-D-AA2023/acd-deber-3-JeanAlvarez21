package com.mycompany.problema2;

public class Empleado {
    
    private String nombreEmpleado;
    private double salarioEmpleado;
    private int edaEmpleado;

    public Empleado(String nombreEmpleado, double salarioEmpleado, int edaEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.salarioEmpleado = salarioEmpleado;
        this.edaEmpleado = edaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(double salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    public int getEdaEmpleado() {
        return edaEmpleado;
    }

    public void setEdaEmpleado(int edaEmpleado) {
        this.edaEmpleado = edaEmpleado;
    }
    
    public String mostrarInformacion(){
        
        return "\nNombre del empleado: " + nombreEmpleado + 
                "\nSalario del empleado: " + salarioEmpleado + 
                "\nEdad del empleado: " + edaEmpleado + "\n";
    
    }
}
