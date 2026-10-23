package com.basespringboot.service;

import com.basespringboot.model.Character;
import com.basespringboot.repository.CharacterRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public Character saveCharacter(Character character) {
        return characterRepository.save(character);
    }

    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    public Optional<Character> getCharacterById(Long id) {
        return characterRepository.findById(id);
    }

    public Character updateCharacter(Long id, Character details) {
        return characterRepository.findById(id).map(character -> {
            character.setName(details.getName());
            character.setCodename(details.getCodename());
            character.setInitialPersona(details.getInitialPersona());
            character.setElement(details.getElement());
            character.setRarity(details.getRarity());
            return characterRepository.save(character);
        }).orElseThrow(() -> new RuntimeException("Personnage introuvable : " + id));
    }

    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }
}
