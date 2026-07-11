package jdbc2;

import jdbc2.exceptions.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection connection = null;

    //Inicia a conexão com o banco de dados, caso ainda não tenha sido iniciada
    //Retorna a conexão com o banco de dados
    public static Connection getConnection() {
        if (connection == null) {
            try {
                //Carrega as propriedades do arquivo db.properties
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                //Estabelece a conexão com o banco de dados usando as propriedades carregadas
                connection = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        //Retorna a conexão com o banco de dados
        return connection;
    }

    private static Properties loadProperties() {
        //Salva as propriedades do banco de dados em um arquivo db.properties
        //Faz a leitura do arquivo db.properties e retorna um objeto Properties com as propriedades carregadas
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            //Carrega as propriedades do arquivo db.properties para o objeto Properties
            props.load(fs);
            return props;


        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    //Fecha a conexão com o banco de dados, caso esteja aberta
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    //Fecha o Statement, caso esteja aberto
    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();

            } catch (SQLException sqlException) {
                throw new DbException(sqlException.getMessage());
            }
        }
    }

    //Fecha o ResultSet, caso esteja aberto
    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();

            } catch (SQLException sqlException) {
                throw new DbException(sqlException.getMessage());
            }
        }
    }
}
