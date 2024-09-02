//package app;
//
//public class Inventario {
//    public String codigoProducto;
//    public int cantidad;
//    public double precioPorUnidad;
//
//    public Inventario(String codigoProducto, int cantidad, double precioPorUnidad) {
//        this.codigoProducto = codigoProducto;
//        this.cantidad = cantidad;
//        this.precioPorUnidad = precioPorUnidad;
//    }
//
//    private double calcularValorTotal() {
//        return cantidad * precioPorUnidad;
//    }
//
//    public double obtenerValorTotal() {
//        return calcularValorTotal();
//    }
//
//    public void mostrarInventario() {
//        System.out.println("Codigo Producto: " + codigoProducto + "\nCantidad: " + cantidad + "\nValor Total: " + obtenerValorTotal());
//    }
//
//    public static void main(String[] args) {
//        Inventario inventario = new Inventario("PRD123", 200, 15.0);
//        inventario.mostrarInventario();
//    }
//}
