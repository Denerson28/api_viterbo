package viterbo.atividade.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import viterbo.atividade.api.dto.EventDTO;

@Table(name = "events")
@Entity(name = "Event")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Event {
    private long id;
    private String nome;
    private String sigla;
    private String descricao;

    public Event(EventDTO eventdto){

    }
}
