package com.hifive.songgame.repository;

import java.util.List;

import com.hifive.songgame.model.Song;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SongRepository extends JpaRepository <Song, Long>{
    // List<Song> findByLyrics(String song);
}
