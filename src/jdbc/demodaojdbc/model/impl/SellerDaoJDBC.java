package jdbc.demodaojdbc.model.impl;

import jdbc.demodaojdbc.model.dao.SellerDao;
import jdbc.demodaojdbc.model.entities.Seller;

import java.util.List;

//Classe que implementa a interface SellerDao, fornecendo a implementação dos métodos de acesso a dados para a entidade Seller.
// A classe SellerDaoJDBC utiliza uma conexão com o banco de dados para realizar operações de inserção, atualização, exclusão e consulta de objetos Seller.
// Ela encapsula a lógica de persistência dos dados, permitindo que outras partes do sistema interajam com os objetos Seller sem se preocupar com os detalhes de acesso ao banco de dados.
public class SellerDaoJDBC implements SellerDao {
    @Override
    public void insert(Seller obj) {
    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Seller id) {

    }

    @Override
    public Seller findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
