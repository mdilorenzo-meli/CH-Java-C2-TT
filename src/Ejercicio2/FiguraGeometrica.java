package Ejercicio2;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString() {
        return "Es una abstracta, no tiene sentido. Mejor que la overrideen las ''hijas''";
    }
}
