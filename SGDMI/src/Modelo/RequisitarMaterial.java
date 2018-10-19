/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
@Entity(name = "requisitarmaterial")
public class RequisitarMaterial {

    @Id
    private String codigo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idestudante")
    private Estudante nomeestudante;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idfuncionario")
    private Funcionario nomefuncionario;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idrequisitarmaterial")
    private Material materialrequisitado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public RequisitarMaterial() {
    }

    public RequisitarMaterial(String codigo, Estudante nomeestudante, Funcionario nomefuncionario, Material materialrequisitado, Date data) {
        this.codigo = codigo;
        this.nomeestudante = nomeestudante;
        this.nomefuncionario = nomefuncionario;
        this.materialrequisitado = materialrequisitado;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estudante getNomeestudante() {
        return nomeestudante;
    }

    public void setNomeestudante(Estudante nomeestudante) {
        this.nomeestudante = nomeestudante;
    }

    public Funcionario getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(Funcionario nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public Material getMaterialrequisitado() {
        return materialrequisitado;
    }

    public void setMaterialrequisitado(Material materialrequisitado) {
        this.materialrequisitado = materialrequisitado;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "requisitarmaterial{" + "codigo=" + codigo + ", nomeestudante=" + nomeestudante + ", nomefuncionario=" + nomefuncionario + ", materialrequisitado=" + materialrequisitado + ", data=" + data + '}';
    }

}
