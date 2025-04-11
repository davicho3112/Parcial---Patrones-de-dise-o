import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner leerDatos = new Scanner(System.in);
        Scanner escogerOpcion = new Scanner(System.in);

        /*
        Se realiza la logica del patron de diseño Bridge al realizar las categorias y relacionarlas con
        las subclases de los productos. Esto permitira crear tambien otra categoria
         */
        Categoria categoriaElectrodomestico = new Electrodomestico("Electrodomestico","Productos de uso diario para el hogar");
        Categoria categoriaInformatica = new Informatica("Informatica", " Productos de computacion y tecnologia");
        Categoria categoriaRedes = new Redes("Redes","Productos de redes y telecomunicaciones");

        /*
        A cada producto se le agrega sus propiedades y se relaciona con su categoria correspondiente.
        Se tiene en cuenta el patron de diseño Prototype al implementar el metodo clone() en cada subclase
         */
        Producto camara = new Camara("Mirrorless(Sin espejo)",2009,"Sony Alpha",2499.99,"Sony","Negro","Alpha 7 IV",categoriaInformatica);
        Producto impresora = new Impresora( 4792,"Epson EcoTank L3250",899.900,"Epson","Blanco","L3250",categoriaInformatica);
        Producto refrigerador = new Refrigerador(380,2,4007,"Nevera LG",1850.00,"LG","Acero inoxidable"," InstaView Door-in-Door™ GN-B462HLCL",categoriaElectrodomestico);
        Producto lavadora = new Lavadora(8,3,"Lavadora Automatica",12999.90, "Samsung","Negro","WW80T534DAW/CO",categoriaElectrodomestico);
        Producto router = new Router("Inalambrico",4,"2.4GHz/5GHz",1,
                "Router inalambrico Doble Banda Gigabit",79.99,"TP-Link","Negro","Archer A7",categoriaRedes);

        /*
        Llamamos al metodo registrar de la clase clonarProducto para registrar los productos. En ese metodo
        se van agregando los productos a un mapa con su respectiva clave.
         */
        clonarProducto iniciarProductos = new clonarProducto();

        iniciarProductos.registrar("impresora", impresora);
        iniciarProductos.registrar("refrigerador", refrigerador);
        iniciarProductos.registrar("lavadora", lavadora);
        iniciarProductos.registrar("camara", camara);
        iniciarProductos.registrar("router", router);


        boolean iniciarNuevaCompra = false; // Para controlar si el cliente desea realizar una nueva compra
        int numeroCompra = 1;

        do{
            boolean seguirComprando = true; // Para controlar si el cliente desea seguir comprando

            //Se preguntan por los datos del cliente
            System.out.print("Ingrese su nombre: ");
            String nombreCliente = leerDatos.nextLine();
            System.out.print("Ingrese su apellido: ");
            String apellidoCliente = leerDatos.nextLine();
            System.out.print("Ingrese su numero de documento: ");
            int documentoCliente = leerDatos.nextInt();
            System.out.print("Ingrese su numero de telefono: ");
            int telefonoCliente = leerDatos.nextInt();
            System.out.print("Ingrese su Correo electronico: ");
            String correoCliente = leerDatos.next();
            leerDatos.nextLine(); // Consume el salto de línea pendiente
            System.out.print("Ingrese su numero de tarjeta de credito: ");
            int numeroTarjetaCredito = leerDatos.nextInt();
            leerDatos.nextLine(); // Consume el salto de línea pendiente
            Cliente cliente = new Cliente(documentoCliente, nombreCliente, apellidoCliente, telefonoCliente, correoCliente);

            //Se genera la fecha de la compra
            String fechaTexto = "10/04/2025";
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formato.parse(fechaTexto);

            //Se crea el pedido y se llama al metodo procesoCompra de la clase Pedido
            Pedido pedido = new Pedido(cliente,fecha,numeroTarjetaCredito,numeroCompra,iniciarProductos);

            pedido.ingresaCliente(); // Se agrega el cliente a la lista de compras

            while(seguirComprando) {


                //Se muestran los productos disponibles para la compra
                System.out.println("Seleccione el producto que deseas comprar:");
                System.out.println("1. Camara"
                        +"\n2. Impresora"
                        +"\n3. Refrigerador"
                        +"\n4. Lavadora");
                System.out.print("Seleccione el producto que desea comprar:");
                int opcionProducto = escogerOpcion.nextInt();
                System.out.println("------------------");


                switch(opcionProducto){

                    case 1:
                        pedido.procesoCompra(1);

                        break;

                    case 2:
                        pedido.procesoCompra(2);

                        break;

                    case 3:
                        pedido.procesoCompra(3);

                        break;

                    case 4:
                        pedido.procesoCompra(4);

                        break;

                    default:

                }


                //Se pregunta si el cliente desea seguir comprando
                System.out.println("¿Desea comprar otro producto?"
                        +"\n1. Si"
                        +"\n2. No");
                System.out.print("Seleccione una opcion:");
                int opcionSeguirComprando = escogerOpcion.nextInt();
                seguirComprando = opcionSeguirComprando == 1 ? true : false;

            }

            //Se muestra la factura al cliente
            pedido.informacionCompra();

            //Se pregunta si el cliente desea realizar otra compra
            System.out.print("¿Desea realizar otra compra?"
                    +"\n1. Si"
                    +"\n2. No");
            System.out.print("Seleccione una opcion:");
            int opcionNuevaCompra = escogerOpcion.nextInt();
            iniciarNuevaCompra = opcionNuevaCompra == 1 ? true : false;

            numeroCompra++;
        }while(iniciarNuevaCompra);
    }
}