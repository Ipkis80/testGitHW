package Lesson02;
/*
1. Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
        в противном случае – false.
        2. Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.
        3. Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        4. Написать метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз;
        5.* Написать метод, который определяет, является ли год високосным,
        и возвращает boolean (високосный - true, не високосный - false).
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/
public class HomeWork_2 {
    public static void main(String[] args) {


        System.out.println("********** ЗАДАНИЕ №1 **********");
        int a = 5;
        int b = 1;

        System.out.println(a + "+" + b + "=" + Sum_A_B(a, b)); //Напечатаем a+b=Sum
        if (CompareTwoInt(a, b)) {
            System.out.println("Cумма чисел лежит в пределах от 10 до 20 (включительно) –  true");
        } else {
            System.out.println("Cумма чисел НЕ лежит в пределах от 10 до 20 (включительно) –  false");
        }
        System.out.println("********************************");
        System.out.println();

        System.out.println("********** ЗАДАНИЕ №2 и №3 **********");
        CheckSign(5);
        CheckSign(-1);
        CheckSign(0);
        System.out.println("********************************");
        System.out.println();

        System.out.println("********** ЗАДАНИЕ №4 **********");
        printStringN("Какой-то текст", 10); //Напечатаем текст N раз
        System.out.println("********************************");
        System.out.println();

        System.out.println("********** ЗАДАНИЕ №5 **********");
        printLeapYear(1980);
        printLeapYear(2021);
        printLeapYear(400);
        printLeapYear(2100);

        System.out.println("********************************");
        System.out.println();

    }

    public static int Sum_A_B(int valueA, int valueB) { //Сумма чисел A и B
        return valueA + valueB;
    }


    public static boolean CompareTwoInt(int valueA, int valueB) {
        // метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        return Sum_A_B(valueA, valueB) >= 10 && Sum_A_B(valueA, valueB) <= 20;
    }

    public static void CheckSign(int valueA) { //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        if (Sign(valueA)) {
            System.out.println("Число " + valueA + " отрицательное");
        } else {
            System.out.println("Число " + valueA + " положительное");
        }
    }

    public static boolean Sign(int valueA) { //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        return (valueA < 0);
    }

    public static void printStringN(String text, int Numbers) {
        //метод, которому в качестве аргументов передается строка и число,
        //метод должен отпечатать в консоль указанную строку, указанное количество раз
        char dm = (char) 34;
        for (int i = 1; i <= Numbers; i++) {
            System.out.println(i + ".\t" + "Текст " + dm + text + dm + " напечатан " + Numbers + " раз");
        }
    }

    public static boolean LeapYear(int YearN) {
        //метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
        return ((YearN % 4) == 0) && ((YearN % 100) != 0) || ((YearN % 400) == 0);
    }

    public static void printLeapYear(int Year) {//Печатаем, является ли год високосным или нет
        if (LeapYear(Year)) {
            System.out.println(Year + " год - високосный");
        } else {
            System.out.println(Year + " год не является високосным");
        }
    }
}