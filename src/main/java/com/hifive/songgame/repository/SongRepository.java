package com.hifive.songgame.repository;


import com.hifive.songgame.model.Song;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SongRepository extends JpaRepository <Song, Long>{
    // Song findByName(String title);
    
}
