package com.edu.figura.domain;

import java.math.BigDecimal;

public class Circulo extends Figura {

    private BigDecimal radio;

    public Circulo(BigDecimal radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    @Override
    public BigDecimal obtenerSuperficie() {
        return PI.multiply(this.getRadio().pow(2));
    }

    @Override
    public BigDecimal obtenerAltura() {
        return null;
    }

    @Override
    public BigDecimal obtenerBase() {
        return null;
    }

    @Override
    public BigDecimal obtenerDiametro() {
        return this.getRadio().multiply(this.getRadio());
    }

    public BigDecimal getRadio() {
        return radio;
    }

    public void setRadio(BigDecimal radio) {
        this.radio = radio;
    }

}
