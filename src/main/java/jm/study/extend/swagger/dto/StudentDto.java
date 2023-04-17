package jm.study.extend.swagger.dto;

import jm.study.extend.swagger.entity.Student;

public class StudentDto {

    private Long seq;

    public String name;
    public int age;


    public StudentDto(){
        this.seq = -1L;
        this.name ="no name";
        this.age = -1;
    }
    public StudentDto(Student student){
        this.seq = student.getSeq();
        this.name = student.getName();
        this.age = student.getAge();
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
