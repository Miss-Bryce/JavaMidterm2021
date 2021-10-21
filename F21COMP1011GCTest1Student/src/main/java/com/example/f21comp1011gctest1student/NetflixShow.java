package com.example.f21comp1011gctest1student;

public class NetflixShow {
    //All the variables we'll need
    String showId;
    String type;
    String title;
    String rating;
    String director;
    String cast;


    //getters
    public String getShowId() {
        return showId;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }


    //Setters, where validation will be/is
    public void setShowId(String showId) {
        if (showId.startsWith("S") && showId.contains("\\d+")) {
            this.showId = showId;
        }
        else {
            System.out.println("Show ID must start with an S and contain numbers.");
        }
    }

    public void setType(String type) {
        if (type.matches("[M-m]ovie")|| type.matches("[T-t][V-v] [S-s]how")) {
            this.type = type;
        }
        else {
            System.out.println("Type must be one of the following: Movie or TV Show.");
        }
    }

    public void setTitle(String title) {
        if (title.length() > 1) {
            this.title = title;
        }
        else {
            System.out.println("Title must be at least two characters long.");
        }
    }

    public void setRating(String rating) {
        if (rating.matches("[P-p][G-g]-13") || rating.matches("[R-r]") ||
                rating.matches("[T-t][V-v]-14") || rating.matches("[T-t][V-v]-[G-g]") ||
                rating.matches("[T-t][V-v]-[M-m][A-a]") || rating.matches("[T-t][V-v]-[Y-y]")||
                rating.matches("[T-t][V-v]-[Y-y]7")) {
            this.rating = rating;
        }
        else {
            System.out.println("The Rating much match one of the following types: PG-13, R, TV-14, TV-G, TV-MA, TV-Y, or TV-Y7");
        }
    }

    public void setDirector(String director) {
        if (director.length() > 1) {
            this.director = director;
        }
        else {
            System.out.println("Director must be at least two characters long.");
        }
    }

    public void setCast(String cast) {
        if (cast.length() > 4) {
            this.cast = cast;
        }
        else {
            System.out.println("Cast must be at least five characters long.");
        }
    }

}
