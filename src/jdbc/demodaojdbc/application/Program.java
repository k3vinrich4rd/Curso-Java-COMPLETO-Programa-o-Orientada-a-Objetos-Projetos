package jdbc.demodaojdbc.application;

import jdbc.demodaojdbc.model.dao.DaoFactory;
import jdbc.demodaojdbc.model.dao.SellerDao;
import jdbc.demodaojdbc.model.entities.Department;
import jdbc.demodaojdbc.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);

        // Uma forma de fazer injeção de dependência é utilizando o padrão de projeto Factory,
        // que é o caso da classe DaoFactory. Ela fornece métodos estáticos para criar
        // instâncias de objetos DAO específicos, como SellerDao, sem expor
        // a implementação concreta (SellerDaoJDBC) para o restante do sistema.
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
        System.out.println(obj);

    }
}
