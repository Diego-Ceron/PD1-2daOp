import java.util.ArrayList;
import java.util.List;

public class GestorClientes {
    
    public static boolean clienteEliminado(List<String> clientes, String clienteInactivo) {
        if (clientes == null || clienteInactivo == null) {
            throw new IllegalArgumentException("La lista y el cliente no pueden ser null");
        }
        return clientes.removeIf(cliente -> cliente.equals(clienteInactivo));
    }

    public static List<String> imprimirClientes(List<String> clientes) {
        if (clientes == null) {
            throw new IllegalArgumentException("La lista ni puede ser null");
        }
        return clientes;
    }

    public static void eliminarInactivos(List<String> clientes, String clienteInactivo) {
        if (clientes == null || clienteInactivo == null) {
            throw new IllegalArgumentException("La lista y el cliente no pueden ser null");
        }
        System.out.println(clienteEliminado(clientes, clienteInactivo) ? "Clientes actuales: " + imprimirClientes(clientes) : "No hubo modificación"); 
    }

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
