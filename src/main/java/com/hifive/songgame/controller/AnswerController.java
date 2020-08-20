// package com.hifive.songgame.controller;

// import java.util.List;

// import com.hifive.songgame.model.Answer;
// import com.hifive.songgame.model.Song;
// import com.hifive.songgame.repository.AnswerRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping
// @CrossOrigin(origins = "http://localhost:3000")
// public class AnswerController {
//     @Autowired
//     private AnswerRepository answerRepository;

//     @GetMapping("/answers")
//     public List<Song> getSongs() {
//         return answerRepository.findAll();
//     }

    
// }