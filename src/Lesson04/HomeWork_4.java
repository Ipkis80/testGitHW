package Lesson04;
import java.util.Random;
import java.util.Scanner;

/**Игра "крестики-нолики"
 *
 * Created by Kirill Ivushkin
 * Date: 11.06.2021
 */

public class HomeWork_4 {

    public static final int SIZE = 3; //размер поля
    public static final int dotsToWin = 3; //кол-во фишек в ряд для победы
    public static char[][] map; //Поле
    public static final char dotX = 'X';
    public static final char dotO = 'O';
    public static final char empty = '_';

    public static Scanner pencil = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap() { //Создадим поле
        map = new char[SIZE][SIZE];//Инициализируем массив поля
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = empty;
            }
        }
    }

    public static void printMap() { //Напечатаем поле
        System.out.print("   "); //рисуем пустой угол
        for (int i = 1; i <= map.length; i++) System.out.print(i + " "); //Печатаем шапку с номерами полей
        System.out.println(); //Перенос строки
        for (int i = 1; i <= map.length; i++) {
            System.out.print(i + " "); //Печатаем номер строки поля
            for (int j = 1; j <= map.length; j++) {
                System.out.print("|" + map[i - 1][j - 1] + "");
            }
            System.out.println("|");
        }
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Ваш ход. Введите координаты хода через пробел или клавишу 'Enter' : ");
            x = pencil.nextInt() - 1;
            y = pencil.nextInt() - 1;
        } while (!validXY(x,y) || !isEmpty(x,y));

        map[y][x] = dotX;
    }

    public static void pcTurn(){
        int x;
        int y;
        do {
            System.out.println("Ход PC. Введите координаты хода через пробел или клавишу 'Enter' : ");
            x = pencil.nextInt() - 1;
            y = pencil.nextInt() - 1;
        } while (!validXY(x,y) || !isEmpty(x,y));

        map[y][x] = dotO;

    }
    public static boolean win(char dots){
        for (int i = 0; i < SIZE; i++) {
             if (isRowDots(i, dots, dotsToWin) ||  isColumnDots(i, dots, dotsToWin)) return true;
        }
        if (isDiagonalsDots(dots, dotsToWin)) return true;

        return false; //По-умолчанию никто не победил (false)
    }

    public static boolean isRowDots (int y, char dots, int amount){ //Есть ли amount подряд и более  dots в ряду
        int n = 0; //n-количество  dots в ряду
        int n_max =0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][y] == dots) {
                n += 1;
            } else {
                n = 0;
            }
            n_max = (n > n_max) ? n : n_max;
        }
        return n_max >= amount;
        }
    public static boolean isColumnDots (int x, char dots, int amount){ //Есть ли amount подряд и более  dots в колонке
        int n = 0; //n-количество  dots в ряду
        int n_max =0;
        for (int i = 0; i < SIZE; i++) {
            if (map[x][i] == dots) {
                n += 1;
            } else {
                n = 0;
            }
            n_max = (n > n_max) ? n : n_max;
        }
        return n_max >= amount;
    }
    public static boolean isDiagonalsDots (char dots, int amount){ //Есть ли amount подряд и более  dots в диагоналях
        int n1 = 0; //n-количество  dots в ряду
        int n2 = 0; //n-количество  dots в ряду
        int n_max =0;
        for (int i = 0; i < SIZE-1; i++) {
            if (map[i+1][i] == dots) { //Посчитаем, сколько dots в диагонали [1:0]-[4:3]
                n1 += 1;
            } else {
                n1 = 0;
            }
            if (map[i][i+1] == dots) { //Посчитаем, сколько dots в диагонали [0:1]-[3:4]
                n2 += 1;
            } else {
                n2 = 0;
            }
            n_max = (n1 > n_max) ? n1 : n_max;
            n_max = (n2 > n_max) ? n2 : n_max;
        }
        n1 = 0;
        n2 = 0;
        for (int i = 0; i < SIZE; i++) {//Посчитаем, сколько dots в главных диагоналях
            if (map[i][i] == dots) {
                n1 += 1;
            } else {
                n1 = 0;
            }
            if (map[SIZE-i-1][i] == dots) {
                n2 += 1;
            } else {
                n2 = 0;
            }
            n_max = (n1 > n_max) ? n1 : n_max;
            n_max = (n2 > n_max) ? n2 : n_max;
        }

        return n_max >= amount;
    }

    public static boolean fullMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == empty) return false;
            }
        }
        return true;
    }

    public static boolean isEmpty (int x, int y){
        return (map[y][x] == empty);
    }
    public static boolean validXY(int x, int y){
        return ((x>=0 && y>=0) && (x < SIZE && y < SIZE));
    }


    public static void main(String[] args) {
        createMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (win(dotX)) {
                System.out.println("Победил игрок!");
                break;
            }
            if (fullMap()) {
                System.out.println("Поле заполнено, ходов больше нет");
                break;
            }

            pcTurn(); //Передаем ход компьютеру
            printMap();

            if (win(dotO)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (fullMap()) {
                System.out.println("Поле заполнено, ходов больше нет");
                break;
            }

        }


        System.out.println("Игра окончена.");
    }
}
