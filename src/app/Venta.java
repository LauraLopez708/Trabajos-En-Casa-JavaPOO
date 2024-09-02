//package app;
//
//public class Venta {
//    public String producto;
//    public int cantidad;
//    public double precioUnitario;
//
//    public Venta(String producto, int cantidad, double precioUnitario) {
//        this.producto = producto;
//        this.cantidad = cantidad;
//        this.precioUnitario = precioUnitario;
//    }
//
//    private double calcularTotalVenta() {
//        return cantidad * precioUnitario;
//    }
//
//    public double obtenerTotalVenta() {
//        return calcularTotalVenta();
//    }
//
//    public void mostrarVenta() {
//        System.out.println("Producto: " + producto + "\nCantidad: " + cantidad + "\nTotal de la Venta: " + obtenerTotalVenta());
//    }
//
//    public static void main(String[] args) {
//        Venta venta = new Venta("Producto C", 30, 10.0);
//        venta.mostrarVenta();
//    }
//}
