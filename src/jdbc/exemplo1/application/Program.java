package jdbc.exemplo1.application;

import jdbc.exemplo1.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection connection = DB.getConnection();
        DB.closeConnection();


    }
}
