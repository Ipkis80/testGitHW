package Lesson05;

 /**
 * Created by Kirill Ivushkin
 * Date: 11.06.2021
*/

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 *
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class HomeWork_5 {

    public static void main(String[] args) {

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов

        persArray[0] = new Person("Ivanov Ivan", "Директор", "ivivan@mailbox.com", "89237777777", 350000, 30);
        persArray[1] = new Person("Иван Козлодоев", "Project manager", "kozel@mailbox.com", "892312312323", 100000, 35);
        persArray[2] = new Person("Владимир Ульянов", "Middle", "Lenin@mailbox.com", "89231457896", 80000, 40);
        persArray[3] = new Person("Василий Пупкин", "Технический директор", "vasya@mailbox.com", "89231112233", 200000, 45);
        persArray[4] = new Person("Petrov Petr", "Senior", "petrov@mailbox.com", "89233331122", 150000, 50);

        for (int i = 0; i < persArray.length; i++) { //Выведем информацию только о сотрудниках старше 40 лет.
            if (persArray[i].getAge() > 40) persArray[i].info();
        }

        //Эксперименты
        persArray[1].setSalary(90000); //Установим новую ЗП сотруднику
        persArray[1].printSalary();

        persArray[4].setSalary(180000);//Установим новую ЗП сотруднику
        System.out.println("Новая ЗП = " + persArray[4].getSalary());
    }
}
