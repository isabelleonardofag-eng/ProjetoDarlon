/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.dao;
import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Vaga;
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
public class VagaDAO {
    
    public void salvar(Vaga vaga) throws SQLException {

        String sql = "INSERT INTO tb_vagas "
                + "(titulo, descricao, cargahoras, numerovagas, "
                + "datavaga, status, id_organizacao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, vaga.getTitulo());
            stmt.setString(2, vaga.getDescricao());
            stmt.setInt(3, vaga.getCargahoras());
            stmt.setInt(4, vaga.getNumerovagas());
            stmt.setDate(5, new java.sql.Date(vaga.getDatavaga().getTime()));
            stmt.setString(6, vaga.getStatus());
            stmt.setInt(7, vaga.getIdOrganizacao());

            stmt.executeUpdate();
        }
    }

    public List<Vaga> listar() throws SQLException {

        String sql = "SELECT * FROM tb_vagas ORDER BY id";

        List<Vaga> vagas = new ArrayList<Vaga>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Vaga vaga = new Vaga();
//busca vagas cadastradas no banco e colocanuma arraylist pra exibir
                vaga.setId(rs.getInt("id"));
                vaga.setTitulo(rs.getString("titulo"));
                vaga.setDescricao(rs.getString("descricao"));
                vaga.setCargahoras(rs.getInt("cargahoras"));
                vaga.setNumerovagas(rs.getInt("numerovagas"));
                vaga.setDatavaga(rs.getDate("datavaga"));
                vaga.setStatus(rs.getString("status"));
                vaga.setIdOrganizacao(rs.getInt("id_organizacao"));

                vagas.add(vaga);
            }
        }

        return vagas;
    }

    public void editar(Vaga vaga) throws SQLException {

        String sql = "UPDATE tb_vagas SET "
                + "titulo = ?, "
                + "descricao = ?, "
                + "cargahoras = ?, "
                + "numerovagas = ?, "
                + "datavaga = ?, "
                + "status = ?, "
                + "id_organizacao = ? "
                + "WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, vaga.getTitulo());
            stmt.setString(2, vaga.getDescricao());
            stmt.setInt(3, vaga.getCargahoras());
            stmt.setInt(4, vaga.getNumerovagas());
            stmt.setDate(5, new java.sql.Date(vaga.getDatavaga().getTime()));
            stmt.setString(6, vaga.getStatus());
            stmt.setInt(7, vaga.getIdOrganizacao());
            stmt.setInt(8, vaga.getId());

            stmt.executeUpdate();
        }
    }

    public void excluir(int id) throws SQLException {

        String sql = "DELETE FROM tb_vagas WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    
}
