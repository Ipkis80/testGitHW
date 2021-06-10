package Lesson01;

public class exercises {
    public static void main(String[] args) {

//        System.out.println(-11 % 6 );
//        System.out.println(15 % 4 );
//        System.out.println(-1 < -5 );
//        System.out.println(Math.abs(-5));
        int len = 6;
        int n = -17;
        int r = n % len;

        System.out.println("r = " + r);
        System.out.println("|n|= " + Math.abs(n));
        System.out.println("|r|= " + Math.abs(r));
        System.out.println("len - |r|= " + (len - Math.abs(r)));
        System.out.println(1 ^ 1);

    }
}
