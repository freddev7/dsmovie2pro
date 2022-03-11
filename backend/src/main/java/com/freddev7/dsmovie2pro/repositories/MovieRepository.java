package com.freddev7.dsmovie2pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freddev7.dsmovie2pro.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
