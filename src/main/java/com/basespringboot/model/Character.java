package com.basespringboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "p5x_characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String codename;

    @Column(name = "initial_persona")
    private String initialPersona;

    private String element;

    private int rarity;

    public Character() {}

    public Character(String name, String codename, String initialPersona, String element, int rarity) {
        this.name = name;
        this.codename = codename;
        this.initialPersona = initialPersona;
        this.element = element;
        this.rarity = rarity;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCodename() { return codename; }
    public void setCodename(String codename) { this.codename = codename; }
    public String getInitialPersona() { return initialPersona; }
    public void setInitialPersona(String initialPersona) { this.initialPersona = initialPersona; }
    public String getElement() { return element; }
    public void setElement(String element) { this.element = element; }
    public int getRarity() { return rarity; }
    public void setRarity(int rarity) { this.rarity = rarity; }
}
