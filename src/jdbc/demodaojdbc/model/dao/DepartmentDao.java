package jdbc.demodaojdbc.model.dao;

import jdbc.demodaojdbc.model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    //Operação responsável por inserir um novo departamento no banco de dados.
    void insert(Department obj);

    //Operação responsável por atualizar as informações de um departamento existente no banco de dados.
    void update(Department obj);

    //Operação responsável por excluir um departamento do banco de dados com base no seu ID.
    void deleteById(Integer id);

    //Operação responsável por buscar um departamento no banco de dados com base no seu ID.
    Department findById(Integer id);

    //Operação responsável por buscar todos os departamentos no banco de dados.
    List<Department> findAll();


}
