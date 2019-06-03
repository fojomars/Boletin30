/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> selec=new ArrayList<>();
        SeleccionFutbol futbolista=new Futbolista(1, "portero", 1, 20, "Rubén", "Blanco");
        SeleccionFutbol entrenador=new Entrenador(2, 2, 35, "Felipe", "Fernandez");
        SeleccionFutbol masajista=new Masajista("Medico", 5, 5, 52, "Pepe", "Lopez");
        SeleccionFutbol seleccionador=new Seleccionador(1, 50, "Pep", "Guardiola");
        futbolista.concentrarse();
        entrenador.entrenar();
        masajista.concentrarse();
        seleccionador.concentrarse();
        selec.add(futbolista);
        selec.add(entrenador);
        selec.add(masajista);
        selec.add(seleccionador);
        for(SeleccionFutbol f: selec){
            JOptionPane.showMessageDialog(null,f);
        }
    }
    
}
