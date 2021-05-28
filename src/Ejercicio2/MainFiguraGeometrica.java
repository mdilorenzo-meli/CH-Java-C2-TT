package Ejercicio2;

public class MainFiguraGeometrica {

    public static void main(String[] args)
    {
        Circulo c = new Circulo(100);
        Rectangulo r = new Rectangulo(4,4);
        Triangulo t = new Triangulo(2,1);

        FiguraGeometrica[] arr={c,r,t};

        double x = FigurasUtil.areaPromedio(arr);
        System.out.println(String.format("%.2f",x));
    }
}
