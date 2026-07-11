package jdbc1.application;

import jdbc1.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection connection = DB.getConnection();
        DB.closeConnection();


    }
}
