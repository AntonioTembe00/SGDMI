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
@Entity(name="computador")
public class Computador {
    private String descricao;
    @Id
    private String codigo;
    private String componentes;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Computador() {
    }

    public Computador(String descricao, String codigo, String componentes, Date data) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.componentes = componentes;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Computador{" + "descricao=" + descricao + ", codigo=" + codigo + ", componentes=" + componentes + ", data=" + data + '}';
    }
    
    
    
    
    
}
