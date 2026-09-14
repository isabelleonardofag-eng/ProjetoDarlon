/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.model;

import java.util.Date;

/**
 *
 * @author Isabel
 */
public class Vaga {
    
    private int id;
    private String titulo;
    private String descricao;
    private int cargahoras;
    private int numerovagas;
    private Date datavaga;
    private String status;
    private int idOrganizacao;

    public Vaga() {
    }

    public Vaga(int id, String titulo, String descricao, int cargahoras,
            int numerovagas, Date datavaga, String status, int idOrganizacao) {

        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargahoras = cargahoras;
        this.numerovagas = numerovagas;
        this.datavaga = datavaga;
        this.status = status;
        this.idOrganizacao = idOrganizacao;
    }

    //getters
    public int getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public int getCargahoras() {
        return cargahoras;
    }
    
    public int getNumerovagas() {
        return numerovagas;
    }
    
    public Date getDatavaga() {
        return datavaga;
    }
    
    public String getStatus() {
        return status;
    }
    
    public int getIdOrganizacao() {
        return idOrganizacao;
    }

    
    //setters
    public void setId(int id) {
        this.id = id;
    } 

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }   

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 

    public void setCargahoras(int cargahoras) {
        this.cargahoras = cargahoras;
    }
    
    public void setNumerovagas(int numerovagas) {
        this.numerovagas = numerovagas;
    }

    public void setDatavaga(Date datavaga) {
        this.datavaga = datavaga;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIdOrganizacao(int idOrganizacao) {
        this.idOrganizacao = idOrganizacao;
    }
    
}
