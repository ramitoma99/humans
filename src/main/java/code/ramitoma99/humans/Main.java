package code.ramitoma99.humans;

public class Main {
  
  public static void main(String[] args){

    Gameloop humansGame = new Gameloop();

    try {

      humansGame.showStartMenu();

    } catch (Exception e) {

      e.printStackTrace();

    }
    
  }
  
}