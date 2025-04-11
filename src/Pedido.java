import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Pedido {

    private Cliente cliente;
    private int idCompra;
    private Producto producto;
    private Date fecha;
    private int numeroTarjetaCredito;
    private clonarProducto clonarProductos;
    ArrayList<Producto> productosSeleccionados = new ArrayList<>(); // Para almacenar los productos seleccionados por el cliente
    ArrayList<Cliente> comprasClientes = new ArrayList<>(); // Para almacenar los clientes


    public Pedido(Cliente cliente, Date fecha, int numeroTarjetaCredito, int idCompra, clonarProducto clonarProductos) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.idCompra = idCompra;
        this.clonarProductos = clonarProductos;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void ingresaCliente() {

        comprasClientes.add(cliente); // Se agrega el cliente a la lista de compras
    }

    /**
     * Este metodo permite al cliente seleccionar un producto de la lista de productos
     * @param num_producto
     */
    public void procesoCompra(int num_producto) {

        Producto productoClonado = null;

        //Se clona el producto seleccionado y con eso se evita crear un nuevo objeto
        switch (num_producto) {
            case 1:
                productoClonado = clonarProductos.clonar("camara");
                if (productoClonado != null) {
                    System.out.println(productoClonado); // Se clona el objeto y se imprime
                }
                break;
            case 2:
                productoClonado = clonarProductos.clonar("impresora");
                if (productoClonado != null) {
                    System.out.println(productoClonado);// Se clona el objeto y se imprime
                }
                break;
            case 3:
                productoClonado = clonarProductos.clonar("refrigerador");
                if (productoClonado != null) {
                    System.out.println(productoClonado);// Se clona el objeto y se imprime
                }
                break;
            case 4:
                productoClonado = clonarProductos.clonar("lavadora");
                if (productoClonado != null) {
                    System.out.println(productoClonado);// Se clona el objeto y se imprime
                }
                break;
            default:
                System.out.println("Opcion no valida");
        }

        if (productoClonado != null) {
            productosSeleccionados.add(productoClonado);
        }
    }


    /**
     * Este metodo permite al cliente ver la informacion de su compra
     */
    public void informacionCompra() {

        System.out.println("Cliente: ");
        for (Cliente cliente : comprasClientes) {
            System.out.println("Nombre: " + cliente.getNombreCliente()
                    + "\nApellido: " + cliente.getApellido()
                    + "\nNumero de documento: " + cliente.getCedula()
                    + "\nNumero de telefono: " + cliente.getTelefono()
                    + "\nCorreo electronico: " + cliente.getCorreo());

            System.out.println("--------------------------------------------------");

        }

        int numeroProducto = 1;

        System.out.println("Productos comprados: ");
        for (Producto producto : productosSeleccionados) {
            System.out.println("Producto #" + (numeroProducto));
            System.out.println("Nombre:" + producto.nombreProducto
                    + "\nPrecio: " + producto.precio
                    + "\nMarca: " + producto.marca
                    + "\nColor: " + producto.color
                    + "\nModelo: " + producto.modelo
                    + "\nCategoria: " + producto.categoria.getNombreCategoria() + " " + producto.categoria.getDescripcion());
            System.out.println("--------------------------------------------------");
            numeroProducto++;
        }
        comprasClientes.clear();
    }

}
