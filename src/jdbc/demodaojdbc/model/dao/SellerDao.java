package jdbc.demodaojdbc.model.dao;

import jdbc.demodaojdbc.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    //Operação responsável por inserir um novo seller no banco de dados.
    void insert(Seller obj);

    //Operação responsável por atualizar as informações de um seller existente no banco de dados.
    void update(Seller obj);

    //Operação responsável por excluir um seller do banco de dados com base no seu ID.
    void deleteById(Seller id);

    //Operação responsável por buscar um seller no banco de dados com base no seu ID.
    Seller findById(Integer id);

    //Operação responsável por buscar todos os sellers no banco de dados.
    List<Seller> findAll();


}
