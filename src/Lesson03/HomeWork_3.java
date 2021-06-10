package Lesson03;

import java.util.Random;

public class HomeWork_3 {

    public static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("********** ЗАДАНИЕ №1 **********");
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1}; //Определим массив

        for (int i = 0; i < a.length; i++) { //Распечатаем исходный массив для наглядности
            System.out.print(a[i] + " | ");
        }
        System.out.println(); //Перенос строки

        for (int i = 0; i < a.length; i++) { //Преобразуем, поменяем 0 на 1, и 1 на 0, напечатаем массив
            a[i] = -1 * (a[i] - 1); //Если 0: (-1*(0-1)=1; Если 1: -1*(1-1)=-1*0=0
            System.out.print(a[i] + " | ");
        }
        System.out.println(); //Перенос строки
        System.out.println("********************************");
        System.out.println();

        System.out.println("********** ЗАДАНИЕ №2 **********");
        //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] a2 = new int[100];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = i + 1;
            System.out.print(a2[i] + " | ");
        }
        System.out.println(); //Перенос строки
        System.out.println("********************************");
        System.out.println();


        System.out.println("********** ЗАДАНИЕ №3 **********");
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] a3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a3.length; i++) { //Распечатаем массив для наглядности
            System.out.print(a3[i] + " \t| ");
        }
        System.out.println(); //Перенос строки

        for (int i = 0; i < a3.length; i++) {//Если элемент < 6 - умножим на 2 и распечатаем
            if (a3[i] < 6) {
                a3[i] *= 2;
            }
            System.out.print(a3[i] + " \t| ");
        }
        System.out.println(); //Перенос строки
        System.out.println("********************************");
        System.out.println();


        System.out.println("********** ЗАДАНИЕ №4 **********");
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] a4 = new int[7][7];
        for (int i = 0; i < a4.length; i++) {
            for (int j = 0; j < a4[i].length; j++) {
                if ((i == j) || (i + j + 1) == a4.length) { //обратная диагональ строим: сумма координат = размеру таблицы
                    a4[i][j] = 1;
                }

                System.out.print(a4[i][j] + "\t");
            }
            System.out.println(); //Перенос строки

        }
        System.out.println(); //Перенос строки
        System.out.println("********************************");
        System.out.println();


        System.out.println("********** ЗАДАНИЕ №5 **********");
        //Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue;

        int[] a5 = fillArrayFor_5(8, 9); //Инициальзируем массив из метода fillArrayFor_5
        for (int i = 0; i < a5.length; i++) { // Распечатаем для наглядности
            System.out.print(a5[i] + "\t");
        }
        System.out.println(); //Перенос строки
        System.out.println("********************************");
        System.out.println();//Конец Задания №5


        System.out.println("********** ЗАДАНИЕ №6 **********");
        //* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

        int[] a6 = new int[20]; // Массив из 20 элементов
        for (int i = 0; i < a6.length; i++) {
            a6[i] = random.nextInt(100); //Заполним случайными числами от 0 до 100
            System.out.print(a6[i] + "\t"); // Распечатаем массив
        }
        System.out.println(); //Перенос строки

        int max = a6[0]; //по умолчанию равно 1 элементу массива
        int min = a6[0]; //по умолчанию равно 1 элементу массива


        for (int i = 1; i < a6.length; i++) { //Можно начинать сравнение со 2 элемента массива, поэтому i=1
            max = (a6[i] > max) ? a6[i] : max;
            min = (a6[i] < min) ? a6[i] : min;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        //System.out.println(); //Перенос строки
        System.out.println("********************************");
        System.out.println();
        //-----------------Конец Задания №6------------------------


        System.out.println("********** ЗАДАНИЕ №7 **********");
        /**
         Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
         если в массиве есть место, в котором сумма левой и правой части массива равны.
         **Примеры:
         checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
         checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

         граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
         **/

        int[] a7 = new int[15]; //Инициализируем и зададим размер массива a[]
//        int[] b = {2, 2, 2, 1, 2, 2, 10, 1}; // [2, 2, 2, 1, 2, 2, ||| 10, 1]
//        int[] b = {1, 1, 1, 2, 1}; // [1, 1, 1, ||| 2, 1]
//        int[] b = {2, 2, 1, 0, 1, 0, 0, 2, 2, 0}; // [2, 2, 1, 0, ||| 1, 0, 0, 2, 2, 0]
        int[] b = {0, 0, 4, 0, 2, 1, 1, 1, 3, 2}; // [0, 0, 4, 0, 2, 1, |||  1,	1, 3, 2]
        int[] c = {4, 0, 2, 4, 4, 0, 1, 4, 4, 4, 2, 0, 4, 4, 1}; // [4, 0, 2, 4, 4, 0, 1, 4, ||| 4, 4, 2, 0, 4, 4, 1]

        for (int i = 0; i < a7.length; i++) {
            a7[i] = random.nextInt(6); //Заполним массив случайными числами от 0 до 5
        }
        System.out.println("Случайный массив a[] из " + a7.length + " элементов:");
        printArray(a7);//выведем массив a
        if (checkBalance(a7)) {
            System.out.println("в массиве a[] есть место, в котором сумма левой и правой части массива равны.");
        } else {
            System.out.println("в массиве a[] нет такого места");
        }
        System.out.println();//Перенос строки

        System.out.println("Статичный массив b[]:");
        printArray(b);//выведем массив b
        if (checkBalance(b)) {
            System.out.println("в массиве b[] есть место, в котором сумма левой и правой части массива равны.");
        }
        System.out.println();//Перенос строки

        System.out.println("Статичный массив c[]:");
        printArray(c);//выведем массив c
        if (checkBalance(c)) {
            System.out.println("в массиве c[] есть место, в котором сумма левой и правой части массива равны.");
        }

        //System.out.println(); //Перенос строки
        System.out.println("********************************");
        System.out.println();
        //-----------------Конец Задания №7------------------------


        System.out.println("********** ЗАДАНИЕ №8 **********");
        /**
         Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
         при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
         Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
         При каком n в какую сторону сдвиг можете выбирать сами.
         **/

        int[] a8 = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] a8 = {1, 5, 4 ,2 ,3 ,8};

        int n = -9; //Определим на сколько N элементов будем сдвигать

        printArray(a8); //Печатаем оригинальный массив
        System.out.println("n = " + n); // Напечатаем число N
//        shiftRightArray(a8);//Сдвигаем массив на 1 позицию вправо
//        shiftLeftArray(a8);//Сдвигаем массив на 1 позицию влево

        shiftArray(a8, n); //Сдвигаем массив на n позиций

        printArray(a8);//Печатаем преобразованный массив
        System.out.println("********************************");
        System.out.println();
        //-----------------Конец Задания №8------------------------

    }

        public static int[] fillArrayFor_5 ( int len, int initialValue){ // Метод для Задания №5
            //метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
            // каждая ячейка которого равна initialValue;
            int[] result = new int[len];
            for (int i = 0; i < len; i++) {
                result[i] = initialValue;
            }
            return result;

        }
        public static boolean checkBalance ( int[] a){
            boolean result = false;
            int sumLeft = 0; //Сумма левой части пока равна 0
            int sumRight = sumBalance(a);//Сумма правой части пока равна сумме всех элементов массива

            for (int i = 0; i < a.length; i++) {
                sumLeft += a[i]; //Прибавим к левой части массива текущий элемент
                sumRight -= a[i]; //Отнимем из правой части массива текущий элемент
                if (sumLeft == sumRight) {
                    result = true;
                    break;//Выходим из цикла
                }
            }
            return result;
        }
        public static int sumBalance ( int[] valueArray){ //Возвращает сумму элементов массива
            int result = 0;
            for (int i = 0; i < valueArray.length; i++) {
                result += valueArray[i];
            }
            return result;
        }
        public static void printArray ( int array[]){ //Выводит массив в консоль на печать
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }

        public static void shiftLeftArray (int[] array){ //Метод сдвигает элементы массива на 1 позицию влево.
            int tmp = array[0]; //Запоминаем 1й элемент массива
            for (int i = 0; i < (array.length - 1); i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = tmp; //Помещаем 1й элемент в конец массива
        }

        public static void shiftRightArray (int[] array){ //Метод сдвигает элементы массива на 1 позицию вправо.
            int tmp = array[array.length - 1]; //Запоминаем последний элемент массива
            for (int i = array.length - 1; i > 0; i--) { //Цикл от конца массива к началу с уменьшением i
                array[i] = array[i - 1];
            }
            array[0] = tmp; //Помещаем последний элемент в 1й массива
        }
    public static void shiftArray (int[] array, int n) { //Метод сдвигает элементы массива на n позиций
        int rem = n % array.length; //Вычислим рельное n сдвига, если n превышает длину массива
        rem = (Math.abs(rem) < array.length/2) ? rem : (array.length - Math.abs(rem)); //Найдем минимальное значение сдвига
            if (rem > 0) {
                for (int i = 0; i < rem; i++) shiftRightArray(array); //Сдвинем на n позиций вправо
                System.out.println("Двигали вправо " + rem + " раз");
            } else {
                for (int i = 0; i < Math.abs(rem); i++) shiftLeftArray(array); //Сдвинем на n позиций влево
                System.out.println("Двигали влево " + rem + " раз");
            }
    }



}

