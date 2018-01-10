/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PC-MATIC
 */
public class Propietario {
 
    private int id;
    private String nombreYAp;
    private String edad;
    private String cedula;

    public Propietario(int id, String nombreYAp, String edad, String cedula) {
        this.id = id;
        this.nombreYAp = nombreYAp;
        this.edad = edad;
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreYAp() {
        return nombreYAp;
    }

    public void setNombreYAp(String nombreYAp) {
        this.nombreYAp = nombreYAp;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + ", nombreYAp=" + nombreYAp + ", edad=" + edad + ", cedula=" + cedula + '}';
    }
    
}
