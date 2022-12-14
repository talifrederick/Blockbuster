public class Movie extends rentableitems {

    private String genre;
    private String rated;

    public Movie(String name, String condition, double rentFee, String returnBy, String genre, String rated){
        super(name, condition, rentFee, returnBy);
        this.genre = genre;
        this.rated = rated;

    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRated() {
        return rated;
    }

    public double getRentFee(){
        if(rated.equals("R")){
            return super.getRentFee() + 1;
        }
        return super.getRentFee();
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String toString(){
        return super.toString() + " Genre: " + genre + " Rated: " + rated;
    }

    

    

    
}
