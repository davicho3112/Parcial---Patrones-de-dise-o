public class Router extends Producto{
    private String tipo;
    private int numPuertos;
    private String frecuencia;

    public Router(String tipo, int numPuertos, String frecuencia, int numero, String nombre, double precio, String marca, String color, String modelo, Categoria categoria) {
        super(numero, nombre, precio, marca,color,modelo,categoria);
        this.tipo = tipo;
        this.numPuertos = numPuertos;
        this.frecuencia = frecuencia;
    }

    //Se tiene en cuenta este metodo para clonar el objeto con sus propiedades
    @Override
    public Producto clone() {
        return new Router(tipo,numPuertos,frecuencia,numero,nombreProducto,precio,marca,color,modelo,this.categoria);
    }
}
