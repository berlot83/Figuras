package com.edu.figura.controller;

import com.edu.figura.domain.Circulo;
import com.edu.figura.domain.Cuadrado;
import com.edu.figura.domain.Figura;
import com.edu.figura.domain.Triangulo;
import com.edu.figura.service.FiguraService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class FiguraController {

    private final FiguraService figuraService;

    public FiguraController(FiguraService figuraService) {
        this.figuraService = figuraService;
    }

    @PostMapping("/figuras/circulos")
    public Figura guardar(@RequestBody Circulo figura) {
        return figuraService.guardar(figura);
    }

    @PostMapping("/figuras/cuadrados")
    public Figura guardar(@RequestBody Cuadrado figura) {
        return figuraService.guardar(figura);
    }

    @PostMapping("/figuras/triangulos")
    public Figura guardar(@RequestBody Triangulo figura) {
        return figuraService.guardar(figura);
    }

    @GetMapping("/figuras")
    public List<Figura> buscarPorTipoFigura(@RequestParam String tipoFigura) {
        return figuraService.buscarPorTipoFigura(tipoFigura);
    }

    @GetMapping("/figuras/superficie")
    public List<BigDecimal> obtenerSuperficiesDeFiguras() {
        return figuraService.obtenerSuperficiesDeFiguras();
    }

    @GetMapping("/figuras/diametro")
    public List<BigDecimal> obtenerDiametroDeFiguras() {
        return figuraService.obtenerDiametroDeFiguras();
    }

    @GetMapping("/figuras/base")
    public List<BigDecimal> obtenerBaseDeFiguras() {
        return figuraService.obtenerBaseDeFiguras();
    }

    @GetMapping("/figuras/altura")
    public List<BigDecimal> obtenerAlturaDeFiguras() {
        return figuraService.obtenerAlturaDeFiguras();
    }

}
