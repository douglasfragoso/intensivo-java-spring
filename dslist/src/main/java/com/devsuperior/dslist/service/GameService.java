package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameFullDTO;
import com.devsuperior.dslist.model.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repository.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @SuppressWarnings("null")
    @Transactional(readOnly = true) //garante que toda a operação do banco de dados seja resolvida nesse método
    public GameFullDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameFullDTO(result);
    }
   
    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();//transforma a lista de Game em uma lista de GameDTO
    }

    @Transactional(readOnly = true)
    public List<GameDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameDTO(x)).toList();//transforma a lista de Game em uma lista de GameDTO
    }
}
