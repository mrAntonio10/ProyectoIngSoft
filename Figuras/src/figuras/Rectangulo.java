package figuras;

import interfaces.IDosDecimales;
import interfaces.IPositivo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Rectangulo extends Figura implements IPositivo, IDosDecimales {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.nombre = "rectangulo";
        this.base = esPositivo(base);
        this.altura = esPositivo(altura);
    }

    @Override
    public double calcularArea() {
        return dosDecimales(base*altura);
    }

    @Override
    public double calcularPerimetro() {
        return dosDecimales((base*2)+(altura*2));
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
