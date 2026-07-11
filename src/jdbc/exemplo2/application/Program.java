package jdbc.exemplo2.application;

import jdbc.exemplo2.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        ResultSet resultSet = null;

        try {
            //Inicia a conexão com o banco de dados
            connection = DB.getConnection();
            //Cria um objeto Statement para executar consultas SQL
            st = connection.createStatement();
            //Executa uma consulta SQL para selecionar todos os registros da tabela department
            resultSet = st.executeQuery("SELECT * FROM department");

            //Itera sobre os resultados da consulta e imprime os valores das colunas Id e Name
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(resultSet);
            DB.closeConnection();
        }


    }
}
