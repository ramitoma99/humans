package code.ramitoma99.humans;

public class Human {

    String name;
    int age;
    String gender;
    int x;
    int y;

    public Human(String name, int age, String gender, int x, int y) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.x = x;
        this.y = y;

    }

    public void eating() {

        System.out.println(this.name + "is eating nom nom nom");

    }

    @Override public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Position: (" + x + ", " + y + ")";
    }


}