package org.jsfernandez;

import org.jsfernandez.abstractas.*;
import org.jsfernandez.concretas.*;
import org.jsfernandez.interfaces.*;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args){
        IProducto[] producto = new Producto[5];

        producto[0] = new IPhone(1099, "Samsung", "Blanco", "15 Pro Max");
        producto[1] = new TvLcd(2000, "Samsung", 50);
        producto[2] = new Libro(7, new Date("22/05/1999"), "Erich Fromm",
                "El miedo a la libertad", "Alfaguara");
        producto[3] = new Comics(6, new Date("10/10/2023"), "Alan Moore",
                "Watchmen", "Kiosquera", "Roscharch");
        producto[4] = new TvLcd(1499, "Sony", 52);

        for (IProducto elementos: producto){
            System.out.print("Tipo de " +elementos.getClass().getName());
            System.out.print(" - ");
            System.out.print("Precio: " +elementos.getPrecio());

            if (elementos instanceof IElectronico){
                System.out.print("\n");
                System.out.println("Fabricante: " +(((IElectronico) elementos).getFabricante()));
            }

            if (elementos instanceof IPhone){
                System.out.println();
                System.out.println("Modelo: " +((IPhone) elementos).getModelo());
                System.out.println("Color: " +((IPhone) elementos).getColor());
            }

            if (elementos instanceof TvLcd){
                System.out.println("Pulgadas: " +((TvLcd) elementos).getPulgada());
            }

            if (elementos instanceof Libro){
                System.out.println("Titulo: " +((Libro) elementos).getTitulo());
                System.out.println("Autor: " +((Libro) elementos).getAutor());
            }

            if (elementos instanceof Comics)
                System.out.println("Personaje: " +((Comics) elementos).getPersonaje());

            System.out.println();
        }
    }
}
