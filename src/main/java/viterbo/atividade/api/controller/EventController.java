package viterbo.atividade.api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import viterbo.atividade.api.dto.EventDTO;
import viterbo.atividade.api.dto.UserDTO;
import viterbo.atividade.api.entity.Event;
import viterbo.atividade.api.entity.User;
import viterbo.atividade.api.interfaces.EventRepository;
import viterbo.atividade.api.interfaces.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository repository;

    @PostMapping
    public void Cadastrar(@RequestBody @Valid EventDTO eventDTO){
        repository.save(new Event(eventDTO));
    }

    @GetMapping
    public List<EventDTO> Listar(){
        return repository.findAll().stream().map(EventDTO::new).toList();
    }
}
