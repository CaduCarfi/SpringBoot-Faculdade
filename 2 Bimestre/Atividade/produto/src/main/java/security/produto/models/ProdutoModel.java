package security.produto.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_PRODUTO")
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

}