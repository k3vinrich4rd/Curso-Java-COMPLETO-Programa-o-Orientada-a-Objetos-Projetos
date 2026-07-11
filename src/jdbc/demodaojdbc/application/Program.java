package jdbc.demodaojdbc.application;

import jdbc.demodaojdbc.model.dao.DaoFactory;
import jdbc.demodaojdbc.model.dao.SellerDao;
import jdbc.demodaojdbc.model.entities.Department;
import jdbc.demodaojdbc.model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        // Uma forma de fazer injeção de dependência é utilizando o padrão de projeto Factory,
        // que é o caso da classe DaoFactory. Ela fornece métodos estáticos para criar
        // instâncias de objetos DAO específicos, como SellerDao, sem expor
        // a implementação concreta (SellerDaoJDBC) para o restante do sistema.
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findById ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller sellerObj : list) {
            System.out.println(sellerObj);
        }

        System.out.println("\n=== TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller sellerObj : list) {
            System.out.println(sellerObj);
        }

    }
}
