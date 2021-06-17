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

    public class Person {

        private String fio; //ФИО
        private int age; //возраст
        private String position; //должность
        private String email; //email
        private String phone; //телефон
        private int salary; //зарплата

        Person(String fio, String position, String email, String phone, int salary, int age) {
            this.fio = fio;
            this.age = age;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
        }

        // Getter

        public void personInfo(){
            System.out.println("ФИО: " + fio);
            System.out.println("Возраст: " + age);
            System.out.println("Должность: " + position);
            System.out.println("email: " + email);
            System.out.println("Номер телефона: " + phone);
            System.out.println("Размер заработной платы: " + salary + " рублей");
        }

//        public String getAge() {
//            return age;
//        }


//    //Setter
//    public void setFIO(String fio) {
//        this.fio = fio;
//    }

    } //Конец описания class Person

    public static void main(String[] args) {

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Иван Козлодоев", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 35); // потом для каждой ячейки массива задаем объект
        persArray[2] = new Person("Владимир Ульянов", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40); // потом для каждой ячейки массива задаем объект
        persArray[3] = new Person("Василий Пупкин", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45); // потом для каждой ячейки массива задаем объект
        persArray[4] = new Person("Petrov Petr", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50); // потом для каждой ячейки массива задаем объект

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                System.out.println(persArray[i].age);
            }
        }
    }
}
