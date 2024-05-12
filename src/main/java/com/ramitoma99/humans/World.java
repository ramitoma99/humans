package com.ramitoma99.humans;

import java.util.ArrayList;
import java.util.List;

public class World {

    List<Human> humanList = new ArrayList<>();
    List<WorldArea[][]> worldMap = new ArrayList<>();

        public void initializeWorldMap(int size) {

        WorldArea[][] worldArea = new WorldArea[size][size];

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                worldArea [x][y] = new WorldArea('.');
            }
        }

        worldMap.add(worldArea);

    }

    public void addHuman(String name, int age, String gender, int x, int y) {

        Human human = new Human(name, age, gender, x, y);

        human.generateHumanID();

        humanList.add(human);

    }

    public void getHumans() {

        int humanCount = humanList.size();

        System.out.println("Currently, there are " + humanCount + " Humans");

        for (Human human : humanList) {
            System.out.println("There is: " + human);
        }

    }

    public void displayWorld() {

      int size = worldMap.getFirst().length;

      for (int y = 0; y < size; y++) {
          for (int x = 0; x < size; x++) {
              System.out.print(worldMap.getFirst()[x][y].getTileContent());
          }

          System.out.println();
      }

    }

    public void setPlayersOnMap() {

        for (Human human : humanList) {

            System.out.println("im in the human loop");

            char firstInit = Character.toUpperCase(human.name.charAt(0));

            try {
                worldMap.getFirst()[human.x][human.y].setTileContent(firstInit);
                worldMap.getFirst()[human.x][human.y].increaseTileUsers();
            } catch (Exception e) {
                System.out.println("Error! Human is outside the map");
            }

            for (int x = 0; x < worldMap.getFirst()[0].length; x ++) {
                for (int y = 0; y <worldMap.getFirst()[1].length; y++) {
                    if (worldMap.getFirst()[x][y].getTileUsersCount() > 1 ){
                        worldMap.getFirst()[x][y].setTileContent('@');
                    }
                }
            }

        }

    }

    public void getWorlds(){
        for (int mapIndex = 0; mapIndex < worldMap.size(); mapIndex++) {
            System.out.println("Area: " + mapIndex);
            System.out.println("Size: " + worldMap.get(mapIndex).length * worldMap.get(mapIndex)[0].length);
        }
    }

}