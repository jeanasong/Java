package com.javabacktest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;


@JsonIgnoreProperties
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Movie {
	private int movie_id;
	private String title;
//	private String;

}
