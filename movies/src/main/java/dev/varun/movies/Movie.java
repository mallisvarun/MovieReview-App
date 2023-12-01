package dev.varun.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import javax.print.DocFlavor;
import java.util.List;

@Document(collection = "movies")
@Data // takes care of all getter & setters
@AllArgsConstructor //for constructor that takes all these fields as inputs
@NoArgsConstructor // constructor that takes nothing

public class Movie {
    @Id //framework should know to treat this identifier as unique for each movie
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference //it will collect all reviews
    private List<Review> reviewIds; // all reviews for a movie will come to this variable, this is a embedded relationship

}
