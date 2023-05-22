package jm.study.book.디자인패턴.my.builder;

public class Boy{
    private String name;
    private String grade;
    private int age;
    private String univ;

    public Boy(String name, String grade, int age, String univ) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.univ = univ;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ", univ='" + univ + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private String grade;
        private int age;
        private String univ;

        public Builder(String univ) {
            this.univ = univ;
        }

        public Boy Build(){
            return new Boy(name, grade, age, univ);
        }

        public String getName() {
            return name;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public String getGrade() {
            return grade;
        }

        public Builder grade(String grade) {
            this.grade = grade;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public String getUniv() {
            return univ;
        }

        public Builder setUniv(String univ) {
            this.univ = univ;
            return this;
        }
    }
    public static void main(String[] args) {
        Builder builder = new Builder("홍익대");
        Boy boy =  builder.age(3).name("김종민").grade("A").Build();
        System.out.println("boy = " + boy);

        Boy boy1 = new Builder("고려대").age(3).name("김종민").grade("A").Build();
        System.out.println("boy1 = " + boy1);
        //        Boy boy = Boy.Builder.setName("홍길순").setAge(10).setGrade("A").Build();
    }
}

