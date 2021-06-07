public class HW1 {
    public static void main(String[] args) {
        printThreeWords();
        printThreeWords();


        int a = -11;
        int b = -100;

        printCheckSumSign(a, b); //Напечатаем сразу результат суммы

        //Сначала проверим, затем распечатаем
        if (checkSumSign(a, b) >= 0) {
            System.out.println("Сумма положительная");
        } else
        {
            System.out.println("Сумма отрицательная");
        }

        printColor(150); //Напечатаем цвет

        compareNumbers (a, b); // Сравним a и b и напечатаем результат
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void printCheckSumSign(int valueA, int valueB){
        if ((valueA + valueB) >= 0) {
            System.out.println("Сумма положительная");
        } else
            {
            System.out.println("Сумма отрицательная");
        }
    }

    public static int checkSumSign(int valueA, int valueB){
        return  (valueA + valueB);
    }

    public static void printColor(int valueColor){
        if (valueColor <= 0) {
            System.out.println("Красный");
        } else if ((valueColor > 0) && (valueColor <=100 )){
            System.out.println("Желтый");
        } else if (valueColor > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int valueA, int valueB){
        if (valueA >= valueB) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
