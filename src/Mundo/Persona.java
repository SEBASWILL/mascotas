/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author SG702-15
 */
public class Persona {
    
    private String NOMBRE;
    private int FECHADENACIMIENTO;
    private String TELEFONO;
    private String EMAIl;

    public Persona(String NOMBRE, int FECHADENACIMIENTO, String TELEFONO, String EMAIl) {
        this.NOMBRE = NOMBRE;
        this.FECHADENACIMIENTO = FECHADENACIMIENTO;
        this.TELEFONO = TELEFONO;
        this.EMAIl = EMAIl;
    }

    /**
     * @return the NOMBRE
     */
    public String getNOMBRE() {
        return NOMBRE;
    }

    

    /**
     * @return the FECHADENACIMIENTO
     */
    public int getFECHADENACIMIENTO() {
        return FECHADENACIMIENTO;
    }


    /**
     * @return the TELEFONO
     */
    public String getTELEFONO() {
        return TELEFONO;
    }

    /**
     * @param TELEFONO the TELEFONO to set
     */
    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    /**
     * @return the EMAIl
     */
    public String getEMAIl() {
        return EMAIl;
    }

    /**
     * @param EMAIl the EMAIl to set
     */
    public void setEMAIl(String EMAIl) {
        this.EMAIl = EMAIl;
    }

    @Override
    public String toString() {
        return "Persona{" + "NOMBRE=" + NOMBRE + ", FECHADENACIMIENTO=" + FECHADENACIMIENTO + ", TELEFONO=" + TELEFONO + ", EMAIl=" + EMAIl + '}';
    }
    
    
}
