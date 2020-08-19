package com.hifive.songgame;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class DemoApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(DemoApplication.class, args);
// 	}

// }

import com.hifive.songgame.model.Song;
import com.hifive.songgame.repository.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private SongRepository songRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		//Example of how to set it up
		// this.songRepository.save(new Song(lyrics, answer1, answer2, answer3, answer4))

		//Question 1
		this.songRepository.save(new Song("Oh, baby, everything you do is amazing Aint nobody watching, go crazy, I got what you need…","A. Go Crazy", "B. No Guidance", "C. Going Crazy", "D. Oh Baby"));

		// Answer for 1 --A

		//Question 2 
		this.songRepository.save(new Song("Man what a time to be alive.  You and yours vs me and mine.  Oh we talking teams? Oh we talking teams? Oh you switchin sides? Wanna come with me?","A. Championship Rings", "B. Rings", "C. Big Rings", "D. Switchin Sides"));

		//Answer for 2-- C
	
		//Question 3 
		this.songRepository.save(new Song("Dont expect a free ride from no one.  Dont hold a grudge or a chip and heres why.  Bitterness keeps you from flyin.  Always stay humble and kind.","A. Gentle", "B. Humble pie", "C. Crazy about you", "D. Humble & Kind"));

		//Answer for 3-- D

		//Question 4
		this.songRepository.save(new Song("Cause I'll be at your door in ten minutes.  Whatever you go on, girl stay in it.  You ain't gotta leave the house to have a good time.  I'm 'a bring the good time home to you","A. Ten Minuets", "B. House Party", "C. Late", "D. Home Alone"));

		//Answer for 4 --B

		//Question 5 
		this.songRepository.save(new Song("Day to night to morning, keep with me in the moment.  I'd let you had I known it, why don't you say so?  Didn't even notice, no punches left to roll with.  You got to keep me focused.  You want it?","A. All Day", "B. Say what you want", "C. Say so", "D. Focused"));

		//Answer to 5 --C

		//Question 6
		this.songRepository.save(new Song("I smell like a mini-bar.  DJs passed out in the yard.  Barbies on the barbeque.  This a hickey or a bruise","A. Last Friday Night", "B. Last Weekend", "C. Going Crazy", "D. Drinking Games"));

		//Answer to 6-- A

		//Question 7 
		this.songRepository.save(new Song("Don't want to be a fool for you Just another player in your game for two I don't want to be your fool But it ain't no lie","A. Hey You", "B. Let Me Go", "C. I'm a fool", "D. Bye Bye Bye"));

		//Answer to 7-- D

		//Question 8
		this.songRepository.save(new Song("Hello, hello, hello With the lights out, it's less dangerous Here we are now, entertain us I feel stupid and contagious Here we are now","A. Hello", "B. The Lights", "C. Smells Like Teen Spirit", "D. Contagious"));

		//Answer to 8-- C




	}
}




























//DON'T NEED TO LOOK AT THIS








// this.songRepository.save(new Song(artist, genre, lyrics, songtitle))


		//Hip-Hop
		// this.songRepository.save(new Song("Chris Brown", "Hip-Hop",
		// 		"Oh, baby, everything you do is amazing Aint nobody watching, go crazy, I got what you need…",
		// 		"Go Crazy"));

		// this.songRepository.save(new Song("Drake", "Hip-Hop",
		// 		"Man what a time to be alive.  You and yours vs me and mine.  Oh we talking teams? Oh we talking teams? Oh you switchin sides? Wanna come with me?",
		// 		"Big Rings"));


		// //Country
		// this.songRepository.save(new Song("Tim McGraw", "Country",
		// 		"Dont expect a free ride from no one.  Dont hold a grudge or a chip and heres why.  Bitterness keeps you from flyin.  Always stay humble and kind.",
		// 		"Humble & Kind"));
		
		// this.songRepository.save(new Song("Sam Hunt", "Country",
		// 		"Cause I'll be at your door in ten minutes.  Whatever you go on, girl stay in it.  You ain't gotta leave the house to have a good time.  I'm 'a bring the good time home to you.'",
		// 		"House Party"));

		// // //Top 40
		// this.songRepository.save(new Song("Doja Cat", "Top 40",
		// 	"Day to night to morning, keep with me in the moment.  I'd let you had I known it, why don't you say so?  Didn't even notice, no punches left to roll with.  You got to keep me focused.  You want it?",
		// 	"Say So"));

		// this.songRepository.save(new Song("Katy Perry", "Top 40",
		// 	"I smell like a mini-bar.  DJs passed out in the yard.  Barbies on the barbeque.  This a hickey or a bruise",
		// 	"Last Friday Night"));

		// // //90s Top Hit
		

