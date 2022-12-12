package viterbo.atividade.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import viterbo.atividade.api.dto.UserDTO;
import viterbo.atividade.api.entity.User;
import viterbo.atividade.api.interfaces.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid UserDTO userDTO){
        repository.save(new User(userDTO));
    }

    @GetMapping
    public List<UserDTO> Listar(){
        return repository.findAll().stream().map(UserDTO::new).toList();
    }
}
