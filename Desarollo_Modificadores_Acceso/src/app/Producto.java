//package app;
//
//public class Producto {
//
//   public String codigo;
//   public String nombre;
//   public double precio;
//
//    public Producto(String codigo, String nombre, double precio) {
//        this.codigo = codigo;
//        this.nombre = nombre;
//        this.precio = precio;
//    }
//
//    public String getCodigo() {
//        return codigo;
//    }
//
//    public void setCodigo(String codigo) {
//        this.codigo = codigo;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public double getPrecio() {
//        return precio;
//    }
//
//    public void setPrecio(double precio) {
//        this.precio = precio;
//    }
//
//    public void aplicarDescuento(double porcentaje) {
//        this.precio -= this.precio * (porcentaje / 100);
//    }
//
//    public void mostrarProducto() {
//        System.out.println("Codigo: " + codigo + "\nNombre: " + nombre + "\nPrecio " + precio);
//    }
//
//    public static void main(String[] args) {
//        Producto producto = new Producto("123", "Laptop", 1500.0);
//        producto.mostrarProducto();
//        producto.aplicarDescuento(10);
//        producto.mostrarProducto();
//    }
//}
