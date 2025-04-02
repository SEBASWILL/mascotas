/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;



/**
 *
 * @author SG702-15
 */
public class Planta implements SerVivo{
    private String ESPECIE;
    private String COLOR;
    private String TIPO;

    public Planta(String ESPECIE, String COLOR, String TIPO) {
        this.ESPECIE = ESPECIE;
        this.COLOR = COLOR;
        this.TIPO = TIPO;
    }

    @Override
    public String respirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String comer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
