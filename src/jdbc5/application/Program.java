package jdbc5.application;

import jdbc4.DB;
import jdbc5.exceptions.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        //Inicia a conexão com o banco de dados
        Connection connection;
        PreparedStatement st = null;
        try {
            //Obtém a conexão com o banco de dados
            connection = DB.getConnection();
            //Define a instrução SQL para DELETAR um Id referente a um departamento específico'
            st = connection.prepareStatement(
                    //"DELETE FROM department WHERE Id = ?");
                    //Instrução SQL PARA DELETAR um Id referente a um departamento específico, mas com uma condição de que o departamento não tenha nenhum vendedor associado a ele
                    "DELETE FROM department "
                            + "WHERE "
                            + "(Id = ?)");

            //Define o valor do parâmetro da instrução SQL
            st.setInt(1, 2);
            int rowsAffected = st.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
           throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
