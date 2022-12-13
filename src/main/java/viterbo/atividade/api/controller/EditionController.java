package viterbo.atividade.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import viterbo.atividade.api.dto.EditionDTO;
import viterbo.atividade.api.dto.DadosAtualizarEventoDTO;
import viterbo.atividade.api.entity.Edition;
import viterbo.atividade.api.interfaces.EditionRepository;
import viterbo.atividade.api.interfaces.EventRepository;

import java.util.List;

@RestController
@RequestMapping("/editions")
public class EditionController {

    @Autowired
    private EditionRepository repository;
    @Autowired
    private EventRepository eventRepository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid EditionDTO editionDTO){
        repository.save(new Edition(editionDTO));
    }

    @GetMapping
    public List<EditionDTO> Listar(){
        return repository.findAll().stream().map(EditionDTO::new).toList();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void DeletarEvento(@PathVariable Long id){
        repository.deleteById(id);
    }
}
