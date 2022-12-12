package viterbo.atividade.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import viterbo.atividade.api.entity.Event;

public record EventDTO (
        @NotNull
        Long id,

        @NotBlank
        String nome,
        @NotBlank
        String sigla,
        @NotBlank
        String descricao
) {

    public EventDTO(Event event){
        this(event.getId(), event.getNome(), event.getSigla(), event.getDescricao());
    }
}
