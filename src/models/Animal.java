package models;


public  class Animal {

    private static int MaxRunDistance = 1000;
    private static int MaxSwimDistance = 100;
    private static String animalName = "Животное";

    protected String name;
    protected  String nickname = "";
    protected String sex; //  male, female
    protected int age;

    protected int maxRunDistance;
    protected int maxSwimDistance;

    private static int animalCount;

    public Animal(){
        setSkillsToDefault(animalName,MaxRunDistance,MaxSwimDistance);
        animalCount += 1;
    }
    public Animal(String nickname){
        setSkillsToDefault(animalName,MaxRunDistance,MaxSwimDistance);
        this.nickname = nickname;
        animalCount += 1;
    }
    public Animal(String nickname, String sex){
        setSkillsToDefault(animalName,MaxRunDistance,MaxSwimDistance);
        this.nickname = nickname;
        this.sex = sex;
        animalCount += 1;
    }
    public Animal(String nickname, String sex, int age){
        setSkillsToDefault(animalName,MaxRunDistance,MaxSwimDistance);
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;
        animalCount += 1;
    }
    public Animal(String name, String nickname, String sex, int age){
        setSkillsToDefault(animalName,MaxRunDistance,MaxSwimDistance);
        this.name = name;
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;
//        this.maxRunDistance = animalMaxRunDistance;
//        this.maxSwimDistance = animalMaxSwimDistance;

        animalCount += 1;
    }
    public Animal(String nickname, int maxRunDistance, int maxSwimDistance){
        setSkillsToDefault(animalName,MaxRunDistance,MaxSwimDistance);
        this.nickname = nickname;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount += 1;
    }


    public void run(int distance) { //Бег
        if (distance <= this.maxRunDistance)   {
            System.out.println(name + " " + this.nickname + " пробежал[а] " + distance + " метров");
        } else {
            System.out.println(this.name + " " + this.nickname + " пробежал[а] " + this.maxRunDistance + " метров" + " и дальше " + "бежать не может");
        }
    }
    public void swim(int distance) { //Плавание
        if (distance <= this.maxSwimDistance) {
            System.out.println(this.name + " " + this.nickname + " проплыл[а] " + distance + " метров");
        } else {
            System.out.println(this.name + " " + this.nickname + " проплыл[а] " + this.maxSwimDistance + " метров" + ", больше не может");
        }
    }

    public String getName()  {return this.name;}
    public String getNickname() {return this.nickname;}
    public static int getAnimalCount() {return Animal.animalCount;}

    protected void setSkillsToDefault(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }


}
