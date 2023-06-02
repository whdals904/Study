package jm.study.basic.innerclass;

public class Main {
    private static Main main = new Main();
    private Main(){
        System.out.println("Main Constructor");
    }

    public static String name;
    static{
        name = "내 이름은 Main";
        System.out.println("Main Static Block ");
    }

    public static class StaticInnerClass{

        public int age;
        public static String name;

        public StaticInnerClass(int age) {
            this.age = age;
        }

        static{
            name = "내 이름은 StaticInnerClass";
            System.out.println("StaticInnerClass Static Block ");
        }
        public StaticInnerClass(){
            System.out.println("StaticInnerClass Constructor");
        }

        @Override
        public boolean equals(Object obj) {
            StaticInnerClass param = (StaticInnerClass) obj;
            if(this.age == param.age){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("=================Static Main Method Start !! ====================");
        System.out.println("Main.name = " + Main.name);
        StaticInnerClass sic1 = new Main.StaticInnerClass(1);
        StaticInnerClass sic2 = new Main.StaticInnerClass(2);
        System.out.println("StaticInnerClass.name = " + StaticInnerClass.name);
        System.out.println("sic1 = " + sic1);
        System.out.println("sic2 = " + sic2);
        System.out.println(sic1 == sic2);
        System.out.println(sic1.equals(sic2));
        System.out.println("=================Static Main Method end !! ====================");
    }
}
