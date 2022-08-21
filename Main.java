import BaseDatos.BdFiguras;
import figuras.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
Integrantes Grupo 2:
Willan Alfredo Adolfo Velasco Fernandez.
Marco Antonio Roca Montenegro
 */
public class Main {
    public static void main(String[] args) {

        Figura figura1= new Cuadrado(-2.5);
        Figura figura2 = new Triangulo(2,-3.2564,1.5,1.8);
        Figura figura3 = new Rombo(3,5,4);
        Figura figura4 = new Circulo(0);

        System.out.println(figura1.calcularPerimetro());
        //añadimos figuras a la base de datos
        BdFiguras bdFiguras= new BdFiguras();
        bdFiguras.añadirFiguraBD(figura2);
        bdFiguras.añadirFiguraBD(figura3);
        bdFiguras.añadirFiguraBD(figura1);
        bdFiguras.añadirFiguraBD(figura4);
        bdFiguras.listarAreaBDFigura();

        System.out.println("\nPerimetro Total: " +bdFiguras.perimetroTotalFiguras());
        System.out.println("Area Total: " +bdFiguras.areaTotalFiguras());


    }
}
