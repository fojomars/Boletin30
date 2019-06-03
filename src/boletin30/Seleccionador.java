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
public class Seleccionador extends SeleccionFutbol{
public Seleccionador() {
    }

    public Seleccionador(int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
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
    
    public void seleccionarXogador(){}

    @Override
    public void concentrarse(){
        System.out.println("O seleccionador "+ nombre+" "+apellidos + " concentrase");
    }

    @Override
    public void viajar(){}

    @Override
    public void entrenar(){}

    @Override
    public void jugarPartido(){}
}
