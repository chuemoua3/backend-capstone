package com.hifive.songgame.controller;

import java.util.List;

import com.hifive.songgame.model.Song;
import com.hifive.songgame.repository.SongRepository;
import com.hifive.songgame.service.SongService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @Autowired
    SongService songService;

    @GetMapping("/songs")
    public List<Song> getSongs() {
        return this.songRepository.findAll();

    }
   
    @PostMapping("/songs")
    public void addSongs(@RequestBody Song song){
        songService.addSong(song);
    }

}
