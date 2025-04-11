public class Cliente {

    /*
      Datos personales del cliente
     */
    private int cedula;
    private String nombreCliente;
    private String apellido;
    private int telefono;
    private String correo;

    /**
     * Se crea el constructor de la clase Cliente
     * @param cedula
     * @param nombreCliente
     * @param apellido
     * @param telefono
     * @param correo
     */
    public Cliente(int cedula, String nombreCliente, String apellido, int telefono, String correo) {
        this.cedula = cedula;
        this.nombreCliente = nombreCliente;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
