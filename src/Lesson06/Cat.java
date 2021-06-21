package Lesson06;
import models.Animal;

public class Cat extends Animal {

    protected static String name =  "Кошка";
    protected static int maxRunDistance = 200;
    protected static int maxSwimDistance = 0;



    private static int catsCount = 0;

    public Cat(String nickname) {
        super(nickname);
        catsCount += 1;
    }
    public Cat(String nickname, String sex, int age){
        super(nickname, sex, age);
        catsCount += 1;
    }
    public Cat(String nickname, String sex){
        super(nickname, sex);
        catsCount += 1;
    }

    @Override
    public void run(int distance) { //Бег
        if (distance > 0 && distance <= maxRunDistance)   {
            System.out.println(name + " " + this.nickname + " пробежал[а] " + distance + " метров");
        } else if (distance > this.maxRunDistance) {
            System.out.println(name + " " + this.nickname + " пробежал[а] " + maxRunDistance + " метров" + " и дальше " +
                    "бежать не может");
        } else System.out.println(name + " " + this.nickname + " говорит, что с дистанцией что-то не так");

    }



    @Override
    public void swim(int distance) { //Плавание
        System.out.println(name + " " + nickname + " говорит, что не умеет плавать");

    }
//    @Override
    public static int getAnimalCount() {return Cat.catsCount;}
    //Не совсем понятно, почему не работает Override?

//    public String getName() {
//        return this.name
//    }
//    public String getNickName() {
//        return this.nickname
//    }
}

