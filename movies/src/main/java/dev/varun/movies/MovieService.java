package dev.varun.movies;
//this class is for database access methods
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // instead of writing a constructor and instantiating the class ,we can just use this annotation so that it instantiates automatically for us
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
