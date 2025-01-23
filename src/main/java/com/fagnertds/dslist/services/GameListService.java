package com.fagnertds.dslist.services;

import com.fagnertds.dslist.dto.GameDTO;
import com.fagnertds.dslist.dto.GameListDTO;
import com.fagnertds.dslist.dto.GameMinDto;
import com.fagnertds.dslist.entities.Game;
import com.fagnertds.dslist.entities.GameList;
import com.fagnertds.dslist.repositories.GameListRepository;
import com.fagnertds.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;



    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
