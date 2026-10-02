// ERROR: Falta Javadoc
// ERROR: nombre que no especifica que procesa
public class Procesador {
    public static void procesar(int[] datos) {
// ERROR: no se verifica si datos esta vacío o es null
        int i = 0;
// ERROR: especificacion de que se suma
        int suma = 0;
        while (i < datos.length) {
// ERROR: se hace la suma antes de la comparación
            suma += datos[i];
            if (datos[i] < 0) {
                System.out.println("Valor negativo encontrado, se omite");
// ERROR: al encontrar un valor negativo, continue devuelve al inicio del ciclo,
// nunca se ejecuta i++ y el programa no termina
                continue;
            }
            i++;
        }
        System.out.println("Suma total: " + suma);
    }
// ERROR: sin Javadoc
    public static void main(String[] args) {
        int [] datos = {5, 10, -3, 8};
        procesar(datos);
    }
}
