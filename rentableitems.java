import java.util.ArrayList;

public class rentableitems {

    private ArrayList<movies> movies;
    private ArrayList<videogames> videogames;
    private int numOfItems;
    private static int totalOrders= 0;
    private int orderNumber;

    public rentableitems(ArrayList<movies> movies){
        this.movies = movies;
        totalOrders++;
        this.orderNumber = totalOrders;


    }
    public rentableitems(ArrayList<videogames> videogames){
        this.videogames = videogames;
        totalOrders++;
        this.orderNumber = totalOrders;
    }

    public rentableitems(){
        totalOrders++;
        this.orderNumber = totalOrders;
        movies = new ArrayList<>();
        videogames = new ArrayList<>();

    }

    public ArrayList<movies> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<movies> movies) {
        this.movies = movies;
    }
    public ArrayList<videogames> getVideoGames() {
        return videogames;
    }

    public void setVideoGames(ArrayList<videogames> videogames) {
        this.videogames = videogames;
    }

    public int getNumOfItems() {
        return numOfItems;
    }
    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    



}
