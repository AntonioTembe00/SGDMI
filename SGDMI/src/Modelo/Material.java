
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
@Entity(name="material")
public class Material {
    private String nome;
    private String codigo;
    @Id
    private int quantidade;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Material() {
    }

    public Material(String nome, String codigo, int quantidade, Date data) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Material{" + "nome=" + nome + ", codigo=" + codigo + ", quantidade=" + quantidade + ", data=" + data + '}';
    }
    
    
}
