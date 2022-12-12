package viterbo.atividade.api.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import viterbo.atividade.api.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
