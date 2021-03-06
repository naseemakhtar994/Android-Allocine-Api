package com.github.florent37.allocineapi.model;

import com.github.florent37.allocineapi.model.Movie.Movie;
import com.github.florent37.allocineapi.model.Person.PersonSmall;
import com.github.florent37.allocineapi.model.Theater.Theater;
import com.github.florent37.allocineapi.model.Theater.TheaterShowtime;
import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class FeedSmall implements Serializable {

    @Expose
    private String updated;
    @Expose
    private Integer page;
    @Expose
    private Integer count;
    @Expose
    private Integer totalResults;
    @Expose
    private List<ModelObject> results = new ArrayList<ModelObject>();
    @Expose
    private List<Movie> movie = new ArrayList<Movie>();
    @Expose
    private List<TheaterShowtime> theaterShowtimes = new ArrayList<TheaterShowtime>();
    @Expose
    private List<Theater> theater = new ArrayList<Theater>();
    @Expose
    private List<Review> review = new ArrayList<Review>();
    @Expose
    private List<Media> media = new ArrayList<Media>();

    @Expose
    private List<PersonSmall> person = new ArrayList<PersonSmall>();

    public List<PersonSmall> getPerson() {
        return person;
    }

    public void setPerson(List<PersonSmall> person) {
        this.person = person;
    }

    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<ModelObject> getResults() {
        return results;
    }

    public void setResults(List<ModelObject> results) {
        this.results = results;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<Movie> getMovie() {
        return movie;
    }

    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }

    public List<TheaterShowtime> getTheaterShowtimes() {
        return theaterShowtimes;
    }

    public void setTheaterShowtimes(List<TheaterShowtime> theaterShowtimes) {
        this.theaterShowtimes = theaterShowtimes;
    }

    public List<Theater> getTheater() {
        return theater;
    }

    public void setTheater(List<Theater> theater) {
        this.theater = theater;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "updated='" + updated + '\'' +
                ", page=" + page +
                ", count=" + count +
                ", totalResults=" + totalResults +
                ", results=" + results +
                ", movie=" + movie +
                ", theaterShowtimes=" + theaterShowtimes +
                ", theater=" + theater +
                ", review=" + review +
                '}';
    }
}
