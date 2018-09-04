package com.edu.figura.repository;

import com.edu.figura.domain.Figura;
import com.edu.figura.factory.FiguraFactory;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
import org.springframework.stereotype.Repository;

@Repository
public class FiguraRepository {

    private final List<Figura> figuras;

    private final FiguraFactory figuraFactory;

    public FiguraRepository(FiguraFactory figuraFactory) {
        this.figuraFactory = figuraFactory;
        this.figuras = new ArrayList<>();
    }

    public Figura guardar(Figura figura) {
        figuras.add(figura);
        return figura;
    }

    public List<Figura> buscarPorTipoFigura(String tipoFigura) {
        return figuras.stream().filter(figura -> figura.getClass().equals(figuraFactory.obtenerTipoFigura(tipoFigura))).collect(toList());
    }

    public List<Figura> buscarTodas() { 
        return figuras;
    }
}
