package BaseDatos;

import figuras.Figura;
import interfaces.IDosDecimales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BdFiguras implements IDosDecimales {
    private ArrayList<Figura> figuraArrayList = new ArrayList<>();




    public void añadirFiguraBD(Figura figura){
        figuraArrayList.add(figura);
    }

    public void listarAreaBDFigura() {
        int contador=1 ;
        for (Figura figura : figuraArrayList) {
            System.out.println( "Nº: "+ (contador++)+" Nombre: " +figura.getNombre()+ " Area: "+ figura.calcularArea() +" Perímetro: "+figura.calcularPerimetro());
        }
    }

    public double areaTotalFiguras(){
        double areaTotal=0;
        for(Figura figura: figuraArrayList){
           areaTotal=areaTotal+figura.calcularArea();
        }
        return dosDecimales(areaTotal);
    }

    public double perimetroTotalFiguras(){
        double perimetroTotal=0;
        for(Figura figura:figuraArrayList){
            perimetroTotal=perimetroTotal+figura.calcularPerimetro();
        }
        return dosDecimales(perimetroTotal);
    }

    @Override
    public double dosDecimales(double n) {
        BigDecimal bd = new BigDecimal(n);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return (bd.doubleValue());
    }
}
