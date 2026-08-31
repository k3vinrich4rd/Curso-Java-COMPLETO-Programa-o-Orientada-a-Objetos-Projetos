package jdbc.demodaojdbc.model.dao;

import jdbc.demodaojdbc.model.entities.Department;
import jdbc.demodaojdbc.model.entities.Seller;

import java.util.List;

// Contrato de acesso a dados da entidade Seller.
public interface SellerDao {

    // Insere um novo vendedor.
    void insert(Seller obj);

    // Atualiza os dados de um vendedor existente.
    void update(Seller obj);

    // Remove um vendedor pelo id.
    void deleteById(Integer id);

    // Busca um vendedor pelo id.
    Seller findById(Integer id);

    // Lista todos os vendedores.
    List<Seller> findAll();

    // Lista os vendedores de um departamento.
    List<Seller> findByDepartment(Department department);

}
