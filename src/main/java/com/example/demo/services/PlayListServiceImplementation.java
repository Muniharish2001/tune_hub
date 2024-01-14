package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Playlist;
import com.example.demo.repository.PlayListRepository;

@Service
public class PlayListServiceImplementation implements PlayListService {
    @Autowired
    PlayListRepository repo;
	@Override
	public void addPlaylist(Playlist playlist) {
		// TODO Auto-generated method stub
		repo.save(playlist);
	}
	@Override
	public List<Playlist> fetchAllPlaylists() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
