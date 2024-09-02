//package app;
//
//public class Compra {
//    public String numero;
//    public String proveedor;
//    public int cantidadProductos;
//    public double precioPorProducto;
//
//    public Compra(String numero, String proveedor, int cantidadProductos, double precioPorProducto) {
//        this.numero = numero;
//        this.proveedor = proveedor;
//        this.cantidadProductos = cantidadProductos;
//        this.precioPorProducto = precioPorProducto;
//    }
//
//    public void establecerNumero(String numero) {
//        this.numero = numero;
//    }
//
//    public void establecerProveedor(String proveedor) {
//        this.proveedor = proveedor;
//    }
//
//    public void establecerCantidadProductos(int cantidadProductos) {
//        this.cantidadProductos = cantidadProductos;
//    }
//
//    public void establecerPrecioPorProducto(double precioPorProducto) {
//        this.precioPorProducto = precioPorProducto;
//    }
//
//    public String obtenerNumero() {
//        return numero;
//    }
//
//    public String obtenerProveedor() {
//        return proveedor;
//    }
//
//    public int obtenerCantidadProductos() {
//        return cantidadProductos;
//    }
//
//    public double obtenerPrecioPorProducto() {
//        return precioPorProducto;
//    }
//
//    public double calcularCostoTotal() {
//        return cantidadProductos * precioPorProducto;
//    }
//
//    public void mostrarCompra() {
//        System.out.println("Numero: " + numero + "\nProveedor: " + proveedor + "\nCosto Total: " + calcularCostoTotal());
//    }
//
//    public static void main(String[] args) {
//        Compra compra = new Compra("C123", "Proveedor B", 100, 5.0);
//        compra.mostrarCompra();
//    }
//}
