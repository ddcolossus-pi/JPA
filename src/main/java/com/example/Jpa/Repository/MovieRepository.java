package com.example.Jpa.Repository;

import com.example.Jpa.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

//    @Query(value = "                 ",nativeQuery = true);
//    public Movie findByNameAndTime(String name, long time);
}
