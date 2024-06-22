package com.eleodoro.biblioteca.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.behaviortest.api.engine.db.Conexao;
import com.eleodoro.conexao.Conexao;
import com.eleodoro.modelo.Biblioteca;

public class BibliotecaDAO {
    
    public void cadastrarBiblioteca(BibliotecaPOJO bibliotecaPOJO) {

        Conexao conexao = new Conexao();

        String sql = "insert into biblioteca (nome, email, telefone) values (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().PreparedStatement(sql);

            ps.setString(parameterIndex:1, bibliotecaPOJO.getNome());
            ps.setString(parameterIndex:2, bibliotecaPOJO.getEmail());
            ps.setInt(parameterIndex:3, bibliotecaPOJO.getTelefone());

            ps.execute();
            ps.close();

            System.out.println(x:"Dados gravados com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(x:"Problema no método cadastrar biblioteca na BibliotecaDAO");
        }
    }

    public void consultarBiblioteca(BibliotecaPOJO bibliotecaPOJO, int columnIndex) {

        Conexao conexao = new Conexao();

        String sql = "select * from biblioteca where Id = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps = setInt(parameterIndex:1, bibliotecaPOJO.getId());


            rs = ps.executeQuery();

            while (rs.next()) {
                bibliotecaPOJO.setId(rs.getInt(columnIndex:1));
                bibliotecaPOJO.setNome(rs.getString(columnIndex:2));
                bibliotecaPOJO.setEmail(rs.getString(columnIndex:3));
                bibliotecaPOJO.setTelefone(rs.getInt(columnIndex:4));
            }

            rs.close();
            ps.close();

            System.out.println(x:"Consulta com sucesso");
        
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(x:"Problema no metodo consultar");
        }
    }

    public void incluirBiblioteca(BibliotecaPOJO bibliotecaPOJO) {
        Conexao conexao = new Conexao();

        String sql = "update bibliotexa set nome = ?, email = ?, telefone = ? where id = ?";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setString(parameterIndex:1, bibliotecaPOJO.getNome());
            ps.setString(parameterIndex:2, bibliotecaPOJO.getEmail());
            ps.setInt(parameterIndex:3, bibliotecaPOJO.getIdade());
            ps.setInt(parameterIndex:4, bibliotecaPOJO.getId());

            ps.execute();
            ps.close();

            System.out.println(x:"Inclusão com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(x:"Problema no metodo ao atualizar");
        }

    }


    public void excluirBiblioteca(BibliotecaPOJO bibliotecaPOJO) {
        Conexao conexao = new Conexao();

        String sql = "delete from biblioteca where id = ?";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(parameterIndex:1, bibliotecaPOJO.getId());

            ps.execute();
            ps.close();

            System.out.println(x:"Exclusão com sucesso");
        
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(x:"Problema no método de exclusão");
        }
    }
}