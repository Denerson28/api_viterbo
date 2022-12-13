package viterbo.atividade.api.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import viterbo.atividade.api.dto.EditionDTO;
import viterbo.atividade.api.entity.Edition;

public interface EditionRepository extends JpaRepository<Edition, Long> {
}
