package org.jsfernandez.abstractas;

import org.jsfernandez.interfaces.IProducto;
abstract public class Producto implements IProducto {
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioVenta() {
        return precio;
    }
}
