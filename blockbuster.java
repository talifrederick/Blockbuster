import java.util.Scanner;
import java.util.ArrayList;

public class blockbuster{
    static ArrayList<Movie> movies = new ArrayList<>();
    static ArrayList<Videogame> videogames = new ArrayList<>();
    //static ArrayList<rentableitems> itemschosen = new ArrayList<rentableitems>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        Movie FightClub = new Movie("Fight Club", "used", 3.99, "10 days", "Action", "R" );
        Movie Coraline = new Movie("Coraline", "new", 2.99, "10 days", "Dark fantasy", "PG");
        Movie ToyStory = new Movie("Toy Story 1", "used", 2.99, "7 days", "Comedy/Children's movie", "PG");
        Movie WeddingCrashers = new Movie("Wedding Crashers", "new", 3.99, "10 days", "Comedy", "R");
        Movie TheConjuring = new Movie("The Conjuring", "used", 3.99, "6 days", "Horror", "R");
        Movie Elf = new Movie("Elf", "new", 2.99, "7 days", "Comedy/ Christmas", "PG");

        Videogame COD = new Videogame("Call of Duty", "used", 4.99, "2 weeks", "PC");
        Videogame MineCraft = new Videogame("MineCraft", "new", 4.99, "2 weeks", "All");
        Videogame FortNite = new Videogame("FortNite", "used", 4.99, "10 days", "Xbox");
        Videogame AssassinsCreed = new Videogame("Assassin's Creed", "new", 4.99, "20 days", "Ps5/Xbox");
        Videogame Halo = new Videogame("Halo", "used", 4.99, "2 weeks", "PC");
        Videogame EldenRing = new Videogame("Elden Ring", "used", 4.99, "7 days", "Ps5");

        movies.add(FightClub);
        movies.add(Coraline);
        movies.add(ToyStory);
        movies.add(WeddingCrashers);
        movies.add(TheConjuring);
        movies.add(Elf);
        videogames.add(COD);
        videogames.add(MineCraft);
        videogames.add(FortNite);
        videogames.add(AssassinsCreed);
        videogames.add(Halo);
        videogames.add(EldenRing);




        int ans = -1;
        while(ans != 0){
            System.out.println("Options:");
            System.out.println("1: Search Movie:");
            System.out.println("2: Search Videogame:");
            System.out.println("3: Add item");
            System.out.println("4: Remove item");
            System.out.println("Select an option:");
            ans = sc.nextInt();
            sc.nextLine();


            if(ans==1){
                System.out.println("Enter name of movie");
                String name = sc.nextLine();
                boolean notFound = true;
                for(Movie movie: movies){
                    if(name.equals(movie.getName())){
                        System.out.println(movie);
                        notFound =false;
                    }
                    

                }
                if(notFound){
                    System.out.println("This store does not currently have that movie in stock.");
                }
                
                
            }

            if(ans == 2){
                System.out.println("Enter name of videogame");
                String name = sc.nextLine();
                boolean notFound = true;
                for(Videogame videogame: videogames){
                    if(name.equals(videogame.getName())){
                        System.out.println(videogame);
                        notFound =false;
                    }
                    

                }
                if(notFound){
                    System.out.println("This store does not currently have that game in stock.");
                }
                
            }

            if(ans ==3){
                System.out.println("1: Add movie");
                System.out.println("2: Add videogame");
                System.out.println("Select an option:");
                ans = sc.nextInt();
                sc.nextLine();
                
                if(ans ==1){
                    System.out.println("What movie would you like to add to the store?");
                    String name = sc.nextLine();
                    System.out.println("What condition is it in?");
                    String condition = sc.nextLine();
                    System.out.println("What is the rent fee?"); 
                    double rentFee = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("What is the amount of days it should be returned within?");
                    String returnBy = sc.nextLine();
                    System.out.println("What is the genre?");
                    String genre = sc.nextLine();
                    System.out.println("What is the movie rated");
                    String rated = sc.nextLine();

                    Movie m = new Movie(name, condition, rentFee, returnBy, genre, rated);
                    movies.add(m);
                    System.out.println("Your movie has been added.");

                }

                if(ans == 2){
                    System.out.println("What game would you like to add to the store?");
                    String name = sc.nextLine();
                    System.out.println("What condition is it in?");
                    String condition = sc.nextLine();
                    System.out.println("What is the rent fee?"); 
                    double rentFee = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("What is the amount of days it should be returned within?");
                    String returnBy = sc.nextLine();
                    System.out.println("What is are the gaming platforms it can be played on?");
                    String gamingDevice = sc.nextLine();

                    Videogame m = new Videogame(name, condition, rentFee, returnBy, gamingDevice);
                    videogames.add(m);
                    System.out.println("Your game has been added.");
                   

                }

                
            }

            if( ans ==4){
                System.out.println("1: Remove movie");
                System.out.println("2: Remove videogame");
                System.out.println("Select an option:");
                ans = sc.nextInt();
                sc.nextLine();

                if(ans == 1){
                    System.out.println(movies);
                    System.out.println("Which would you like to remove?");
                    ans = sc.nextInt();
                    sc.nextLine();

                    movies.remove(ans);
                    System.out.println(movies);
                    System.out.println( "**The movie has been removed from the store**");
                }

                if(ans == 2){
                    System.out.println(videogames);
                    System.out.println("Which would you like to remove?");
                    ans = sc.nextInt();
                    sc.nextLine();

                    videogames.remove(ans);
                    System.out.println(videogames);
                    System.out.println( "**The game has been removed from the store**");
                }
            }
        }
    }

    



}