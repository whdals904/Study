package jm.study.book.디자인패턴.my.builder;
class Student{
    private String name;
    private String grade;
    private int age;

    public Student(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                '}';
    }
}
class StudentBuilder{
    private String name;
    private String grade;
    private int age;

    public Student builder(){
        return new Student(this.name, this.grade, this.age);
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getGrade() {
        return grade;
    }

    public StudentBuilder setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;

    }
}

public class Main {

    public static void main(String[] args) {
        Student student = new Student("jongmin", "A", 40);
        System.out.println("student = " + student);
        StudentBuilder studentBuilder = new StudentBuilder();
        Student student1 = studentBuilder.setAge(10).setGrade("A").setName("김종윤").builder();
        System.out.println("student1 = " + student1);

    }

}
