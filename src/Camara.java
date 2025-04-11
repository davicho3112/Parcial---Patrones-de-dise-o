public class Camara extends Producto{

    private String tipo;

    public Camara(String tipo, int numero, String nombre, double precio, String marca, String color, String modelo, Categoria categoria) {
        super(numero, nombre, precio,marca,color,modelo,categoria);
        this.tipo = tipo;
    }

    //Se tiene en cuenta este metodo para clonar el objeto con sus propiedades
    @Override
    public Producto clone() {
        return new Camara(tipo,numero, nombreProducto,precio,marca,color,modelo,this.categoria);
    }
}
