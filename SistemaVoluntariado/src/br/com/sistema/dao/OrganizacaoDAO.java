/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Organizacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isabel
 */
public class OrganizacaoDAO {
    
    
    public void salvar (Organizacao organizacao) throws SQLException{
        
        String sql = "INSERT INTO tb_organizacao (nome, cnpj, email, telefone, cidade, estado, endereco)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        try(Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            
            stmt.setString(1, organizacao.getNome());
            stmt.setString(2, organizacao.getCnpj());
            stmt.setString(3, organizacao.getEmail());
            stmt.setString(4, organizacao.getTelefone());
            stmt.setString(5, organizacao.getCidade());
            stmt.setString(6, organizacao.getEstado());
            stmt.setString(7, organizacao.getEndereco());
            
            stmt.executeUpdate();       //salva no banco
        }
        
    }
    
    public List<Organizacao> listar() throws SQLException {

        String sql = "SELECT * FROM tb_organizacao ORDER BY id";

        List<Organizacao> organizacoes = new ArrayList<Organizacao>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {          //RESULTSET REPRESENTA O RESULTADO DA CONSULTA NO BANCO

            while (rs.next()) {

                Organizacao organizacao = new Organizacao();

                organizacao.setId(rs.getInt("id"));
                organizacao.setNome(rs.getString("nome"));
                organizacao.setCnpj(rs.getString("cnpj"));
                organizacao.setEmail(rs.getString("email"));
                organizacao.setTelefone(rs.getString("telefone"));
                organizacao.setCidade(rs.getString("cidade"));
                organizacao.setEstado(rs.getString("estado"));
                organizacao.setEndereco(rs.getString("endereco"));

                organizacoes.add(organizacao);
            }
        }

        return organizacoes;
    }

    // EDITAR
    public void editar(Organizacao organizacao) throws SQLException {

        String sql = "UPDATE tb_organizacao SET "
                + "nome = ?, cnpj = ?, email = ?, telefone = ?, "
                + "cidade = ?, estado = ?, endereco = ? "
                + "WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, organizacao.getNome());
            stmt.setString(2, organizacao.getCnpj());
            stmt.setString(3, organizacao.getEmail());
            stmt.setString(4, organizacao.getTelefone());
            stmt.setString(5, organizacao.getCidade());
            stmt.setString(6, organizacao.getEstado());
            stmt.setString(7, organizacao.getEndereco());
            stmt.setInt(8, organizacao.getId());

            stmt.executeUpdate();
        }
    }

    // EXCLUIR
    public void excluir(int id) throws SQLException {

        String sql = "DELETE FROM tb_organizacao WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
        }
    }
    
}
