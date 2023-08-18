/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenip2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public abstract class Jugador {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String pie_habil;
    protected int Rating;
    private Equipo equipo_jugador;
    protected int agarre;
    protected int lanzamiento;
    protected int fisico;
    protected int ritmo;
    protected int entrada;
    protected int vision;
    protected int passing;
    protected int regate;
    protected int disparo;

    public Jugador() {
    }


    public Jugador(String nombre, int edad, String nacionalidad, String pie_habil, Equipo equipo_jugador) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pie_habil = pie_habil;
        this.equipo_jugador = equipo_jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPie_habil() {
        return pie_habil;
    }

    public void setPie_habil(String pie_habil) {
        this.pie_habil = pie_habil;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public Equipo getEquipo_jugador() {
        return equipo_jugador;
    }

    public void setEquipo_jugador(Equipo equipo_jugador) {
        this.equipo_jugador = equipo_jugador;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }

    @Override
    public String toString() {
        return "Jugador" + "nombre=" + nombre + " edad=" + edad + " nacionalidad=" + nacionalidad + " Pie habil=" + pie_habil + " Rating=" + Rating + " Equipo=" + equipo_jugador ;
    }
    
      public abstract void poscion();
      
      public abstract void no_posicion();
}
