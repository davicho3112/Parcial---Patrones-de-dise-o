public class Impresora extends Producto {

    Foto foto;


    public Impresora(int numero, String nombre, double precio, String marca, String color, String modelo, Categoria categoria) {
        super(numero, nombre, precio,marca,color,modelo, categoria);
    }

    public Foto foto() {
        return foto;
    }

    //Se tiene en cuenta este metodo para clonar el objeto con sus propiedades
    @Override
    public Producto clone() {
        return new Impresora(numero, nombreProducto,precio,marca,color,modelo,this.categoria);
    }
}
