package Lesson06;

import models.Animal;

/**
 * Created by Kirill Ivushkin
 * Date: 11.06.2021
 */

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
 плавание: кот не умеет плавать, собака 10 м.).
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */


public class HomeWork_6 {

    public static void main(String[] args) {

        Animal RatEmil = new Animal("Крыса","Эмиль","male", 2);
        Animal HamsterRino = new Animal("Хомячок","Рино","male",1);
        Animal Pig = new Animal("Пятачок");

        Animal animals[] = {
                RatEmil,
                HamsterRino,
                Pig,
                new Dog("Тузик", "male"),
                new Cat("Барсик", "male", 2 ),
                new Dog("Люси", "female", 3),
                new Cat("Маруся", "female"),
                new Dog(), //какая-то собака
                new Animal() //какое-то животное
        };


        for (int i = 0; i < animals.length; i++) { //Выводим всех последовательно на печать
            System.out.println(i+1 + ". "+ animals[i].getName() + " " + animals[i].getNickname());
        }

        System.out.println("Общее число животных равно: " + Animal.getAnimalCount());
        System.out.println("Число кошек равно: " + Cat.getAnimalCount());
        System.out.println("Число собак равно: " + Dog.getAnimalCount());


        allAnimalsSwim(animals, 100);//Все поплыли
        System.out.println();
        allAnimalsRun(animals, 600);

    } //Конец main

    public static void allAnimalsSwim(Animal[] animals, int distance){
        System.out.println("Заплыв на " + distance + " метров.");
        for (int i = 0; i < animals.length; i++) { //Все поплыли
            if (animals[i] instanceof Cat){
                ((Cat)animals[i]).swim(distance);
            } else if (animals[i] instanceof Dog){
                ((Dog)animals[i]).swim(distance);
            } else {
                animals[i].swim(distance);
            }
        }
    }
    public static void allAnimalsRun(Animal[] animals, int distance){
        System.out.println("Забег на " + distance + " метров.");
        for (int i = 0; i < animals.length; i++) { //Все побежали
            if (animals[i] instanceof Cat){
                ((Cat)animals[i]).run(distance);
            } else if (animals[i] instanceof Dog){
                ((Dog)animals[i]).run(distance);
            } else {
                animals[i].run(distance);
            }
        }
    }
}

