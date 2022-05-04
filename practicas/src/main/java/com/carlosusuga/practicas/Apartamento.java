package com.carlosusuga.practicas;

public class Apartamento extends Casa{
    private short numeroInterno;

    public Apartamento(
            String calle,
            char seccion,
            short numero,
            int precio,
            long fechaConstruccion,
            float impuesto,
            double metrosCubicos,
            boolean hipoteca,
            short numeroInterno
    ) {
        super(calle, seccion, numero, precio, fechaConstruccion, impuesto, metrosCubicos, hipoteca);
        this.numeroInterno = numeroInterno;
    }
}
