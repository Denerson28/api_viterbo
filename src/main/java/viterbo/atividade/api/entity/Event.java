package viterbo.atividade.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import viterbo.atividade.api.dto.EventDTO;
import viterbo.atividade.api.dto.dadosAtualizarEventoDTO;

@Table(name = "events")
@Entity(name = "Event")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Event {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String sigla;
    private String descricao;

    public Event(EventDTO eventDTO){
        this.nome = eventDTO.nome();
        this.sigla = eventDTO.sigla();
        this.descricao = eventDTO.descricao();
    }

    public void AtualziarDados(dadosAtualizarEventoDTO eventoAtualizar) {
        if(eventoAtualizar.nome() != null){
            this.nome = eventoAtualizar.nome();
        }
        if(eventoAtualizar.sigla() != null){
            this.sigla = eventoAtualizar.sigla();
        }
        if(eventoAtualizar.descricao() != null){
            this.descricao = eventoAtualizar.descricao();
        }
    }
}
