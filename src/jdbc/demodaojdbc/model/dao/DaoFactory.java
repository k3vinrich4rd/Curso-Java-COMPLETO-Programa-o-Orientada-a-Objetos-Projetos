package jdbc.demodaojdbc.model.dao;

import jdbc.demodaojdbc.model.impl.DepartmentDaoJDBC;
import jdbc.demodaojdbc.model.impl.SellerDaoJDBC;
import jdbc.exemplo4.DB;

// Centraliza a criação dos DAOs e esconde a implementação JDBC do restante da aplicação.
public class DaoFactory {

    // Cria o DAO responsável pelas operações da entidade Seller.
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    // Cria o DAO responsável pelas operações da entidade Department.
    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
