package net.flix;

public enum Genre {
    COMEDY("Comedy :D"),
    ACTION("Action!!!"),
    ANIME("Anime"),
    HISTORICAL("History"),
    SPORTS_ROMANCE("SpOrTs RoMaNcE"),
    WESTERN("Western");

    //create the var
    //everything under here is regular class definition stuff: fields ctors & methods
    private final String display; //dont have to say final but stops user from changing field, no setter.
    // best practice to add "final"

    //ctor
    Genre(String display){      //automatically private
        this.display = display;
        //System.out.println("Genre ctor called"); ctor is called 6 times because there are 6 objects
    }

    //getter(s)
    public String display(){    //getter without "get"
        return display;
    }

    @Override
    public String toString() {
        return display();       //generally better to call your own getter
    }
}
