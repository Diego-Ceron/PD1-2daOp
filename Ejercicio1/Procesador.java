// Codigo original
// Falta formato JAVADOC
public class Procesador {
    public static void procesar(int[] datos) {
        int i = 0;
        int suma = 0;
        while (i < datos.length) {
            suma += datos[i];
            if (datos[i] < 0) {
                System.out.println("Valor negativo encontrado, se omite");
                continue;
            }
            i++;
        }
        System.out.println("Suma total: " + suma);
    }

    public static void main(String[] args) {
        int [] datos = {5, 10, -3, 8};
        procesar(datos);
    }
}
