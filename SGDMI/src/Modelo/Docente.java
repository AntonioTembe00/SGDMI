/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tem
 */
@Entity(name = "docente")
public class Docente implements Serializable {

    private String nome;
    @Id
    private int codigo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idsaladocentes")
    private SalasDocentes sala;
    // private S sala;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Docente() {
    }

    public Docente(String nome, int codigo, SalasDocentes sala, Date data) {
        this.nome = nome;
        this.codigo = codigo;
        this.sala = sala;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public SalasDocentes getSala() {
        return sala;
    }

    public void setSala(SalasDocentes sala) {
        this.sala = sala;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Docente{" + "nome=" + nome + ", codigo=" + codigo + ", sala=" + sala + ", data=" + data + '}';
    }

 
}
