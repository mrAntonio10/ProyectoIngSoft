package figuras;

public abstract class Figura {
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    //métodos abstractos presentes en todas las figuras
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
