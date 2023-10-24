package org.jsfernandez.concretas;

import org.jsfernandez.abstractas.Electronico;
import org.jsfernandez.interfaces.IProducto;

public class TvLcd extends Electronico implements IProducto{
    private int pulgada;
    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
