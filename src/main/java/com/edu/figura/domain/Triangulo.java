package com.edu.figura.domain;

import java.math.BigDecimal;

public class Triangulo extends Figura {

    private BigDecimal base;
    private BigDecimal altura;

    public Triangulo(BigDecimal base, BigDecimal altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public BigDecimal obtenerSuperficie() {
        return this.getBase().multiply(this.getAltura()).divide(new BigDecimal("2"));
    }

    @Override
    public BigDecimal obtenerAltura() {
        return this.getAltura();
    }

    @Override
    public BigDecimal obtenerBase() {
        return this.getBase();
    }

    @Override
    public BigDecimal obtenerDiametro() {
        return null;
    }

    public BigDecimal getBase() {
        return base;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

}
