/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author fojomars
 */
public class Futbolista extends SeleccionFutbol{
public int dorsal;
    public String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcacion, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    public void entrevista(){}
    
    @Override
    public void concentrarse(){
    System.out.println("O futbolista "+ nombre+" "+apellidos + " concentrase");
    }

    @Override
    public void viajar(){}

    @Override
    public void entrenar(){}

    @Override
    public void jugarPartido(){}

    @Override
    public String toString() {
        return super.toString() + "Dorsal= " + dorsal + "\nDemarcacion= " + demarcacion;
    }
}
