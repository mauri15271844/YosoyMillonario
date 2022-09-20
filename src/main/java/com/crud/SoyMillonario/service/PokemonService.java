package com.crud.SoyMillonario.service;

import com.crud.SoyMillonario.model.Pokemon;
import com.crud.SoyMillonario.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    public void crearPokemon(Pokemon pokemon){

        pokemonRepository.save(pokemon);

    }

    public void verPokemon(){

    }

    public void eliminarPokemon(){

    }

    public void editarPokemon(){

    }

    public void guardarPokemon(){

    }


}


