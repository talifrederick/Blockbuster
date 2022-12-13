import java.util.Scanner;
import java.util.ArrayList;

public class blockbuster{
    static ArrayList<movies> movies = new ArrayList<movies>();
    static ArrayList<videogames> videogames = new ArrayList<videogames>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        movies FightClub = new movies("Fight Club", "used", 3.99, 10 );
        movies Coraline = new movies("Coraline", "new", 2.99, 10);
        movies ToyStory = new movies("Toy Story 1", "used", 2.99, 10);
        movies WeddingCrashers = new movies("Wedding Crashers", "new", 3.99, 10);
        movies TheConjuring = new movies("The Conjuring", "used", 3.99, 10);
        movies Elf = new movies("Elf", "new", 2.99, 10);

        videogames COD = new videogames("Call of Duty", "used", 4.99, 10);
        videogames MineCraft = new videogames("MineCraft", "new", 4.99, 10);
        videogames FortNite = new videogames("FortNite", "used", 4.99, 10);
        videogames AssassinsCreed = new videogames("Assassin's Creed", "new", 4.99, 10);
        videogames Halo = new videogames("Halo", "used", 4.99, 10);
        videogames EldenRing = new videogames("Elden Ring", "used", 4.99, 10);



        int ans = -1;
        while(ans != 0){
            System.out.println("Options:");
            System.out.println("1: Rent Movie:");
            System.out.println("2: Rent Videogame:");
            System.out.println("3: Update Order");
            System.out.println("4: List Orders");
            System.out.println("Select an option:");
            ans = sc.nextInt();
            sc.nextLine();


            if(ans==1){
                System.out.println("Pick a movie.");
                ArrayList<movies> movies = getMovies();
                String name = sc.nextLine();
                System.out.println("You will be charged extra for everyday past the return date.");
            }
        }
    }

    



}