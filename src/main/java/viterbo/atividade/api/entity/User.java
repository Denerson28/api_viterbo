package viterbo.atividade.api.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import viterbo.atividade.api.dto.UserDTO;

@Table(name = "users")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String login;
    private String email;
    private String nome;
    private String afiliacao;

    public User(UserDTO userDTO) {
        this.login = userDTO.login();
        this.email = userDTO.email();
        this.nome = userDTO.nome();
        this.afiliacao = userDTO.afiliacao();
    }
}
