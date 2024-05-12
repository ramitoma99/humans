package code.ramitoma99.humans;

import java.util.Scanner;

public class Gameloop {

    World mainWorld = new World();
    boolean running = true;

    public void showStartMenu() {

        while (running) {

            this.showOptions();
            this.runOption();

        }
    }

    public void showOptions() {

        System.out.println("--- Welcome to Humans! ---");
        System.out.println("--- init to set up world -");
        System.out.println("--- hi to make new human -");
        System.out.println("--- enter to enter world -");
        System.out.println("--- humans to list humans-");
        System.out.println("--- worlds to list worlds-");
        System.out.println("--- exit to exit Humans  -");
        System.out.println("--------------------------");

    }

    public void runOption() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an option: ");
        String response = scanner.nextLine();

        switch (response) {
            case "init":
                this.initializeWorld();
                break;
            case "hi":
                this.createHuman();
                break;
            case "enter":
                this.enterWorld();
                break;
            case "humans":
                mainWorld.getHumans();
                break;
            case "worlds":
                mainWorld.getWorlds();
                break;
            case "exit":
                running = false;
                break;
        }

    }

    public void initializeWorld() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the world size: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        mainWorld.initializeWorldMap(size);

    }

    public void createHuman() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter name to enter world: ");
        String playername = scanner.nextLine();

        System.out.print("Please enter age: ");
        int playerage = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter gender: ");
        String playergender = scanner.nextLine();

        System.out.print("Please enter position x: ");
        int playerpositionx = scanner.nextInt();

        System.out.print("Please enter position y: ");
        int playerpositiony = scanner.nextInt();

        try {
            mainWorld.addHuman(playername, playerage, playergender, playerpositionx, playerpositiony);
            System.out.println("Human " + playername + " created!");
        } catch (Exception e) {
            System.out.println("Error making the human!");
            e.printStackTrace();
        }

    }

    public void enterWorld() {

        mainWorld.setPlayersOnMap();
        mainWorld.displayWorld();

    }

}
