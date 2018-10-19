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
@Entity(name="estudante")
public class Estudante {

    private String nome;
    @Id
    private int codigo;
    private String sala;
    private String curso;
    private String regime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Estudante() {
    }

    public Estudante(String nome, int codigo, String sala, String curso, String regime, Date data) {
        this.nome = nome;
        this.codigo = codigo;
        this.sala = sala;
        this.curso = curso;
        this.regime = regime;
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

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    

}
