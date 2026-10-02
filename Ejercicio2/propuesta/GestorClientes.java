import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona una lista de clientes y permite eliminar clientes inactivos.
 */
public class GestorClientes {
    
    /**
     * Elimina de la lista todas las apariciones del cliente indicado.
     *
     * @param clientes lista de clientes que se modificará
     * @param clienteInactivo nombre del cliente que se eliminará
     * @return {@code true} si se eliminó a un cliente; {@code false} en caso contrario
     * @throws IllegalArgumentException si la lista o el cliente son {@code null}
     */
    public static boolean clienteEliminado(List<String> clientes, String clienteInactivo) {
        if (clientes == null || clienteInactivo == null) {
            throw new IllegalArgumentException("La lista y el cliente no pueden ser null");
        }
        return clientes.removeIf(cliente -> cliente.equals(clienteInactivo));
    }

    /**
     * Obtiene la lista de clientes recibida.
     *
     * @param clientes lista de clientes que se devolverá
     * @return la misma lista de clientes recibida
     * @throws IllegalArgumentException si la lista es {@code null}
     */
    public static List<String> imprimirClientes(List<String> clientes) {
        if (clientes == null) {
            throw new IllegalArgumentException("La lista ni puede ser null");
        }
        return clientes;
    }

    /**
     * Elimina los clientes indicados y muestra el resultado de la operación.
     *
     * @param clientes lista de clientes que se modificará
     * @param clienteInactivo nombre del cliente que se eliminará
     * @throws IllegalArgumentException si la lista o el cliente son {@code null}
     */
    public static void eliminarInactivos(List<String> clientes, String clienteInactivo) {
        if (clientes == null || clienteInactivo == null) {
            throw new IllegalArgumentException("La lista y el cliente no pueden ser null");
        }
        System.out.println(clienteEliminado(clientes, clienteInactivo) ? "Clientes actuales: " + imprimirClientes(clientes) : "No hubo modificación"); 
    }

    /**
     * Punto de entrada del programa de ejemplo.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add("Felipe");
        clientes.add(new String("Pedro"));
        System.out.println("Clientes antes de eliminar: " + clientes);
        eliminarInactivos(clientes, "Pedro");
    }
}
