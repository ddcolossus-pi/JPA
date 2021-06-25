package com.example.Jpa.Service;

import com.example.Jpa.Dto.MovieDto;
import com.example.Jpa.Dto.MovieResponseDto;
import com.example.Jpa.Model.Movie;
import com.example.Jpa.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieResponseDto saveMovie(MovieDto movieDto){
        Movie movie = new Movie(movieDto.getName(),movieDto.getRatings(),System.currentTimeMillis());

        movie = movieRepository.save(movie);

        MovieResponseDto movieResponseDto = new MovieResponseDto(movie.getId(),movie.getName(),movie.getRatings());
        return movieResponseDto;
    }

}
