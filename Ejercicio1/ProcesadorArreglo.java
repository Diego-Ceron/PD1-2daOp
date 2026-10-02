import java.util.Arrays;

public class ProcesadorArreglo {
    private static final int VALOR_EVALUADOR = 0;

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