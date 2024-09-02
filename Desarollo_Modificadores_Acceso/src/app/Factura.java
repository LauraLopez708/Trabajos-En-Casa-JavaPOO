//package app;
//
//public class Factura {
//    public String numero;
//    public String cliente;
//    public double subtotal;
//
//    public Factura(String numero, String cliente, double subtotal) {
//        this.numero = numero;
//        this.cliente = cliente;
//        this.subtotal = subtotal;
//    }
//
//    private double calcularIVA() {
//        return subtotal * 0.19;
//    }
//
//    private double calcularTotal() {
//        return subtotal + calcularIVA();
//    }
//
//    public double obtenerTotal() {
//        return calcularTotal();
//    }
//
//    public void mostrarFactura() {
//        System.out.println("Numero: " + numero + "\nCliente: " + cliente + "\nTotal: " + obtenerTotal());
//    }
//
//    public static void main(String[] args) {
//        Factura factura = new Factura("F123", "Cliente A", 100.0);
//        factura.mostrarFactura();
//    }
//}
