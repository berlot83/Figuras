package com.edu.figura.domain;

import java.math.BigDecimal;

public abstract class Figura {

    public static BigDecimal PI = new BigDecimal(3.14159265359);

    public abstract BigDecimal obtenerSuperficie();

    public abstract BigDecimal obtenerAltura();

    public abstract BigDecimal obtenerBase();

    public abstract BigDecimal obtenerDiametro();
}
