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
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    protected int id,edad;
    protected String nombre,apellidos;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, int edad, String nombre, String apellidos) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return "Id= " + id + "\nEdad= " + edad + "\nNombre= " + nombre + "\nApellidos= " + apellidos + "\n";
    }
}
