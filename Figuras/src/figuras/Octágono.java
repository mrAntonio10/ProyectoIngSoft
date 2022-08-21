package figuras;

import interfaces.IDosDecimales;
import interfaces.IPositivo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Octágono extends Figura implements IPositivo, IDosDecimales {
    double tamLado;
    double apotema;

    public Octágono(double tamLado, double apotema) {
        this.nombre = "octagono";
        this.tamLado = esPositivo(tamLado);
        this.apotema = esPositivo(apotema);
    }

    @Override
    public double calcularArea() {
        return dosDecimales(4*apotema*tamLado);
    }

    @Override
    public double calcularPerimetro() {
        return dosDecimales(tamLado*8);
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
