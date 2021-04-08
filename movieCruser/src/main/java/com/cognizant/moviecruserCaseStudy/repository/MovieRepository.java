package com.cognizant.moviecruserCaseStudy.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.moviecruserCaseStudy.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {


	public List<Movie> findByActiveAndDateOfLaunchBefore(boolean active, Date date);

}