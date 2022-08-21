package figuras;

import interfaces.IDosDecimales;
import interfaces.IPositivo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Rombo extends Figura implements IPositivo, IDosDecimales {

    double D;
    double d;
    double tamLados;

    public Rombo(double d, double d1, double tamLados) {
        this.nombre = "rombo";
        this.D = esPositivo(d);
        this.d = esPositivo(d1);
        this.tamLados = esPositivo(tamLados);
    }

    @Override
    public double calcularArea() {
        return dosDecimales((D*d)/2);
    }

    @Override
    public double calcularPerimetro() {
        return dosDecimales(tamLados*4);
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
