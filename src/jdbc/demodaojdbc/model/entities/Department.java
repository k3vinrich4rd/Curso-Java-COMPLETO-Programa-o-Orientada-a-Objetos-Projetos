package jdbc.demodaojdbc.model.entities;

import java.io.Serializable;
import java.util.Objects;

//Serializable é uma interface que permite que objetos de uma classe sejam convertidos em um fluxo de bytes, para poderem ser armazenados em arquivos ou
// transmitidos pela rede. A interface Serializable não possui métodos, mas serve como um marcador para indicar que a classe pode ser serializada.
//Isso significa que a classe pode ser convertida em um formato que pode ser armazenado ou transmitido, e depois reconstruído em um objeto novamente.
public class Department implements Serializable {
    private Integer id;
    private String name;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + ']';
    }
}
