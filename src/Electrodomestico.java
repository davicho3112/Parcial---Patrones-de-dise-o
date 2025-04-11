/* Implementa los metodos de la interfaz Categoria
   Esta seria la categoria concreta.
 */
public class Electrodomestico implements Categoria {

    private String nombre;
    private String descripcion;

    /**
     * Creamos el constructor de la clase Electrodomestico
     * @param nombre
     * @param marca
     * @param modelo
     * @param color
     */
    public Electrodomestico(String nombre,String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombreCategoria() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
