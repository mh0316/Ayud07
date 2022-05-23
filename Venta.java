import java.util.Calendar;
import java.util.Date;

public class Venta {
    private String Vendedor;
    private String Cliente;
    private String vehiculoComprado;
    private String obtenerLineasPDF;
    private String Fecha;
    private String Vehiculo;

    public Venta(String Vendedor, String Cliente, String vehiculoComprado, String obtenerLineasPDF, String Fecha) {
        this.Vendedor = Vendedor;
        this.Cliente = Cliente;
        this.vehiculoComprado = vehiculoComprado;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getVehiculoComprado() {
        return vehiculoComprado;
    }

    public void setVehiculoComprado(String vehiculoComprado) {
        this.vehiculoComprado = vehiculoComprado;
    }

    public String getobtenerLineasPDF(String obtenerLineasPDF) {
        return obtenerLineasPDF;
    }

    public void setobtenerLineasPDF() {
        this.obtenerLineasPDF = obtenerLineasPDF;
    }
    public Date getFecha(){
        Date Fecha = Calendar.getInstance().getTime();
        return Fecha;
    }

    public void setFecha(){
        this.Fecha = Fecha;
    }

    public String getVehiculo(String Vehiculo){
        return Vehiculo;
    }

    public void setVehiculo(){
        this.Vehiculo = Vehiculo;
    }
}