package com.edu.figura.domain;

import java.math.BigDecimal;

public class Cuadrado extends Figura {

    private BigDecimal lado;

    public Cuadrado(BigDecimal lado) {
        this.lado = lado;
    }

    @Override
    public BigDecimal obtenerSuperficie() {
        return this.lado.pow(2);
    }

    @Override
    public BigDecimal obtenerAltura() {
        return this.lado;
    }

    @Override
    public BigDecimal obtenerBase() {
        return this.lado;
    }

    @Override
    public BigDecimal obtenerDiametro() {
        return null;
    }

    public BigDecimal getLado() {
        return lado;
    }

    public void setLado(BigDecimal lado) {
        this.lado = lado;
    }

}
