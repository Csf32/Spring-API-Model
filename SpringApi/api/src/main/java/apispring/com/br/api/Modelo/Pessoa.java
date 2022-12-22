package apispring.com.br.api.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity

@Table(name = "api")

@Getter
@Setter
public class Pessoa {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer codigo;
    private String nome;
    private Integer idade;

}
