package com.basespringboot.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterDto {

    @NotBlank
    private String name;

    private String codename;
    private String initialPersona;
    private String element;
    private int rarity;
}