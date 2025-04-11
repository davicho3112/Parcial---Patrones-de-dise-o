public class Lavadora extends Producto{

    private int capacidad;

    public Lavadora(int capacidad, int numero, String nombre, double precio, String marca, String color, String modelo, Categoria categoria) {
        super(numero, nombre, precio,marca,color,modelo,categoria);
        this.capacidad = capacidad;
    }


    //Se tiene en cuenta este metodo para clonar el objeto con sus propiedades
    @Override
    public Producto clone() {
        return new Lavadora(capacidad, numero, nombreProducto,precio,marca,color,modelo,this.categoria);
    }
}
