package com.capg.omts;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.omts.dao.IMovieDao;
import com.capg.omts.entity.MovieBean;
import com.capg.omts.service.IMovieService;

@RunWith(SpringRunner.class)
@SpringBootTest
class OnlineMovieTicketSystemShaliniApplicationTests {
	@Autowired
	private IMovieService movieService;
	@MockBean
	private IMovieDao moviedao;

	@Test
	public void testgetAllMovies() {
		MovieBean movie1 = new MovieBean();
		movie1.setMovieId(97);
		movie1.setMovieName("kushi");
		movie1.setMovieDirector("surya");
		movie1.setMovieLengthInMinutes(120);
		movie1.setMovieLanguage("telugu");
		movie1.setMovieGenre("romance");
		
		MovieBean movie2 = new MovieBean();
		movie2.setMovieId(96);
		movie2.setMovieName("jersey");
		movie2.setMovieDirector("gowtam");
		movie2.setMovieLengthInMinutes(157);
		movie2.setMovieLanguage("telugu");
		movie2.setMovieGenre("sport");
		
		List<MovieBean> movielist = new ArrayList<>();
		movielist.add(movie1);
		movielist.add(movie2);
		
		Mockito.when(moviedao.listOfMovies()).thenReturn(movielist);
		assertThat(movieService.listOfMovies()).isEqualTo(movielist);
		assertEquals(movielist.size(),2);
		
		
	}

	@Test
	public void testAddMovie() {
		MovieBean movie = new MovieBean();
		movie.setMovieId(95);
		movie.setMovieName("chhichhore");
		movie.setMovieDirector("nitesh");
		movie.setMovieLengthInMinutes(143);
		movie.setMovieLanguage("hindi");
		movie.setMovieGenre("comedy");
		Mockito.when(moviedao.addMovie(movie)).thenReturn(movie);
		assertThat(movieService.addMovie(movie)).isEqualTo(movie);

	}
    
	/*@Test
	public void testDeleteMovie() {
		MovieBean movie = new MovieBean();
		movie.setMovieId(72);
		movie.setMovieName("sakhi");
		movie.setMovieDirector("mani");
		movie.setMovieLengthInMinutes(120);
		movie.setMovieLanguage("telugu");
		movie.setMovieGenre("romance");
		//Mockito.when(moviedao.findOne(1)).thenReturn(movie);
		//Mockito.when(moviedao.exists(movie.getMovieId())).thenReturn(false);
		//assertFalse(moviedao.exists(movie.getMovieId()));
	}*/
}

