package code.ramitoma99.humans;

import java.util.UUID;

public class Human {

    String name;
    String gender;
    int age;
    int x;
    int y;
    String humanID;



    public Human(String name, int age, String gender, int x, int y) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.x = x;
        this.y = y;

    }

    @Override public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Position: (" + x + ", " + y + ")";
    }

    public void generateHumanID () {

        this.humanID = UUID.randomUUID().toString();

    }

}