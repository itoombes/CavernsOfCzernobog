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

        // Set up player and creates the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter your name: ");
        Player player = new Player(scanner.nextLine());

        // TODO : Actually make the damn game.
        // Plans for an ending: The player gets through all encounters (maybe make it a roguelike? Or could have maze
        // Or, the player dies, in which case they get a 'score'

        // One thing I'd like to do : generate a whole bunch of graphical elements. Basically, have a 'view' package
    }
}
