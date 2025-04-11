import java.util.HashMap;
import java.util.Map;

/*
    Esta es la clase base Prototype.
    En ella se realizara la clonacion de los objetos
 */
public class clonarProducto {

    String clave;
    Producto p;

    private Map<String, Producto> prototipos = new HashMap<>();// Se crea un mapa para guardar los objetos

    /**
     * Este es el constructor de la clase Prototype
     * En ella pasara la clave como referencia al objeto que se quiere clonar respecto a la clave
     * @param clave
     * @param p
     */
    public void registrar(String clave, Producto p) {
        prototipos.put(clave, p);
    }

    /**
     * Este metodo se encarga de clonar el objeto que se le pase como referencia
     * @param clave
     * @return
     */
    public Producto clonar(String clave) {
        Producto original = prototipos.get(clave);
        return original != null ? original.clone() : null;
    }
}
