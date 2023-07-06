package br.com.pedrelosa.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
@EqualsAndHashCode
@AllArgsConstructor
@NamedQueries(
        @NamedQuery(name = "Cliente.consultarTodos",
            query = "SELECT e FROM Cliente e ")
)
public class Cliente implements EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    @NotNull
    @Column(length = 11)
    private String telefone;

    @Getter
    @Setter
    @NotNull
    private String nome;

    @Getter
    @Setter
    private String nomeCompleto;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "clientes")
    private List<Endereco> enderecos ;

    @Getter
    @Setter
    private Double taxaEntrega;

    @Getter
    @Setter
    private String observacoes;


    public Cliente() {

    }
}
