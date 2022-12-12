package viterbo.atividade.api.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import viterbo.atividade.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
