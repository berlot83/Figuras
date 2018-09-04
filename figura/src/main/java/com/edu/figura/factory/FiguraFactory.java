package com.edu.figura.factory;

import com.edu.figura.domain.Circulo;
import com.edu.figura.domain.Cuadrado;
import com.edu.figura.domain.Figura;
import com.edu.figura.domain.Triangulo;
import org.springframework.stereotype.Component;

@Component
public class FiguraFactory {

    public Figura obtenerInstanciaDeFigura(String nombreFigura) throws IllegalAccessException, InstantiationException {
        return obtenerTipoFigura(nombreFigura).newInstance();
    }

        public Class<? extends Figura> obtenerTipoFigura(String nombreFigura) {
        Class tipoFigura = null;
        switch (nombreFigura) {
            case "circulo":
                tipoFigura = Circulo.class;
                break;
            case "cuadrado":
                tipoFigura = Cuadrado.class;
                break;
            case "triangulo":
                tipoFigura = Triangulo.class;
                break;
        }
        return tipoFigura;
    }
}
