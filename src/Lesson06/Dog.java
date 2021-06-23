package Lesson06;
import models.Animal;

public class Dog extends Animal {

    private static String dogName =  "Собака";
    private static int dogMaxRunDistance = 500;
    private static int dogMaxSwimDistance = 10;

    private static int dogsCount = 0;

    public Dog() {
        super();
        setSkillsToDefault(dogName, dogMaxRunDistance, dogMaxSwimDistance);
        dogsCount += 1;
    }

    public Dog(String nickname, int maxRunDistance, int maxSwimDistance) {
        super(nickname, maxRunDistance, maxSwimDistance);
        this.name = dogName;

        dogsCount += 1;
    }
    public Dog(String nickname, String sex, int age){
        super(nickname, sex, age);
        setSkillsToDefault(dogName, dogMaxRunDistance, dogMaxSwimDistance);
        dogsCount += 1;
    }
    public Dog(String nickname, String sex){
        super(nickname, sex);
        setSkillsToDefault(dogName, dogMaxRunDistance, dogMaxSwimDistance);
        dogsCount += 1;
    }

//    @Override
    public static int getAnimalCount() {return Dog.dogsCount;}

}
