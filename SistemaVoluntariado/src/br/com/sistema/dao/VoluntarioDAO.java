/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Voluntario;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Isabel
 */
public class VoluntarioDAO {
    
    //salvar no banco
    public void salvar(Voluntario voluntario) throws SQLException{
        
        String sql = "INSERT INTO tb_voluntarios (nome, email, telefone, "
                + "cidade, estado, endereco) VALUES(?, ?, ?, ?, ?, ?)";
        
        try(Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){       //prepara o sql feito pra conectar com o banco
            
            stmt.setString(1, voluntario.getNome());
            stmt.setString(2, voluntario.getEmail());
            stmt.setString(3, voluntario.getTelefone());
            stmt.setString(4, voluntario.getCidade());
            stmt.setString(5, voluntario.getEstado());
            stmt.setString(6, voluntario.getEndereco());

            stmt.executeUpdate();       //executa o salvamento
               
        } 
        
    }
    
    public List<Voluntario> listar() throws SQLException {

        String sql = "SELECT * FROM tb_voluntarios ORDER BY id";

        List<Voluntario> voluntarios = new ArrayList<Voluntario>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Voluntario voluntario = new Voluntario();

                voluntario.setId(rs.getInt("id"));
                voluntario.setNome(rs.getString("nome"));
                voluntario.setEmail(rs.getString("email"));
                voluntario.setTelefone(rs.getString("telefone"));
                voluntario.setCidade(rs.getString("cidade"));
                voluntario.setEstado(rs.getString("estado"));
                voluntario.setEndereco(rs.getString("endereco"));

                voluntarios.add(voluntario);
            }
        }

        return voluntarios;
    }
    
    public void editar(Voluntario voluntario) throws SQLException{
        
        String sql = "UPDATE tb_voluntarios SET "
            + "nome = ?, "
            + "email = ?, "
            + "telefone = ?, "
            + "cidade = ?, "
            + "estado = ?, "
            + "endereco = ? "
            + "WHERE id = ?";
        
        try (Connection conexao = ConnectionFactory.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {

        stmt.setString(1, voluntario.getNome());
        stmt.setString(2, voluntario.getEmail());
        stmt.setString(3, voluntario.getTelefone());
        stmt.setString(4, voluntario.getCidade());
        stmt.setString(5, voluntario.getEstado());
        stmt.setString(6, voluntario.getEndereco());
        stmt.setInt(7, voluntario.getId());

        stmt.executeUpdate();
    }
        
        
    }
    
    public void excluir(int id) throws SQLException {

    String sql = "DELETE FROM tb_voluntarios WHERE id = ?";

    try (Connection conexao = ConnectionFactory.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {

        stmt.setInt(1, id);

        stmt.executeUpdate();
    }
}
    
    
}
