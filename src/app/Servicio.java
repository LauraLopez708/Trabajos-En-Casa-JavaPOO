//package app;
//
//public class Servicio {
//    public String codigo;
//    public String descripcion;
//    public double precioPorHora;
//    public int horasTrabajadas;
//
//    public Servicio(String codigo, String descripcion, double precioPorHora, int horasTrabajadas) {
//        this.codigo = codigo;
//        this.descripcion = descripcion;
//        this.precioPorHora = precioPorHora;
//        this.horasTrabajadas = horasTrabajadas;
//    }
//
//    protected double calcularCostoTotal() {
//        return precioPorHora * horasTrabajadas;
//    }
//
//    public double obtenerCostoTotal() {
//        return calcularCostoTotal();
//    }
//
//    public void mostrarServicio() {
//        System.out.println("Codigo: " + codigo + "\nDescripcion: " + descripcion + "\nCosto Total: " + obtenerCostoTotal());
//    }
//
//    public static void main(String[] args) {
//        Servicio servicio = new Servicio("S123", "Servicio A", 50.0, 8);
//        servicio.mostrarServicio();
//    }
//}
