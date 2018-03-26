package com.gyan.springlearning.advancedwiring.profile.model;

import java.io.Serializable;
import java.util.Objects;

public class Movie implements Serializable {
    private int id;
    private String name;

    public Movie(int id, String name, String directory) {
        this.id= id;
        this.name = name;
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", directory='" + directory + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
                Objects.equals(name, movie.name) &&
                Objects.equals(directory, movie.directory);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, directory);
    }

    private String directory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
