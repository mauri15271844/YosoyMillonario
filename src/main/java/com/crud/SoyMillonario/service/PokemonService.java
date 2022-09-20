package com.crud.SoyMillonario.service;


import com.crud.SoyMillonario.entiti.Pokemon;
import com.crud.SoyMillonario.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
    @Autowired
    PokemonRepository pokemonRepository;

    public void crearPokemon(Pokemon pokemon){

        pokemonRepository.save(pokemon);
    }

    public List<Pokemon> mostrarPokemones(){
        List<Pokemon> pokemons = new ArrayList<Pokemon>();
        pokemons.addAll(pokemonRepository.findAll());
        return pokemons;
    }

    public void borrarPokemon(Long id){
       pokemonRepository.deleteById(id);
    }
}
