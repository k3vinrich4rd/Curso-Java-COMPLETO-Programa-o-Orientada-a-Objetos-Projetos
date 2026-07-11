package jdbc4.application;

import jdbc4.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection connection;
        PreparedStatement st = null;
        try {
            connection = DB.getConnection();
            //Cria um objeto PreparedStatement para executar uma consulta SQL de atualização
            //Define a consulta SQL para atualizar o salário base dos vendedores de um determinado departamento
            st = connection.prepareStatement(
                    "UPDATE seller "
                            + "SET BaseSalary = BaseSalary + ? "
                            + "WHERE "
                            + "(DepartmentId = ?)");
            //Define os valores dos parâmetros da consulta SQL
            //O primeiro parâmetro é o valor a ser adicionado ao salário base
            //O segundo parâmetro é o id do departamento cujos vendedores terão o salário base atualizado
            //Executa a consulta SQL para atualizar o salário base dos vendedores do departamento especificado
            st.setDouble(1, 200.00);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
