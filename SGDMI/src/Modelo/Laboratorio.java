/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tem
 */
@Entity(name="laboratorio")
public class Laboratorio {
    @Id
    private String numerolaboratorio;
    private String componentesinformaticos;
    private String componentesnaoinformaticos;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Laboratorio() {
    }

    public Laboratorio(String numerolaboratorio, String componentesinformaticos, String componentesnaoinformaticos, Date data) {
        this.numerolaboratorio = numerolaboratorio;
        this.componentesinformaticos = componentesinformaticos;
        this.componentesnaoinformaticos = componentesnaoinformaticos;
        this.data = data;
    }

    public String getNumerolaboratorio() {
        return numerolaboratorio;
    }

    public void setNumerolaboratorio(String numerolaboratorio) {
        this.numerolaboratorio = numerolaboratorio;
    }

    public String getComponentesinformaticos() {
        return componentesinformaticos;
    }

    public void setComponentesinformaticos(String componentesinformaticos) {
        this.componentesinformaticos = componentesinformaticos;
    }

    public String getComponentesnaoinformaticos() {
        return componentesnaoinformaticos;
    }

    public void setComponentesnaoinformaticos(String componentesnaoinformaticos) {
        this.componentesnaoinformaticos = componentesnaoinformaticos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "laboratorio{" + "numerolaboratorio=" + numerolaboratorio + ", componentesinformaticos=" + componentesinformaticos + ", componentesnaoinformaticos=" + componentesnaoinformaticos + ", data=" + data + '}';
    }
    
    
    
    
    
}
