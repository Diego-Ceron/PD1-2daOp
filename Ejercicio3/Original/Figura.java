// ERROR: falta Javadoc
// ERROR: figura debe ser abstract para hacer polimorfismo
public class Figura {
// ERROR: los atributos deben ser private
    public double base;
    public double altura;
// ERROR: faltan los sets y gets
    public double calcularArea() {
        return base * altura;
    }
}

public class Triangulo extends Figura {
    public double calcularArea() {
// ERROR: se emplea un número mágico en el cálculo
        return (base * altura) / 2;
    }
}
// ERROR: falta Javadoc
// ERROR: nombre poco descriptivo
public class Procesador {
// ERROR: la funcion mezcla respoonsabilidad, por lo que cada que se agrega una figura
// se tendria que modificar lo cual no hace mantenible el código
    public void imprimirArea(Figura figura) {
// ERROR: como figura no es abstracta se usa instanceof rompiendo el polimorfismo
        if (figura instanceof Triangulo) {
            Triangulo t = (Triangulo) figura;
            System.out.println("Área del triángulo: " + t.calcularArea());
        } else {
            System.out.println("Área: " + figura.calcularArea());
        }
    }

    public static void main(String[] args) {
        Procesador p = new Procesador();
// ERROR: rectangulo deberia heredar de figura
        Figura rectangulo = new Figura();
// ERROR: atributos son publicos y se modifican directamente
        rectangulo.base = 4;
        rectangulo.altura = 5;

        Triangulo triangulo = new Triangulo();
        triangulo.base = 4;
        triangulo.altura = 5;

        p.imprimirArea(rectangulo);
        p.imprimirArea(triangulo);
    }
}
