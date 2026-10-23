package com.basespringboot.controller;

import com.basespringboot.dto.CharacterDto;
import com.basespringboot.model.Character;
import com.basespringboot.service.CharacterService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getAll() {
        return characterService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Character save(@Valid @RequestBody CharacterDto characterDto) {
        return characterService.save(characterDto);
    }
}