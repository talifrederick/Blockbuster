import java.util.ArrayList;

public class rentableitems {
    private String name;
    private String condition;
    private double rentFee;
    private String returnBy;
    private ArrayList<Movie> movies;
    private ArrayList<Videogame> videogames;
   // private int numOfItems;
   // private static int totalOrders= 0;
    //private int orderNumber;




    public rentableitems(String name, String condition, double rentFee, String returnBy){
        this.name = name;
        this.condition = condition;
        this.rentFee= rentFee;
        this.returnBy = returnBy;
       

    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }




    public String getCondition() {
        return condition;
    }




    public void setCondition(String condition) {
        this.condition = condition;
    }




    public double getRentFee() {
        return rentFee;
    }




    public void setRentFee(double rentFee) {
        this.rentFee = rentFee;
    }




    public String getReturnBy() {
        return returnBy;
    }




    public void setReturnBy(String returnBy) {
        this.returnBy = returnBy;
    }




    public ArrayList<Movie> getMovies() {
        return movies;
    }




    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }




    public ArrayList<Videogame> getVideogames() {
        return videogames;
    }




    public void setVideogames(ArrayList<Videogame> videogames) {
        this.videogames = videogames;
    }

    public String toString(){
        return " Name: " + name + " Condition: " + condition + " Rent Fee: " + getRentFee()+ " Return within: " + returnBy;
    }

    
    



}
