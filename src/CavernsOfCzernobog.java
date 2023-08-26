// util imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
        Player player = new Player(scanner.nextLine(), 50, 5);

        // TODO : Actually make the damn game.
        // Plans for an ending: The player gets through all encounters (maybe make it a roguelike? Or could have maze
        // Or, the player dies, in which case they get a 'score'

        // One thing I'd like to do : generate a whole bunch of graphical elements. Basically, have a 'view' package

        ArrayList<Encounter> encounters = new ArrayList<>();
        encounters.add(new Encounter());

        for (Encounter currentEncounter : encounters) {
            // TODO currentEncounter.run();
            if (!player.isAlive()) {
                //TODO View.defeat();
                break;
            }
        }
        //if (player.isAlive()) {
            //TODO View.victory();
        //}


    }
}
