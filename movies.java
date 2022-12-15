public class movies extends rentableitems {

    private String genre;
    private String rated;

    public movies(String name, String condition, double rentFee, String returnBy, String genre, String rated){
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

    public void setRated(String rated) {
        this.rated = rated;
    }

    

    

    
}
