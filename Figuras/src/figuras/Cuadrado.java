package figuras;

import interfaces.IDosDecimales;
import interfaces.IPositivo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Cuadrado extends Figura implements IPositivo, IDosDecimales {
double tamañoLado;

public Cuadrado(double tamañoLado){
    this.nombre = "cuadrado";
    this.tamañoLado= esPositivo(tamañoLado);
}
    @Override
    public double calcularArea() {
        return dosDecimales(tamañoLado*tamañoLado);
    }

    @Override
    public double calcularPerimetro() {
        return dosDecimales(tamañoLado*4);
    }

    @Override
    public double esPositivo(double n) {

    return (n == 0) ?  1 : (n > 0) ? n : -n;

    }

    @Override
    public double dosDecimales(double n) {
        BigDecimal bd = new BigDecimal(n);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return (bd.doubleValue());
    }
}
