package dao;

import conexao.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ItemCardapioDAO {

    public void listarTodos() {

        String sql = "SELECT nome, preco FROM ItemCardapio";

        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                    rs.getString("nome") +
                    " - R$ " +
                    rs.getDouble("preco")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void listarPorCategoria(int idCategoria) {

        String sql = 
            "SELECT i.nome, i.preco, c.nome AS categoria " +
            "FROM ItemCardapio i " +
            "JOIN Categoria c ON i.id_categoria = c.id_categoria " +
            "WHERE c.id_categoria = ?";
           

        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idCategoria);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                    "[" + rs.getString("categoria") + "] " +
                    rs.getString("nome") +
                    " - R$ " +
                    rs.getDouble("preco")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

