package com.eleodoro.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/bibliotecaEscolar";
    private static final String user = "root";
    private static final String password = "";

    private static Connection conn;

    public static Connection getConexao() {

        try {
            if(conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println(x:"Conectado com sucesso")
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(x:"Erro de conexao")
            return null;
        }
    }

    public static Object getConexao() {
        return null;
    }
}