package viterbo.atividade.api.dto;

import jakarta.validation.constraints.NotNull;
import viterbo.atividade.api.entity.Event;

public record DadosAtualizarEventoDTO(
        @NotNull
        Long id,

        String nome,
        String sigla,
        String descricao,
        Long id_edicao
) {
}
