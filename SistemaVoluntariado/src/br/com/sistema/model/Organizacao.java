/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.model;

/**
 *
 * @author Isabel
 */
public class Organizacao {
    private int id;
    private String nome;

    

    
    private String cnpj;
    private String email;
    private String telefone;
    private String cidade;
    private String estado;
    private String endereco;
    
    public Organizacao(int id, String nome, String cnpj, String email, String telefone, String cidade, String estado, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.endereco = endereco;
    }
    
    public Organizacao(){
        
    }

    
    //getters
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public String getEndereco() {
        return endereco;
    }

    
    //setters
    public void setId(int id) {
        this.id = id;
    }   

    public void setNome(String nome) {
        this.nome = nome;
    }    
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }   

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    } 

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

    
    @Override
public String toString() {
    return nome;}
    
    
}
