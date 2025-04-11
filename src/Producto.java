/*
En la clase abstracta Producto se definen las propiedades del producto y se implementa el
método clone() para permitir la clonación de los objetos que heredan de esta clase.
 */
public abstract class Producto implements  Cloneable {

    // Definimos las propiedades del producto
    protected int numero;
    protected String nombreProducto;
    protected double precio;
    protected String marca;
    protected String color;
    protected String modelo;
    Categoria categoria;

    public Producto(int numero, String nombreProducto, double precio, String marca, String color, String modelo, Categoria categoria) {
        this.numero = numero;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    /**
     * En este metodo se implementa el metodo clone() para permitir la clonacion de los objetos
     * @return
     */
    @Override
    public Producto clone() {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clonación no soportada", e);
        }
    }
}
