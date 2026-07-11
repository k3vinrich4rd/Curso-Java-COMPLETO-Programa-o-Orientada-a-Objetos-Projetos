package jdbc.demodaojdbc.application;

import jdbc.demodaojdbc.model.dao.DaoFactory;
import jdbc.demodaojdbc.model.dao.SellerDao;
import jdbc.demodaojdbc.model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        // Uma forma de fazer injeção de dependência é utilizando o padrão de projeto Factory,
        // que é o caso da classe DaoFactory. Ela fornece métodos estáticos para criar
        // instâncias de objetos DAO específicos, como SellerDao, sem expor
        // a implementação concreta (SellerDaoJDBC) para o restante do sistema.
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);


    }
}
