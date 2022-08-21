package figuras;

import interfaces.IDosDecimales;
import interfaces.IPositivo;

import java.awt.image.ImageProducer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Trapecio extends Figura implements IPositivo, IDosDecimales {
    double baseMayor;
    double baseMenor;
    double tamLado1;
    double tamLado2;
    double altura;

    public Trapecio(double baseMayor, double baseMenor, double tamLado1, double tamLado2, double altura) {
        this.nombre = "trapecio";
        this.baseMayor = esPositivo(baseMayor);
        this.baseMenor = esPositivo(baseMenor);
        this.tamLado1 = esPositivo(tamLado1);
        this.tamLado2 = esPositivo(tamLado2);
        this.altura = esPositivo(altura);
    }

    @Override
    public double calcularArea() {
        return dosDecimales(((baseMayor+baseMenor)/2)*altura);
    }

    @Override
    public double calcularPerimetro() {
        return dosDecimales(baseMayor+baseMenor+tamLado1+tamLado2);
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
