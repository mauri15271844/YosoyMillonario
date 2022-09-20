package com.crud.SoyMillonario.controller;


import com.crud.SoyMillonario.model.Pokemon;
import com.crud.SoyMillonario.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @PostMapping("/pokemon")
    private void crearPokemon(@RequestBody Pokemon pokemon){

        pokemonService.crearPokemon(pokemon);

    }
}
