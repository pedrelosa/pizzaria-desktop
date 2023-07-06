package br.com.pedrelosa.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bairros")
@EqualsAndHashCode
@AllArgsConstructor
public class Bairro implements EntidadeBase{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    @NotNull
    private String nome;

    @Getter
    @Setter
    @NotNull
    private Double taxaEntrega;

    @Getter
    @Setter
    @OneToMany(mappedBy = "bairro")
    private List<Logradouro> logradouros;

    @Getter
    @Setter
    @OneToMany(mappedBy = "bairro")
    private List<Endereco> enderecos;

    public Bairro() {

    }
}
