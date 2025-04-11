/* Implementa los metodos de la interfaz Categoria
   Esta seria la categoria concreta.
 */
public class Informatica implements Categoria{

    private String nombre;
    private String descripcion;
    /**
     * Creamos el constructor de la clase Informatica
     * @param nombre
     * @param marca
     * @param modelo
     * @param color
     */
    public Informatica(String nombre,String descripcion) {
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
