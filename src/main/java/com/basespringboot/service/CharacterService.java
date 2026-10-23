package com.basespringboot.service;

import com.basespringboot.dto.CharacterDto;
import com.basespringboot.model.Character;
import java.util.List;

public interface CharacterService {
    List<Character> findAll();
    Character save(CharacterDto characterDto);
}