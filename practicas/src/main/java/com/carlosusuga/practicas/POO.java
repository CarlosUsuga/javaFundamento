package com.carlosusuga.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POO {
    public static void main(String[] args){
        Casa miCasa = new Casa(
                "gardel",
                'v',
                (short)12,
                123564,
                11222222101111L,
                4.52f,
                45.23542,
                false
        );
        System.out.println(miCasa);
        Casa raulCasaa = new Casa("japon", 123456789, 99.33f, false);
        Casa andresCasa = new Casa("brazil", 258741, 112.33f, true);
        Casa nadieCasa = new Casa();
        System.out.println(raulCasaa);

        Main.nuevoTema("Listas");
        List<Casa> casaList = new ArrayList<>();
        casaList.add(miCasa);
        casaList.add(raulCasaa);
        casaList.add(nadieCasa);

        casaList.remove(1);
        casaList.set(1, miCasa);
        for (Casa currentCasa: casaList){
            System.out.println(currentCasa);
        }

        Main.nuevoTema("Diccionario");
        Map<String, Casa> casaMap = new HashMap<>();
        casaMap.put("Jhon", miCasa);
        casaMap.put("Edison", raulCasaa);
        casaMap.put("Andres", raulCasaa);

        System.out.println(casaMap.size());
        casaMap.remove("Andres");

        Main.nuevoTema("Herencia");
        Apartamento apartamentoPlaya = new Apartamento(
                "cualquiera",
                'u',
                (short) 55,
                2563111,
                456987654398778L,
                96.35f, 720.12311, true, (short) 455
        );
        System.out.println(apartamentoPlaya);

//        System.out.println(casaMap.get("Andres"));
        
        Main.nuevoTema("Polimorfismo");
        venderPropiedad(miCasa);
        venderPropiedad(apartamentoPlaya);
        Casa apartamentoCiudad = new Apartamento(
                "la mejor",
                's',
                (short) 88,
                45698712,
                123456987456321L,
                54.23f,
                1254.369852,
                false,
                (short) 12
        );
        venderPropiedad(apartamentoCiudad);
        Casa casaNueva = new Casa();
        casaNueva.setCalle("siempre viva");
        casaNueva.setHipoteca(true);
        casaNueva.setImpuesto(45.36f);
        System.out.println(casaNueva);
        venderPropiedad(casaNueva);

        Main.nuevoTema("Equals && HashCode");
        Casa miSegundaCasa = new Casa(
                "gardel",
                'v',
                (short)12,
                123564,
                11222222101111L,
                4.52f,
                45.23542,
                false
        );
        System.out.println(miCasa.equals(miSegundaCasa));
        Casa miTerceraCasa = new Casa();
        System.out.println(casaMap.containsValue(miCasa));
    }

    private static void venderPropiedad(Casa casa) {
        if (casa.isHipoteca()){
            System.out.println("Imposible vender la casa");
        } else {
            System.out.println("En venta.");
        }
    }
}
