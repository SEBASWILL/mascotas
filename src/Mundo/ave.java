/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author SG702-15
 * 
 */
class ave extends Mascota {
    public ave(String SPECIE, String RAZA, String GENERO, String NOMBRE, int FECHADENACIMIENTO) {
        super(SPECIE, RAZA, GENERO, NOMBRE, FECHADENACIMIENTO);
    }

    
    public void moverse(int distancia) {
        System.out.println(NOMBRE + " vuela " + distancia + " metros.");
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
        return"jadsjnasjdnaskj";
        
    }
}