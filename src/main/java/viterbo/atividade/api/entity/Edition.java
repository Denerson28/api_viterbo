package viterbo.atividade.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import viterbo.atividade.api.dto.EditionDTO;

import java.sql.Date;

@Table(name = "editions")
@Entity(name = "Edition")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Edition {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;
    private int ano;
    private Date data_inicial;
    private Date data_final;
    private String cidade;
    private Long id_evento;

    public Edition(EditionDTO editionDTO){
        this.numero = editionDTO.numero();
        this.ano = editionDTO.ano();
        this.data_inicial = editionDTO.data_inicial();
        this.data_final = editionDTO.data_final();
        this.cidade = editionDTO.cidade();
        this.id_evento = editionDTO.id_evento();
    }
}
