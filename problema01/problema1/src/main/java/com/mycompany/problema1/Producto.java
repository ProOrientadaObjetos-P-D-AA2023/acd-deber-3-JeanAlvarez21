package com.mycompany.problema1;

public class Producto {
    private double precioProducto;
    private int cantidadProductos;
    private double descuento;
    private double precioFinal;

    public Producto(double precioProducto, int cantidadProductos) {
        this.precioProducto = precioProducto;
        this.cantidadProductos = cantidadProductos;

    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    public void calcularDescuento(){
        if(precioProducto >= 1000 && cantidadProductos >= 10){
        descuento = (double)(precioProducto * cantidadProductos)* 0.10;
        }else{
        descuento = (double)(precioProducto * cantidadProductos) * 0.05;
        }
    }
    
    public void calcularPrecioFinal(){
       precioFinal =  (double)(precioProducto * cantidadProductos) - descuento;
    }
    
    
}
