package viterbo.atividade.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import viterbo.atividade.api.entity.Event;

public record EventDTO (

        Long id,
        @NotBlank
        String nome,
        @NotBlank
        String sigla,
        @NotBlank
        String descricao,
        Long id_edicao
) {

    public EventDTO(Event event){
        this(event.getId(), event.getNome(), event.getSigla(), event.getDescricao(), event.getId_edicao());
    }
}
