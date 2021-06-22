package Lesson06;
import models.Animal;

public class Dog extends Animal {

    private static String dogName =  "Собака";
    private static int dogMaxRunDistance = 500;
    private static int dogMaxSwimDistance = 10;

    private static int dogsCount = 0;

    public Dog() {
        super();
        this.name = dogName;
        this.maxRunDistance = dogMaxRunDistance;
        this.maxSwimDistance = dogMaxSwimDistance;
        dogsCount += 1;
    }

    public Dog(String nickname, int maxRunDistance, int maxSwimDistance) {
        super(nickname);
        this.name = dogName;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;

        dogsCount += 1;
    }
    public Dog(String nickname, String sex, int age){
        super(nickname, sex, age);
        this.name = dogName;
        this.maxRunDistance = dogMaxRunDistance;
        this.maxSwimDistance = dogMaxSwimDistance;

        dogsCount += 1;
    }
    public Dog(String nickname, String sex){
        super(nickname, sex);
        this.name = dogName;
        this.maxRunDistance = dogMaxRunDistance;
        this.maxSwimDistance = dogMaxSwimDistance;

        dogsCount += 1;
    }

//    @Override
//    public void run(int distance) { //Бег
//        if (distance > 0 && distance <= this.maxRunDistance)   {
//            System.out.println(name + " " + this.nickname + " пробежал[а] " + distance + " метров");
//        } else if (distance > this.maxRunDistance) {
//            System.out.println(name + " " + this.nickname + " пробежал[а] " + maxRunDistance + " метров" + " и дальше " +
//                    "бежать не может");
//        } else System.out.println(name + " " + this.nickname + " говорит, что с дистанцией что-то не так");
//
//    }



//    @Override
//    public void swim(int distance) { //Плавание
//        if (distance > 0 && distance <= this.maxSwimDistance)   {
//            System.out.println(name + " " + this.nickname + " проплыл[а] " + distance + " метров");
//        } else if (distance > this.maxSwimDistance) {
//            System.out.println(name + " " + nickname + " проплыл[а] " + maxSwimDistance + " метров" + ", больше не может");
//        } else System.out.println(name + " " + this.nickname + " говорит, что с дистанцией что-то не так");
//    }
//    @Override
    public static int getAnimalCount() {return Dog.dogsCount;}

}
