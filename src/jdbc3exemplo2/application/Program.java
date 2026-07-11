package jdbc3exemplo2.application;

import jdbc3exemplo2.DB;

import java.sql.*;
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
            // Define a consulta SQL para inserir um novo registro na tabela seller
            preparedStatement = connection.prepareStatement("INSERT INTO department (Name) values" +
                            "('D1'), ('D2')",
                    //Retorna o id gerado pelo banco de dados
                    Statement.RETURN_GENERATED_KEYS);

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
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }

    }
}
