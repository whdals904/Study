package jm.study.basic.math;

public class Main {
    public static void main(String[] args) {

        double value1 = 12.23;
        double value2 = 34.45;

// 기대값 : 46.68
        System.out.println(value1 + value2); // 46.68000000000001
        System.out.println( 12.23 + 34.45); // 46.68000000000001

        System.out.println(1.1 + 0.1);
        System.out.println(1.1 + 0.2);
        System.out.println(1.1 + 0.4);
        System.out.println(1.1 + 0.8);

        System.out.println(1.1F);
        System.out.println(1.2F);
        System.out.println(1.4F);
        System.out.println(1.8F);

        System.out.println(1.1 + 0.1 == 1.2);
        System.out.println(1.1F+ 0.1F);
        System.out.println(1.1F+ 0.1F == 1.2F);
        float a = 1.1f;
        float b = 0.1f;
        if(a + b > 1.2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
