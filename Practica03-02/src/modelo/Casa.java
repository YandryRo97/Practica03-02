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
public class Casa {
    
    private int id;
    private String Lugar;
    private Propietario propietario;

    public Casa(int id, String Lugar, Propietario propietario) {
        this.id = id;
        this.Lugar = Lugar;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Casa{" + "id=" + id + ", Lugar=" + Lugar + ", propietario=" + propietario + '}';
    }
    
    
}
