/**
 * Representa un triángulo cuya base y altura determinan su área.
 */
public class Triangulo extends Figura {
    private static final double DIVISOR_AREA_TRIANGULO = 2.0;

    /**
     * Crea un triángulo con la base y la altura indicadas.
     *
     * @param base base del triángulo
     * @param altura altura del triángulo
     */
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    /**
     * Calcula el área del triángulo.
     *
     * @return área del triángulo
     */
    @Override 
    public double calcularArea() {
        return getBase() * getAltura() / DIVISOR_AREA_TRIANGULO;
    }
    
}
