package course.receita_federal.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cpf;
    private String name;
    private Integer idade;

    public User() {
    }

    public User(Long cpf, String name, Integer idade) {
        super();
        this.cpf = cpf;
        this.name = name;
        this.idade = idade;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return cpf.equals(user.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
