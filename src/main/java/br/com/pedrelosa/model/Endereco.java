package br.com.pedrelosa.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "enderecos")
@EqualsAndHashCode
@AllArgsConstructor
@NamedQueries(
        @NamedQuery(name = "Endereco.consultarTodos", query = "SELECT e FROM Endereco e")
)
public class Endereco implements EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    @NotNull
    @ManyToOne
    @JoinColumn(name = "logradouro_id")
    private Logradouro logradouro;

    @Getter
    @Setter
    @NotNull
    private String numeroLogradouro;

    @Getter
    @Setter
    @NotNull
    private String complementoLogradouro;

    @Getter
    @Setter
    @NotNull
    @ManyToOne
    @JoinColumn(name = "bairro_id")
    private Bairro bairro;

    @Getter
    @Setter
    @Column(length = 8)
    private String cep;

    @Getter
    @Setter
    @NotNull
    private String referencia;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(name = "clientes_enderecos",
            joinColumns = @JoinColumn(name = "endereco_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    private List<Cliente> clientes;


    public Endereco() {

    }
}
