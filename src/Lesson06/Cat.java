package Lesson06;
import models.Animal;

public class Cat extends Animal {

    private String catName =  "Кошка";
    private static int catMaxRunDistance = 200;
    private static int catMaxSwimDistance = 0;

    private static int catsCount = 0;


    public Cat(String nickname) {
        super(nickname);
        this.name = catName;
        this.maxRunDistance = catMaxRunDistance;
        this.maxSwimDistance = catMaxSwimDistance;
        catsCount += 1;
    }
    public Cat(String nickname, int maxRunDistance, int maxSwimDistance) {
        super(nickname);
        this.name = catName;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        catsCount += 1;
    }
    public Cat(String nickname, String sex, int age){
        super(nickname, sex, age);
        this.name = catName;
        this.maxRunDistance = catMaxRunDistance;
        this.maxSwimDistance = catMaxSwimDistance;

        catsCount += 1;
    }
    public Cat(String nickname, String sex){
        super(nickname, sex);
        this.name = catName;
        this.maxRunDistance = catMaxRunDistance;
        this.maxSwimDistance = catMaxSwimDistance;

        catsCount += 1;
    }

//    @Override
//    public void run(int distance) { //Бег
//        if (distance > 0 && distance <= maxRunDistance)   {
//            System.out.println(name + " " + this.nickname + " пробежал[а] " + distance + " метров");
//        } else if (distance > this.maxRunDistance) {
//            System.out.println(name + " " + this.nickname + " пробежал[а] " + maxRunDistance + " метров" + " и дальше " +
//                    "бежать не может");
//        } else System.out.println(name + " " + this.nickname + " говорит, что с дистанцией что-то не так");
//
//    }



    @Override
    public void swim(int distance) { //Плавание
        System.out.println(name + " " + nickname + " говорит, что не умеет плавать");

    }
//    @Override
    public static int getAnimalCount() {return Cat.catsCount;}
    //Не совсем понятно, почему не работает Override?

}

