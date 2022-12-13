package viterbo.atividade.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import viterbo.atividade.api.entity.Edition;

import java.sql.Date;

public record EditionDTO (
        Long id,
        @NotNull
        int numero,
        @NotNull
        int ano,
        @NotNull
        Date data_inicial,
        @NotNull
        Date data_final,
        @NotBlank
        String cidade,
        @NotNull
        Long id_evento
        ){
        public EditionDTO(Edition edition){
                this(edition.getId(), edition.getNumero(), edition.getAno(), edition.getData_inicial(), edition.getData_final(), edition.getCidade(), edition.getId_evento());
        }

}

