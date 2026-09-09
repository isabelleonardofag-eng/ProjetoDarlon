/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Isabel
 */
public class Voluntario {
    
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String cidade;
    private String estado;
    private String endereco;
    
    public Voluntario(){
        
    }
    
    public Voluntario(int id, String nome, String email, String telefone, 
            String cidade, String estado, String endereco){
        this.id =id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.endereco = endereco;
    }

    
    //getters
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
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
    
    
}
