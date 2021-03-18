package com.javabacktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.javabacktest.model.Movie;

@SpringBootApplication
public class SpringbootModethreeWeektwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootModethreeWeektwoApplication.class, args);
		
		String url = "https://my.api.mockaroo.com/movie.json?key=bb299fd0";

        RestTemplate restTemplate = new RestTemplate();

       Movie[] response  = null;

      response = restTemplate.getForObject(url, Movie[].class);
      System.out.println(response[0]);


	}

}
