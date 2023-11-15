package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(game -> new GameDTO(game)).toList();
    }
}
