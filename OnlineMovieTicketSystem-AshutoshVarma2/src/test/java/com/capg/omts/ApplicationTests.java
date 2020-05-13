
package com.capg.omts;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.omts.Dao.IMovieTheatersDao;
import com.capg.omts.Entity.Movies;
import com.capg.omts.Service.IMovieTheaterService;

@RunWith(SpringRunner.class)

@SpringBootTest

@ContextConfiguration
class ApplicationTests {

	@Autowired
	private IMovieTheaterService service;

	@MockBean
	private IMovieTheatersDao dao;

	@Test
	public void getAllMoviesTest() {
		when(dao.getAllMovies()).thenReturn(Stream
				.of(new Movies(2, "imax", "hyderabad", "English", "Andrew", "1 hour 30 min", "finding nemo"),
						new Movies(6, "gvk", "Bangalore", "hindi", "Rohit shetty", "1 hour 30 min", "golmaal"))
				.collect(Collectors.toList()));

		assertEquals(2, service.getAllMovies().size());
	}

	@Test
	public void searchMovieTest() {
		String movieName = "kgf";
		when(dao.searchMovie(movieName)).thenReturn(
				Stream.of(new Movies(2, "imax", "hyderabad", "English", "Andrew", "1 hour 30 min", "finding nemo"))
						.collect(Collectors.toList()));
		assertEquals(1, service.searchMovie(movieName).size());
	}

	@Test
	public void searchTheater() {
		String TheaterName = "pvr";
		when(dao.searchTheater(TheaterName)).thenReturn(
				Stream.of(new Movies(2, "imax", "hyderabad", "English", "Andrew", "1 hour 30 min", "finding nemo"))
						.collect(Collectors.toList()));
		assertEquals(1, service.searchTheater(TheaterName).size());
	}
}
