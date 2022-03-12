package com.freddev7.dsmovie2pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freddev7.dsmovie2pro.entities.Score;
import com.freddev7.dsmovie2pro.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
