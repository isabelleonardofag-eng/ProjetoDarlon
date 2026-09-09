/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Isabel
 */
public class UsuarioDAO {
    
    public Usuario login(String email, String senha){       //retorna um usuario caso seja encontrado no bd
        String sql = "SELECT id, email, senha " 
                + "FROM tb_usuarios WHERE email = ? AND senha = ?";
        
        try(Connection conn = ConnectionFactory.getConnection();        //chama a conexao
                PreparedStatement stmt = conn.prepareStatement(sql)){   //prepara o argumento pra ser chamado no sql
            stmt.setString (1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                Usuario usuario = new Usuario();            //monta o novo usuario que sera retornado
                usuario.setId(rs.getInt("id"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                return usuario;
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    
    
}
