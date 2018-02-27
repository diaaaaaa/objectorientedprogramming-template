package oop.pset1;

import oop.pset1.controller.MovieDatabaseSummarizer;
import oop.pset1.model.Actor;
import oop.pset1.model.Movie;
import oop.pset1.model.Summary;
import oop.pset1.parser.ActorParser;
import oop.pset1.parser.MovieParser;
import oop.pset1.view.SummaryDisplayer;

import java.util.List;


public class Pset1Main {

    public static void main(String[] args) {
        MovieParser parserMovie = new MovieParser();
        ActorParser parserActor = new ActorParser();

        List<Movie> movies = parserMovie.getMovies();
        List<Actor> actors = parserActor.getActors();

        MovieDatabaseSummarizer summarizerMovie = new MovieDatabaseSummarizer();
        MovieDatabaseSummarizer summarizerActor = new MovieDatabaseSummarizer();

        SummaryDisplayer displayerMovie = new SummaryDisplayer();
        SummaryDisplayer displayerActor = new SummaryDisplayer();

        Summary summaryMovie = summarizerMovie.summarizeMovie(movies);
        Summary summaryActor = summarizerActor.summarizeActor(actors);
        displayerMovie.displayMovie(summaryMovie);
        displayerActor.displayActor(summaryActor);


    }
}
