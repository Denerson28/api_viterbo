package viterbo.atividade.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import viterbo.atividade.api.entity.User;

public record UserDTO(
        @NotBlank
        String login,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String nome,
        @NotBlank
        String afiliacao) {

        public UserDTO(User user){
                this(user.getLogin(), user.getEmail(), user.getNome(), user.getAfiliacao());
        }
}
