
public class Redes implements Categoria{

    private String nombre;
    private String descripcion;

    /**
     * Creamos el constructor de la clase Informatica
     * @param nombre

     */
    public Redes(String nombre,String descripcion) {
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
