//package app;
//
//public class Proveedor {
//    public String nombre;
//    public String empresa;
//    public String telefono;

//    public Proveedor(String nombre, String empresa, String telefono) {
//        this.nombre = nombre;
//        this.empresa = empresa;
//        this.telefono = telefono;
//    }
//
//    protected void establecerNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    protected void establecerEmpresa(String empresa) {
//        this.empresa = empresa;
//    }
//
//    protected void establecerTelefono(String telefono) {
//        this.telefono = telefono;
//    }
//
//    protected String obtenerNombre() {
//        return nombre;
//    }
//
//    protected String obtenerEmpresa() {
//        return empresa;
//    }
//
//    protected String obtenerTelefono() {
//        return telefono;
//    }
//
//    public void mostrarInformacion() {
//        System.out.println("Nombre: " + obtenerNombre() + "\nEmpresa: " + obtenerEmpresa() + "\nTeléfono: " + obtenerTelefono());
//    }
//
//    public static void main(String[] args) {
//        Proveedor proveedor = new Proveedor("Proveedor A", "Empresa A", "123456789");
//        proveedor.mostrarInformacion();
//    }
//}
