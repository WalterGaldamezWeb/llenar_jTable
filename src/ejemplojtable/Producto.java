/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojtable;

/**
 *
 * @author Walter Gdmz
 */
public class Producto {
    
    int id_producto;
    String nombre_producto;
    double precio_Producto;
    int cantidad_producto;

    public Producto() {
    }    

    public Producto(int id_producto, String nombre_producto, double precio_Producto, int cantidad_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio_Producto = precio_Producto;
        this.cantidad_producto = cantidad_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_Producto() {
        return precio_Producto;
    }

    public void setPrecio_Producto(double precio_Producto) {
        this.precio_Producto = precio_Producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }   
    
}
