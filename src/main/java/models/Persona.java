package models;

import java.io.Serializable;

public class Persona implements Serializable {

    String nombre;
    String sexo;
    Integer edad;
    Integer peso;
    Integer altura;
    Double ger;
    Double get;
    String actividad;
    double factorActividad;

    public void calcularFactorActividad() {

        if ("Hombre".equalsIgnoreCase(sexo)) {

            if ("Muy ligera".equalsIgnoreCase(actividad)) {
                factorActividad = 1.3;
            } else if ("Ligera".equalsIgnoreCase(actividad)) {

                factorActividad = 1.3;
            } else if ("Moderada".equalsIgnoreCase(actividad)) {

                factorActividad = 1.7;
            } else if ("Intensa".equalsIgnoreCase(actividad)) {

                factorActividad = 2.1;
            }

        } else {
            if ("Muy ligera".equalsIgnoreCase(actividad)) {
                factorActividad = 1.3;
            } else if ("Ligera".equalsIgnoreCase(actividad)) {

                factorActividad = 1.5;
            } else if ("Moderada".equalsIgnoreCase(actividad)) {

                factorActividad = 1.6;
            } else if ("Intensa".equalsIgnoreCase(actividad)) {

                factorActividad = 1.9;
            }

        }

    }

    public void calcularGER() {

        if ("Hombre".equalsIgnoreCase(sexo)) {
            ger = (altura * 6.25) + (peso * 10) - (edad * 5) + 5;

        } else {
            ger = (altura * 6.25) + (peso * 10) - (edad * 5) + 655.0955;
        }

    }

    public void calcutarGET() {

        get = ger * factorActividad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Double getGer() {
        return ger;
    }

    public void setGer(Double ger) {
        this.ger = ger;
    }

    public Double getGet() {
        return get;
    }

    public void setGet(Double get) {
        this.get = get;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", ger=" + ger + ", get=" + get + ", actividad=" + actividad + '}';
    }

}
