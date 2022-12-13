import java.util.Scanner;
import java.util.ArrayList;

public class blockbuster{
    static ArrayList<movies> movies = new ArrayList<movies>();
    static ArrayList<videogames> videogames = new ArrayList<videogames>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        movies FightClub = new movies("Fight Club", "used", 3.99, 10 );




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
        }
    }

    



}