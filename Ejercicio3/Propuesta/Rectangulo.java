/**
 * Representa un rectángulo.
 */
public class Rectangulo extends Figura {

    /**
     * Crea un rectángulo con la base y la altura indicadas.
     *
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     */
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    /**
     * Calcula el área del rectángulo.
     *
     * @return área del rectángulo
     */
    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }
}
