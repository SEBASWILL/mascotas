/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author SG702-15
 */
public abstract class Mascota implements Animal, SerVivo {

    protected String RAZA;
    protected String GENERO;
    protected String NOMBRE;
    protected int FECHADENACIMIENTO;
    protected final String ESPECIE;

    public Mascota(String SPECIE, String RAZA, String GENERO, String NOMBRE, int FECHADENACIMIENTO) {
        this.ESPECIE = SPECIE;
        this.RAZA = RAZA;
        this.GENERO = GENERO;
        this.NOMBRE = NOMBRE;
        this.FECHADENACIMIENTO = FECHADENACIMIENTO;

    }

    /**
     * @return the ESPECIE
     */
    public String getESPECIE() {
        return ESPECIE;
    }

    /**
     * @return the RAZA
     */
    public String getRAZA() {
        return RAZA;
    }

    /**
     * @return the GENERO
     */
    public String getGENERO() {
        return GENERO;
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

    @Override
    public String toString() {
        return "Mascota{" + "ESPECIE=" + ESPECIE + ", RAZA=" + RAZA + ", GENERO=" + GENERO + ", NOMBRE=" + NOMBRE + ", FECHADENACIMIENTO=" + FECHADENACIMIENTO + '}';
    }

}
