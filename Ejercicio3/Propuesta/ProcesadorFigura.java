/**
 * Procesa figuras geométricas e imprime sus áreas.
 */
public class ProcesadorFigura {
    /**
     * Imprime el área de una figura.
     *
     * @param figura figura cuyo área se imprimirá
     */
    public void imprimirArea(Figura figura) {
        System.out.println("Area: " + figura.calcularArea());
    }

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        ProcesadorFigura procesador = new ProcesadorFigura();
        Figura rectangulo = new Rectangulo(4, 5);
        Figura triangulo = new Triangulo(4, 5);

        procesador.imprimirArea(rectangulo);
        procesador.imprimirArea(triangulo);
    }
}
