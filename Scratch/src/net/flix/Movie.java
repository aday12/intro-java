package net.flix;

public class Movie {
    //fields or attributes
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    //constructors or ctor, called when client says "new"

    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear) {
        this(title);                    //delegate to 1-arg string ctor for title
        setReleaseYear(releaseYear);    //handle releaseYear here by delegating to its setter
    }

    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title, releaseYear); //delegate to ctor above for title, releaseYear
        setRevenue(revenue);      //handle revenue here, by delegating to its setter
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue);
        setRating(rating);
        setGenre(genre);
    }

    //business or action methods

    //accessor methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //TODO: make so if revenue is null you use %s, else use %,.2f. HINT: If rev = null use %s else use %,.2f
    @Override
    public String toString() {
        String revFormat = (getRevenue() == null) ? "%s" : "%,.2f";
        return revFormat;

//        return String.format("Movie: title= %s, releaseYear= %s, revenue= " + revFormat +", rating= %s, genre= %s"),
//         getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre();
    }
}
