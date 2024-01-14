package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Playlist;

public interface PlayListRepository extends JpaRepository <Playlist, Integer>{

}
