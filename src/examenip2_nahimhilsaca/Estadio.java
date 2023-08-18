/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenip2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Estadio {
    private String nombre_estadio;
    private String ciudad;
    private int capacidad;
    private Equipo equipo_estadio;

    public Estadio() {
    }

    public Estadio(String nombre_estadio, String ciudad, int capacidad, Equipo equipo_estadio) {
        this.nombre_estadio = nombre_estadio;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.equipo_estadio = equipo_estadio;
    }

    public String getNombre_estadio() {
        return nombre_estadio;
    }

    public void setNombre_estadio(String nombre_estadio) {
        this.nombre_estadio = nombre_estadio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Equipo getEquipo_estadio() {
        return equipo_estadio;
    }

    public void setEquipo_estadio(Equipo equipo_estadio) {
        this.equipo_estadio = equipo_estadio;
    }

    @Override
    public String toString() {
        return "Estadio" + "nombre_estadio=" + nombre_estadio + " ciudad=" + ciudad + " capacidad=" + capacidad + " equipo_estadio=" + equipo_estadio;
    }
    
    
    
}
