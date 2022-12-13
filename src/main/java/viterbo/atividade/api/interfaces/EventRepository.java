package viterbo.atividade.api.interfaces;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import viterbo.atividade.api.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
