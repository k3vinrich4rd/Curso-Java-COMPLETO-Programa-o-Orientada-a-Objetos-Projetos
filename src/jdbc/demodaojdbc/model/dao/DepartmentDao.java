package jdbc.demodaojdbc.model.dao;

import jdbc.demodaojdbc.model.entities.Department;

import java.util.List;

// Contrato de acesso a dados da entidade Department.
public interface DepartmentDao {

    // Insere um novo departamento.
    void insert(Department obj);

    // Atualiza os dados de um departamento existente.
    void update(Department obj);

    // Remove um departamento pelo id.
    void deleteById(Integer id);

    // Busca um departamento pelo id.
    Department findById(Integer id);

    // Lista todos os departamentos.
    List<Department> findAll();

}
