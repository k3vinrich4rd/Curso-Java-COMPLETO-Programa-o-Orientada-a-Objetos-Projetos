package jdbc.exemplo6.application;

import jdbc.exemplo4.DB;
import jdbc.exemplo6.exceptions.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        //Inicia a conexão com o banco de dados
        Connection connection = null;
        Statement st = null;
        try {
            connection = DB.getConnection();

            //Todas as instruções terão que ser executadas com sucesso, caso contrário, nenhuma delas será executada
            connection.setAutoCommit(false);

            st = connection.createStatement();

            //Todo vendedor que tenha o DepartmentId = 1, terá seu salário base aumentado em 2090.00
            int rowsAffected1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            /*
            int x = 1;
            if (x < 2) {
                throw new SQLException("Fake error");
            }
             */

            //Todo vendedor que tenha o DepartmentId = 2, terá seu salário base aumentado em 3090.00
            int rowsAffected2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            //Confirma que a transação foi executada com sucesso, caso contrário, nenhuma das instruções será executada
            connection.commit();

            System.out.println(" rowsAffected1: " + rowsAffected1);
            System.out.println(" rowsAffected2: " + rowsAffected2);
        } catch (SQLException e) {
            try {
                //Caso ocorra algum erro, desfaz todas as alterações feitas na transação
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
            }

        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
