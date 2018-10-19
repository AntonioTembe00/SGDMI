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
@Entity(name = "salasdocentes")
public class SalasDocentes {

    @Id
    private String numerosala;
    private String descricao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public SalasDocentes() {
    }

    public SalasDocentes(String numerosala, String descricao, Date data) {
        this.numerosala = numerosala;
        this.descricao = descricao;
        this.data = data;
    }

    public String getNumerosala() {
        return numerosala;
    }

    public void setNumerosala(String numerosala) {
        this.numerosala = numerosala;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

   
    @Override
    public String toString() {
        return numerosala;
    }

    
}
