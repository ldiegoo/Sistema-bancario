package carrito.metodoPago;

public class Pago {
    private String tipo; // "credito" o "debito"
    private double monto;
    private String fecha;
    private String numeroTarjeta;

    public Pago(String tipo, double monto, String fecha, String numeroTarjeta) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void mostrarDetallesPago() {
        System.out.printf("Tipo: %s, Monto: %.2f, Fecha: %s, Número de Tarjeta: %s%n",
                getTipo(),
                getMonto(),
                getFecha(),
                getNumeroTarjeta().replaceAll("\\d(?=\\d{4})", "*")); // Oculta todos los dígitos menos los últimos 4
    }
}
