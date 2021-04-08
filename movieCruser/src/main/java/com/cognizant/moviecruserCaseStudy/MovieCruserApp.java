package com.cognizant.moviecruserCaseStudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.moviecruserCaseStudy.model.Movie;
import com.cognizant.moviecruserCaseStudy.service.MovieService;
import com.cognizant.moviecruserCaseStudy.util.DateUtil;

@SpringBootApplication
public class MovieCruserApp {

	@Autowired
	private static MovieService movieService;
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruserApp.class);

	public static void main(String[] args) {
		LOGGER.info("Inside main");

		ApplicationContext context = SpringApplication.run(MovieCruserApp.class, args);

		movieService = context.getBean(MovieService.class);

		// testAddMovieItem();
		// testModifyMovieList();
		// testGetMovieListAdmin();
		// testGetMovieListCustomer();
		// testGetMovieList(1);

	}

	private static void testAddMovieItem() {
		LOGGER.info("Start of testAddMovieItem method");

		MovieCruserApp m = new MovieCruserApp();

		/*
		 * Movie movie = new Movie(); movie.setTitle("Avengers Endgame");
		 * movie.setBoxOffice("245864.24"); movie.setActive(true);
		 * movie.setDateOfLaunch(DateUtil.convertToDate("23/04/2019"));
		 * movie.setGenre("Super Hero"); movie.setHasTeaser(true);
		 * movieService.modifyMovie(movie);
		 * 
		 * Movie movie1 = new Movie(); movie1.setTitle("The Avengers");
		 * movie1.setBoxOffice("134587.35"); movie1.setActive(true);
		 * movie1.setDateOfLaunch(DateUtil.convertToDate("23/12/2017"));
		 * movie1.setGenre("Super Hero"); movie1.setHasTeaser(false);
		 * movieService.modifyMovie(movie1);
		 * 
		 * Movie movie2 = new Movie();
		 * movie2.setTitle("Pirates of Caribbean: On Stranger Tides");
		 * movie2.setBoxOffice("456987.35"); movie2.setActive(true);
		 * movie2.setDateOfLaunch(DateUtil.convertToDate("20/5/2011"));
		 * movie2.setGenre("Action"); movie2.setHasTeaser(true);
		 * movieService.modifyMovie(movie2);
		 */
		Movie movie3 = new Movie();
		movie3.setTitle("Avengers Infinity War");
		movie3.setBoxOffice("234587.32");
		movie3.setActive(false);
		movie3.setDateOfLaunch(DateUtil.convertToDate("25/04/2018"));
		movie3.setGenre("Super Hero");
		movie3.setHasTeaser(true);
		movieService.modifyMovie(movie3);

		LOGGER.info("End of testAddMovieItem  method");

	}

	private static void testModifyMovieList()// use this test to insert or update Movie Object
	{
		LOGGER.info("Start of testModifyMovieList method");

		Movie movie = movieService.getMovie(2);
		movie.setId(2);
		movie.setTitle("Quiet Place");
		movie.setBoxOffice("458652.21");
		movie.setHasTeaser(true);
		movie.setActive(true);
		movie.setDateOfLaunch(DateUtil.convertToDate("12/05/2017"));
		movie.setGenre("Horror");
		movieService.modifyMovie(movie);

		LOGGER.info("End of testModifyMovieList method");
	}

	private static void testGetMovieListAdmin() {
		LOGGER.info("Start oftestGetMovieListAdmin method ");
		LOGGER.debug("Movies :: {}", movieService.getMovieListAdmin());
		LOGGER.info("End of testGetMovieListAdmin method");
	}

	private static void testGetMovieListCustomer() {
		LOGGER.info("Start of testGetMovieListCustomer method");
		LOGGER.debug("Movies for customer :: {}", movieService.getMovieListCustomer());
		LOGGER.info("End of testGetMovieListCustomer method");
	}

	private static void testGetMovieList(Integer id) {
		LOGGER.info("Start of testGetMovieList method");
		LOGGER.debug("Item:: {}", movieService.getMovie(id));
		LOGGER.info("End of testGetMovieList method");
	}

}
