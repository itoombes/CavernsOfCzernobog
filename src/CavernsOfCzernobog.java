// Scanner import
import java.util.Scanner;

// Import the packages of the project
import itoombes.caverns.*;
//import itoombes.caverns.entities.*;
//import itoombes.caverns.items.weapons.*;
//import itoombes.caverns.items.spells.*;

public class CavernsOfCzernobog {
    public static void main(String[] args) {
        // Generate title
        System.out.println("I dare ye enter...");
        TitleGen.display();

        // Ask player name
        // TODO : Highscore functionality
        System.out.println("\nCurrent high-score: 0");

        // Set up player and user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nEnter your name:");
        Player player = new Player(scanner.nextLine());

        // TODO: Testing
        System.out.println(player.getName());
    }
}
