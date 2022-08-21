package figuras;

import interfaces.IDosDecimales;
import interfaces.IPositivo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Triangulo extends Figura implements IPositivo, IDosDecimales {
    double base;
    double altura;
    double lado2;
    double lado3;

    public Triangulo(double base, double altura, double lado2, double lado3) {
        this.nombre = "triangulo";
        this.base = esPositivo(base);
        this.altura = esPositivo(altura);
        this.lado2 = esPositivo(lado2);
        this.lado3 = esPositivo(lado3);
    }

    @Override
    public double calcularArea() {
        return dosDecimales((base*altura)/2);
    }

    @Override
    public double calcularPerimetro() {
        return dosDecimales(base+lado2+lado3);
    }

    @Override
    public double esPositivo(double n) {
        return (n==0)?1:(n>0)?n:-n;
    }

    @Override
    public double dosDecimales(double n) {
        BigDecimal bd = new BigDecimal(n);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return (bd.doubleValue());
    }
}
