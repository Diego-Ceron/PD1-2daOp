import java.util.Arrays;

/**
 * Procesa arreglos de números enteros y calcula la suma de sus valores no
 * negativos.
 */
public class ProcesadorArreglo {
    private static final int VALOR_EVALUADOR = 0;

    /**
     * Suma los valores no negativos de un arreglo.
     *
     * @param datos arreglo de valores que se procesará
     * @return suma de los valores no negativos
     * @throws IllegalArgumentException si el arreglo es {@code null} o está vacío
     */
    public static int procesar(int[] datos) {
        if (datos == null || datos.length == 0) {
            throw new IllegalArgumentException("Arreglo invalido: " + Arrays.toString(datos));
        }

        int sumaArreglo = 0;

        for (int dato : datos) {
            if (dato < VALOR_EVALUADOR) {
                System.out.println("Valor negativo encontrado, se omite: " + dato);
                continue;
            }

            sumaArreglo += dato;
        }

        return sumaArreglo;
    }

    /**
     * Punto de entrada que ejecuta ejemplos de procesamiento de arreglos.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        try {
            System.out.println("Suma total: " + procesar(new int[]{5, 10, -3, 8}));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Suma total: " + procesar(new int[0]));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Suma total: " + procesar(new int[]{}));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}