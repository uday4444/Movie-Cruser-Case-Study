package com.cognizant.moviecruserCaseStudy.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruserCaseStudy.model.Movie;
import com.cognizant.moviecruserCaseStudy.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieService.class);
	
	

	@Transactional
	public void modifyMovie(Movie movie)
	{
		LOGGER.info("Start of modifyMovie Method");
		movieRepository.save(movie);
		LOGGER.info("End of modifyMovie Method");
		
	}
	
	@Transactional
	public Movie getMovie(Integer movieId)
	{
		LOGGER.info("Start of getMovie Method");
		return movieRepository.findById(movieId).get();
		
	}
	
	@Transactional
	public List<Movie> getMovieListCustomer()
	{
	 LOGGER.info("Start of getMovieListCustomer method");
	 return movieRepository.findByActiveAndDateOfLaunchBefore(true, new Date());
	}
	
	@Transactional
	public List<Movie> getMovieListAdmin()
	{
		LOGGER.info("Start of getMovieListAdmin method");
		return movieRepository.findAll();
	}
	
}