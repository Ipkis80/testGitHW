package models;


public  class Animal {

    protected static int maxRunDistance = 1000;
     static int maxSwimDistance = 100;

    protected static String name = "Животное";
    protected  String nickname = "";
    protected String sex; //  male, female
    protected int age;
    private static int animalCount;

    public Animal(){
        animalCount += 1;
    }
    public Animal(String name, String nickname, String sex, int age){
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;

        animalCount += 1;
    }
    public Animal(String nickname, String sex, int age){
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;
        animalCount += 1;
    }

    public Animal(String nickname, String sex){
        this.nickname = nickname;
        this.sex = sex;
        animalCount += 1;
    }
    public Animal(String nickname){
        this.nickname = nickname;
        animalCount += 1;
    }

    public void run(int distance) { //Бег
        if (distance > 0 && distance <= this.maxRunDistance)   {
            System.out.println(name + " " + this.nickname + " пробежал[а] " + distance + " метров");
        } else if (distance > this.maxRunDistance) {
            System.out.println(name + " " + this.nickname + " пробежал[а] " + maxRunDistance + " метров" + " и дальше " +
                    "бежать не может");
        } else System.out.println(name + " " + this.nickname + " говорит, что с дистанцией что-то не так");

    }

    public void swim(int distance) { //Плавание
        if (distance > 0 && distance <= this.maxSwimDistance)   {
            System.out.println(name + " " + this.nickname + " проплыл[а] " + distance + " метров");
        } else if (distance > this.maxSwimDistance) {
            System.out.println(name + " " + nickname + " проплыл[а] " + this.maxSwimDistance + " метров" + ", больше не может");
        } else System.out.println(name + " " + this.nickname + " говорит, что с дистанцией что-то не так");

    }

    public String getName()  {return this.name;}
    public String getNickname() {return this.nickname;}
    public static int getAnimalCount() {return Animal.animalCount;}



}
