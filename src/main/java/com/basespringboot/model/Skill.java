//Compétence du perssonage P5X

package com.basespringboot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_id")
    @JsonBackReference
    private Character character;

    public Long getId() { 
        return id; }

    public void setId(Long id) { 
        this.id = id; }

    public String getName() { 
        return name; }

    public void setName(String name) { 
        this.name = name; }

    public String getDescription() { 
        return description; }

    public void setDescription(String description) { 
        this.description = description; }

    public Character getCharacter() { 
        return character; }

    public void setCharacter(Character character) { 
        this.character = character; }
}