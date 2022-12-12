package viterbo.atividade.api.dto;

import jakarta.validation.constraints.NotNull;

public record dadosAtualizarEventoDTO(
        @NotNull
        Long id,

        String nome,
        String sigla,
        String descricao) {
}
