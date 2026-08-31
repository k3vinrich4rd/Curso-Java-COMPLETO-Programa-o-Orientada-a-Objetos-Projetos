package jdbc.demodaojdbc.model.impl;

import jdbc.demodaojdbc.model.dao.DepartmentDao;
import jdbc.demodaojdbc.model.entities.Department;
import jdbc.exemplo4.DB;
import jdbc.exemplo4.exceptions.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Implementação JDBC do DAO de departamentos.
public class DepartmentDaoJDBC implements DepartmentDao {

    private final Connection connection;

    public DepartmentDaoJDBC(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void insert(Department obj) {

        PreparedStatement st;

        try {
            st = connection.prepareStatement("INSERT INTO department (Name) VALUES (?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getName());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }

    }

    @Override
    public void update(Department obj) {

        PreparedStatement st = null;

        try {
            st = connection.prepareStatement("UPDATE department SET Name = ? WHERE Id = ?");
            st.setString(1, obj.getName());
            st.setInt(2, obj.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }


    }

    @Override
    public void deleteById(Integer id) {

        PreparedStatement st = null;

        try {
            st = connection.prepareStatement("DELETE FROM department WHERE Id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }


    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            // Busca um único departamento pelo id.
            st = connection.prepareStatement("SELECT * FROM department WHERE Id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                Department department = new Department();
                department.setId(rs.getInt("Id"));
                department.setName(rs.getString("Name"));
                return department;
            }
            return null;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Department> findAll() {
      PreparedStatement st = null;
      ResultSet rs = null;

      try {
            // Lista todos os departamentos ordenados por nome.
            st = connection.prepareStatement("SELECT * FROM department ORDER BY Name");
            rs = st.executeQuery();

            List<Department> list = new ArrayList<>();

            while (rs.next()) {
                Department department = new Department();
                department.setId(rs.getInt("Id"));
                department.setName(rs.getString("Name"));
                list.add(department);
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
