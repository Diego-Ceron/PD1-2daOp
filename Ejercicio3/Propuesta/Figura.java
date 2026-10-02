/**
 * Representa una figura geométrica definida por una base y una altura.
 */
public abstract class Figura {
    private double base;
    private double altura;

    /**
     * Crea una figura con las dimensiones indicadas.
     *
     * @param base base de la figura
     * @param altura altura de la figura
     */
    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Actualiza la base de la figura.
     *
     * @param base nueva base de la figura
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Obtiene la base de la figura.
     *
     * @return base de la figura
     */
    public double getBase() {
        return base;
    }

    /**
     * Actualiza la altura de la figura.
     *
     * @param altura nueva altura de la figura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Obtiene la altura de la figura.
     *
     * @return altura de la figura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Calcula el área de la figura concreta.
     *
     * @return área de la figura
     */
    public abstract double calcularArea();
}
