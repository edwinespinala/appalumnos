package hn.uth2.appalumnos2.entity;

public class alumno {
    private String nombre;
    private String cuenta;

    public alumno(String nombre, String cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
