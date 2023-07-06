package br.com.pedrelosa.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "logradouros")
@EqualsAndHashCode
@AllArgsConstructor@NamedQueries(
        @NamedQuery(name = "Logradouro.buscaPorCaracteres",
                query = "Select l FROM Logradouro l WHERE l.nome like :busca")
)
public class Logradouro implements EntidadeBase{
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
    @Enumerated
    private AbreviacaoLogradouro abreviacaoLogradouro;

    @Getter
    @Setter
    @NotNull
    @Enumerated
    private TipoLogradouro tipoLogradouro;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "bairro_id")
    private Bairro bairro;

    @Getter
    @Setter
    @OneToMany(mappedBy = "logradouro")
    private List<Endereco> enderecos;

    public Logradouro() {

    }

    @Override
    public String toString() {
        return "Logradouro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", abreviacaoLogradouro=" + abreviacaoLogradouro +
                ", tipoLogradouro=" + tipoLogradouro +
                '}';
    }
}
