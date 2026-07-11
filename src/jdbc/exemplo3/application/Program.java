package jdbc.exemplo3.application;

import jdbc.exemplo3.exemplo2.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //Inicia a conexão com o banco de dados
            connection = DB.getConnection();
            //Cria um objeto PreparedStatement para executar consultas SQL
            //Executa uma consulta SQL para inserir um novo registro na tabela seller
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO seller " +
                            "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                            + "VALUES"
                            + "(?, ?, ?, ?, ?)",
                    //Retorna o id gerado pelo banco de dados
                    Statement.RETURN_GENERATED_KEYS);
            //Define os valores dos parâmetros da consulta SQL
            preparedStatement.setString(1, "Carl Purple");
            preparedStatement.setString(2, "carl@gmail.com");
            preparedStatement.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            preparedStatement.setDouble(4, 3000.00);
            preparedStatement.setInt(5, 4);

            //Executa a consulta SQL para inserir o novo registro na tabela seller
            int rowsAffected = preparedStatement.executeUpdate();
            //Verifica se a inserção foi bem-sucedida
            if (rowsAffected > 0) {
                //Obtém o id gerado pelo banco de dados para o novo registro inserido
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                //Verifica se o ResultSet contém algum registro
                while (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    //Imprime o id gerado pelo banco de dados para o novo registro inserido
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }

    }
}
