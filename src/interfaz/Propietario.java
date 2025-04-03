/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import Mundo.*;

import java.util.ArrayList;

/**
 *
 * @author SG702-08
 */
// 
public class Propietario {

    protected Persona persona;
    protected ArrayList<Mascota> mascota;
    protected ArrayList<Planta> planta;

    public Propietario(Persona persona, ArrayList<Mascota> mascota, ArrayList<Planta> planta) {
        this.persona = persona;
        this.mascota = mascota;
        this.planta = planta;
    }

    public void getPersona() {
        System.out.println(persona.toString());
    }

    public void llamarM(String n) {
        int i = 0;
        for (Mascota m : mascota) {
            if (m.getNOMBRE().equals(n)) {
                i++;
                System.out.println(m.comunicarse());
            }
        }
        String resultado = (i > 0) ? "SE llamaron " + i + " mascotas" : "No se encontraron mascotas con nombre" + n + " ";
        System.out.println(resultado);
    }

    public void AñadirM(Mascota NMascota) {
        mascota.add(NMascota);
    }

    public void EliminarM(String nombre) {
         int k = 0;
        for (int i = 0; i < mascota.size(); i++) {
            if (mascota.get(i).getNOMBRE().equals(nombre)) {
                mascota.remove(i);
                 k++;
            }
        }
         String resultado = (k > 0) ? "SE BORRARON " + k + " mascotas" : "No se encontraron mascotas con nombre" + nombre + " ";
        System.out.println(resultado);
    }

    public void AñadirP(Planta NPlanta) {
        planta.add(NPlanta);
    }
   public void EliminarP(String N) {
       int k = 0;
        for (int i = 0; i < planta.size(); i++) {
            if (planta.get(i).getNOMBRE().equals(E)) {
                planta.remove(i);
                k++;
            }
        }
             String resultado = (k > 0) ? "SE BORRARON " + k + " Plantas" : "No se encontraron plantas con nombre " + N + " ";
        System.out.println(resultado);
    }
}
