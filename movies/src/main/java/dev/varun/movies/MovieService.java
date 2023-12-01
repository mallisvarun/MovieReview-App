package dev.varun.movies;
//this class is for database access methods
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired // instead of writing a constrcutor and instantiating the class ,we can just use this annotation so that it instantiates automatically for us
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){

    }
}
