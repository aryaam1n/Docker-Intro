package com.dockerstart.dockerfirstapp;

import com.dockerstart.dockerfirstapp.models.Artist;
import com.dockerstart.dockerfirstapp.repositories.ArtistRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerFirstAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ArtistRepo artistRepo){
		return args -> {
			artistRepo.save(new Artist("Drake", "666-666-6666", "drake@gmail.com", 1000000L));
			artistRepo.save(new Artist("Kanye", "444-444-4444", "kanye@gmail.com", 5000L));
		};
	}

}


//PLAN THIS OUT, MAKE IT KINDA LIKE SPOTIFY
//name
//monthly listeners
//mobile
//email