package viterbo.atividade.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import viterbo.atividade.api.dto.EventDTO;
import viterbo.atividade.api.dto.DadosAtualizarEventoDTO;
import viterbo.atividade.api.entity.Event;
import viterbo.atividade.api.interfaces.EventRepository;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid EventDTO eventDTO){
        repository.save(new Event(eventDTO));
    }

    @GetMapping
    public List<EventDTO> Listar(){
        return repository.findAll().stream().map(EventDTO::new).toList();
    }

    @PutMapping
    @Transactional
    public void AtualizarEvento(@RequestBody @Valid DadosAtualizarEventoDTO eventoAtualizar){
        var evento = repository.getReferenceById(eventoAtualizar.id());
        evento.AtualziarDados(eventoAtualizar);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void DeletarEvento(@PathVariable Long id){
        repository.deleteById(id);
    }
}
