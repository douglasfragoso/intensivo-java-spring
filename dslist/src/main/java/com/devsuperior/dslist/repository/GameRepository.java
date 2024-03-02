package com.devsuperior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.model.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
