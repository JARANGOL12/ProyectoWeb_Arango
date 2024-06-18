/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.sise.entity;

import java.util.Date;



/**
 *
 * @author Usuario
 */
public class Producto {
    private int codigo;
    private Proveedor proveedor;
    private String nombre;
    private String modelo;
    private double precio;
    private int stock;
    private String descripcion;
    private Date FechaLanzamiento;

    public Producto() {
    }

    public Producto(int codigo, Proveedor proveedor, String nombre, String modelo, double precio, int stock, String descripcion, Date FechaLanzamiento) {
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
        this.FechaLanzamiento = FechaLanzamiento;
    }

    public Date getFechaLanzamiento() {
        return FechaLanzamiento;
    }

    public void setFechaLanzamiento(Date FechaLanzamiento) {
        this.FechaLanzamiento = FechaLanzamiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
