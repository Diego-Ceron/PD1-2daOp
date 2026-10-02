public class Figura {
    public double base;
    public double altura;

    public double calcularArea() {
        return base * altura;
    }
}

public class Triangulo extends Figura {
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

public class Procesador {
    public void imprimirArea(Figura figura) {
        if (figura instanceof Triangulo) {
            Triangulo t = (Triangulo) figura;
            System.out.println("Área del triángulo: " + t.calcularArea());
        } else {
            System.out.println("Área: " + figura.calcularArea());
        }
    }

    public static void main(String[] args) {
        Procesador p = new Procesador();
        Figura rectangulo = new Figura();
        rectangulo.base = 4;
        rectangulo.altura = 5;

        Triangulo triangulo = new Triangulo();
        triangulo.base = 4;
        triangulo.altura = 5;

        p.imprimirArea(rectangulo);
        p.imprimirArea(triangulo);
    }
}
