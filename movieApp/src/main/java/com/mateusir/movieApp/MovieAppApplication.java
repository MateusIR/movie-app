package com.mateusir.movieApp;

import com.mateusir.movieApp.Main.Main;
import com.mateusir.movieApp.Models.DadosEpisodio;
import com.mateusir.movieApp.Models.DadosSerie;
import com.mateusir.movieApp.Models.DadosTemporada;
import com.mateusir.movieApp.Repository.SerieRepository;
import com.mateusir.movieApp.Service.ConsumeAPI;
import com.mateusir.movieApp.Service.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MovieAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);

	}


	public void run(String... args) throws Exception {



	}
}
