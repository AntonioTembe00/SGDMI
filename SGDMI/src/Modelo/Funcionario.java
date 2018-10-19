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
@Entity(name = "funcionario")
public class Funcionario {

    private String nome;
    @Id
    private int codigo;
    private String usuario;
    private String senha;
    private String confirmarsenha;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Funcionario() {
    }

    public Funcionario(String nome, int codigo, String usuario, String senha, String confirmarsenha, Date data) {
        this.nome = nome;
        this.codigo = codigo;
        this.usuario = usuario;
        this.senha = senha;
        this.confirmarsenha = confirmarsenha;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarsenha() {
        return confirmarsenha;
    }

    public void setConfirmarsenha(String confirmarsenha) {
        this.confirmarsenha = confirmarsenha;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return  nome;
    }

}
