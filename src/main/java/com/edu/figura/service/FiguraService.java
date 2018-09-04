package com.edu.figura.service;

import com.edu.figura.domain.Figura;
import com.edu.figura.repository.FiguraRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.toList;
import org.springframework.stereotype.Service;

@Service
public class FiguraService {

    private final FiguraRepository figuraRepository;

    public FiguraService(FiguraRepository figuraRepository) {
        this.figuraRepository = figuraRepository;
    }

    public Figura guardar(Figura figura) {
        validarFigura(figura);
        return figuraRepository.guardar(figura);
    }

    public List<Figura> buscarPorTipoFigura(String nombreTipoFigura) {
        return figuraRepository.buscarPorTipoFigura(nombreTipoFigura);
    }

    public List<BigDecimal> obtenerSuperficiesDeFiguras() {
        return figuraRepository.buscarTodas().stream().map(figura -> figura.obtenerSuperficie()).collect(toList());
    }

    public List<BigDecimal> obtenerBaseDeFiguras() {
        return figuraRepository.buscarTodas().stream().map(figura -> figura.obtenerBase()).collect(toList());
    }

    public List<BigDecimal> obtenerAlturaDeFiguras() {
        return figuraRepository.buscarTodas().stream().map(figura -> figura.obtenerAltura()).collect(toList());
    }

    public List<BigDecimal> obtenerDiametroDeFiguras() {
        return figuraRepository.buscarTodas().stream().map(figura -> figura.obtenerDiametro()).collect(toList());
    }

    private void validarFigura(Figura figura) {
        Map<String, Object> keyNombreCampoValueValorDelCampoDeLaFigura = new ObjectMapper().convertValue(figura, Map.class);
        if (keyNombreCampoValueValorDelCampoDeLaFigura.containsValue(null)) {
            throw new IllegalArgumentException("Todos los campos de la figura a crear deben tener un valor");
        }
    }
}
