package figuras;

import interfaces.IDosDecimales;
import interfaces.IPositivo;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Circulo extends Figura implements IPositivo, IDosDecimales {
    double radio;

    public Circulo(double radio) {
        nombre="circulo";
        this.radio = esPositivo(radio);
    }

    @Override
    public double calcularArea() {
        return dosDecimales(Math.PI*radio*radio);
    }

    @Override
    public double calcularPerimetro() {
        return dosDecimales(2*Math.PI*radio);
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
