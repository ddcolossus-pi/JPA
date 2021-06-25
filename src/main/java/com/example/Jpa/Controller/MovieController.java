package com.example.Jpa.Controller;

import com.example.Jpa.Dto.MovieDto;
import com.example.Jpa.Dto.MovieResponseDto;
import com.example.Jpa.Dto.ResponseDto;
import com.example.Jpa.Model.Cinema;
import com.example.Jpa.Repository.CinemaRepository;
import com.example.Jpa.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @Autowired
    CinemaRepository cinemaRepository;

    @PostMapping("/saveMovie")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseDto<MovieResponseDto> saveMovie(@RequestBody MovieDto movieDto){
        MovieResponseDto movieResponseDto = movieService.saveMovie(movieDto);
        return new ResponseDto(movieResponseDto, HttpStatus.CREATED);
    }

    @PostMapping("/saveCinema")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseDto<Cinema> saveCinema(@RequestBody Cinema cinema){
        cinema = cinemaRepository.save(cinema);
        return new  ResponseDto(cinema, HttpStatus.CREATED);
    }
}
