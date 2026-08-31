package jdbc.demodaojdbc.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

// Representa o vendedor persistido na tabela seller.
public class Seller implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;
    private Department department;

    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Seller() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Mantido com este nome para acompanhar a estrutura usada no restante do módulo.
    public Department getDepartament() {
        return department;
    }

    // Associa o vendedor ao departamento correspondente.
    public void setDepartament(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id) && Objects.equals(name, seller.name) && Objects.equals(email, seller.email) && Objects.equals(birthDate, seller.birthDate) && Objects.equals(baseSalary, seller.baseSalary) && Objects.equals(department, seller.department);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + Objects.hashCode(birthDate);
        result = 31 * result + Objects.hashCode(baseSalary);
        result = 31 * result + Objects.hashCode(department);
        return result;
    }

    @Override
    public String toString() {
        return "Seller [" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", birthDate=" + birthDate + ", baseSalary=" + baseSalary + ", department=" + department + ']';
    }
}
