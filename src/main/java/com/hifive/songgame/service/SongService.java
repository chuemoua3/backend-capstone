package com.hifive.songgame.service;

import java.util.List;

import com.hifive.songgame.model.Song;
import com.hifive.songgame.repository.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    @Autowired
    SongRepository songRepository;

    public List<Song> getSongs(){
    return songRepository.findAll();
    }

    public void addSong(Song song) {
        songRepository.save(song);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }

	public static void addSongs(Song song) {
	}



}