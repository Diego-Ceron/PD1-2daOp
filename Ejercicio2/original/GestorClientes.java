import java.util.ArrayList;
import java.util.List;
// ERROR: falta Javadoc
public class GestorClientes {
// ERROR: inactivo podria tener un nombre mas descriptivo
    public static void eliminarInactivos(List<String> clientes, String inactivo) {
// ERROR: falta validar que los datos no sean null o vacios
        for (String cliente : clientes) {
// ERROR: usar == para comparar string no es la mejor práctica,
// puede generar errores
            if (cliente == inactivo) {
//ERROR: .remove puede generar conflictos
                clientes.remove(cliente);
            }
        }
    }
// ERROR: sin Javadoc
    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add(new String("Pedro"));
        eliminarInactivos(clientes, "Pedro");
        System.out.println(clientes);
    }
}
