public class Refrigerador extends Producto{

    private int capacidad;
    private int numPuertas;

    public Refrigerador(int capacidad, int numPuertas, int numero, String nombre, double precio, String marca, String color, String modelo, Categoria categoria) {
        super(numero, nombre, precio, marca,color,modelo,categoria);
        this.capacidad = capacidad;
        this.numPuertas = numPuertas;
    }

    //Se tiene en cuenta este metodo para clonar el objeto con sus propiedades
    @Override
    public Producto clone() {
        return new Refrigerador(capacidad, numPuertas,numero, nombreProducto,precio,marca,color,modelo,this.categoria);
    }
}
