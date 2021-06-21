package Lesson06;
import models.Animal;

public class Dog extends Animal {

    protected static String name =  "Собака";

    protected static int maxRunDistance = 500;
    protected static int maxSwimDistance = 10;

    private static int dogsCount = 0;

    public Dog() {
        super();
        dogsCount += 1;
    }

    public Dog(String nickname) {
        super(nickname);
        dogsCount += 1;
    }
    public Dog(String nickname, String sex, int age){
        super(nickname, sex, age);
        dogsCount += 1;
    }
    public Dog(String nickname, String sex){
        super(nickname, sex);
        dogsCount += 1;
    }

    @Override
    public void run(int distance) { //Бег
        if (distance > 0 && distance <= this.maxRunDistance)   {
            System.out.println(name + " " + this.nickname + " пробежал[а] " + distance + " метров");
        } else if (distance > this.maxRunDistance) {
            System.out.println(name + " " + this.nickname + " пробежал[а] " + maxRunDistance + " метров" + " и дальше " +
                    "бежать не может");
        } else System.out.println(name + " " + this.nickname + " говорит, что с дистанцией что-то не так");

    }



    @Override
    public void swim(int distance) { //Плавание
        if (distance > 0 && distance <= this.maxSwimDistance)   {
            System.out.println(name + " " + this.nickname + " проплыл[а] " + distance + " метров");
        } else if (distance > this.maxSwimDistance) {
            System.out.println(name + " " + nickname + " проплыл[а] " + maxSwimDistance + " метров" + ", больше не может");
        } else System.out.println(name + " " + this.nickname + " говорит, что с дистанцией что-то не так");
    }
//    @Override
    public static int getAnimalCount() {return Dog.dogsCount;}

}
