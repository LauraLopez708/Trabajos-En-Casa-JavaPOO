
package com.mycompany.libro;

public class Restaurante {
    private String nombre;
    private String direccion;
    private String tipoCocina;
    private double calificacion;

    public Restaurante(String nombre, String direccion, String tipoCocina, double calificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCocina = tipoCocina;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipoCocina='" + tipoCocina + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }

    public static void main(String[] args) {
        Restaurante r1 = new Restaurante("La Bella Italia", "Calle 123", "Italiana", 4.5);
        Restaurante r2 = new Restaurante("Sushi Time", "Avenida 456", "Japonesa", 4.8);

        System.out.println(r1);
        System.out.println(r2);
    }
}
