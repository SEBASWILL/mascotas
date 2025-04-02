/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author SG702-15
 */
class Perro extends Mascota {
    public Perro(String SPECIE, String RAZA, String GENERO, String NOMBRE, int FECHADENACIMIENTO) {
        super(SPECIE, RAZA, GENERO, NOMBRE, FECHADENACIMIENTO);
    }

    
    public void moverse(int distancia) {
        System.out.println(NOMBRE + " corre " + distancia + " metros.");
    }

   

    @Override
    public String respirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String comer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String comunicarse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
