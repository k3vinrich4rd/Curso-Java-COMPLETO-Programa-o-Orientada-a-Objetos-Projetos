package jdbc.demodaojdbc.model.impl;

import jdbc.demodaojdbc.model.dao.SellerDao;
import jdbc.demodaojdbc.model.entities.Department;
import jdbc.demodaojdbc.model.entities.Seller;
import jdbc.exemplo4.exceptions.DbException;
import jdbc.exemplo6.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Classe que implementa a interface SellerDao, fornecendo a implementação dos métodos de acesso a dados para a entidade Seller.
// A classe SellerDaoJDBC utiliza uma conexão com o banco de dados para realizar operações de inserção, atualização, exclusão e consulta de objetos Seller.
// Ela encapsula a lógica de persistência dos dados, permitindo que outras partes do sistema interajam com os objetos Seller sem se preocupar com os detalhes de acesso ao banco de dados.
public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

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
        PreparedStatement st = null;
        ResultSet rs = null;


        try {
            //Preparando a consulta SQL para buscar um seller pelo seu ID, incluindo informações do departamento associado.
            // A consulta utiliza um INNER JOIN para combinar os dados da tabela seller com a tabela department,
            // permitindo obter o nome do departamento associado ao seller.
            // O parâmetro "?" na consulta será substituído pelo valor do ID do seller que está sendo buscado.
            // O resultado da consulta será armazenado no ResultSet rs, que será utilizado para criar um objeto Seller com os dados obtidos do banco de dados.
            st = conn.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE seller.Id = ?");

            // Substituindo o parâmetro "?" na consulta SQL pelo valor do ID do seller que está sendo buscado.
            st.setInt(1, id);
            // Executando a consulta SQL e armazenando o resultado no ResultSet rs.
            // O ResultSet rs contém os dados do seller e do departamento associado, que serão utilizados para criar um objeto Seller.
            rs = st.executeQuery();
            // rs.next() verifica se há um registro no ResultSet rs. Se houver, significa que o seller com o ID especificado foi encontrado no banco de dados.
            if (rs.next()) {


                // Criando um objeto Department e preenchendo seus atributos com os dados obtidos do ResultSet rs.
                // O ID e o nome do departamento são obtidos das colunas "DepartmentId" e "DepName" do ResultSet rs, respectivamente.
                // Em seguida, um objeto Seller é criado e seus atributos são preenchidos com os dados obtidos do ResultSet rs, incluindo o objeto Department criado anteriormente.
                // O objeto Seller é então retornado como resultado do método findBy
                // O método findById retorna o objeto Seller encontrado no banco de dados com base no ID fornecido. Se nenhum seller for encontrado, o método retorna null.
                Department dep = instantiateDepartment(rs);
                Seller obj = instantiateSeller(rs, dep);
                return obj;
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            // Fechando os recursos utilizados na consulta SQL, como o ResultSet rs e o PreparedStatement st.
            // O método DB.closeResultSet(rs) fecha o ResultSet rs, liberando os recursos associados a ele.
            // O método DB.closeStatement(st) fecha o PreparedStatement st, liberando os recursos associados a ele.
            // Esses métodos são importantes para evitar vazamentos de memória e garantir que os recursos do banco de dados sejam liberados corretamente após o uso.
            DB.closeStatement(st);
            DB.closeResultSet(rs);

        }
        return null;
    }


    // throws SQLException: Indica que o método pode lançar uma exceção do tipo SQLException,
    // que é uma exceção verificada relacionada a operações de banco de dados.
    // Isso significa que qualquer código que chame esse método
    // deve lidar com a possibilidade de ocorrer uma exceção SQL.
    private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
        Seller seller = new Seller();
        seller.setId(rs.getInt("Id"));
        seller.setName(rs.getString("Name"));
        seller.setEmail(rs.getString("Email"));
        seller.setBirthDate(rs.getDate("BirthDate"));
        seller.setBaseSalary(rs.getDouble("BaseSalary"));
        seller.setDepartament(dep);
        return seller;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department department = new Department();
        department.setId(rs.getInt("DepartmentId"));
        department.setName(rs.getString("DepName"));
        return department;
    }


    @Override
    public List<Seller> findAll() {
        return List.of();
    }


    // O método findByDepartment(Integer departmentId) é responsável por buscar todos os vendedores (Seller)
    //  associados a um determinado departamento (Department) no banco de dados.
    // Ele recebe como parâmetro o ID do departamento e retorna uma lista de objetos Seller que pertencem a esse departamento.
    // O método utiliza uma consulta SQL com INNER JOIN para combinar os dados da tabela seller com a tabela department,
    // permitindo obter o nome do departamento associado a cada vendedor.
    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {

            //Esse sql seleciona todos os vendedores (seller) e o nome do departamento (DepName) associado a cada vendedor,
            // filtrando os resultados pelo ID do departamento fornecido como parâmetro (departmentId).
            // O resultado da consulta será ordenado pelo nome do vendedor (Name).
            st = conn.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE DepartmentId = ? "
                            + "ORDER BY Name");

            st.setInt(1, department.getId());
            rs = st.executeQuery();

            List<Seller> list = new ArrayList<>();

            Map<Integer, Department> map = new HashMap<>();

            //verifica se há registros no ResultSet rs. Se houver, significa que existem vendedores associados ao departamento especificado.
            // Caso haja registros, o método entra em um loop while para iterar sobre cada registro no ResultSet rs.
            while (rs.next()) {
                Department dep = map.get(rs.getInt("DepartmentId"));
                // Se o departamento ainda não estiver no mapa, ele é instanciado e adicionado ao mapa.
                if (dep == null) {
                    dep = instantiateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), dep);


                }
                // Em seguida, um objeto Seller é instanciado com os dados do ResultSet rs e o departamento associado (dep).
                // O objeto Seller é adicionado à lista list, que será retornada ao final do método.
                // O uso do mapa (map) permite evitar a criação de múltiplos objetos Department
                // para o mesmo departamento, economizando memória e melhorando a eficiência do código.
                Seller obj = instantiateSeller(rs, dep);
                list.add(obj);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
}
