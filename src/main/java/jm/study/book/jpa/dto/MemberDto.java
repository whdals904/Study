package jm.study.book.jpa.dto;

import jm.study.book.jpa.entity.BaseEntity;
import jm.study.book.jpa.entity.Member;
import jm.study.book.jpa.entity.Team;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@RequiredArgsConstructor
public class MemberDto extends BaseEntity {

    private String name;
    private int age;
    private String password;
    private String email;

    public MemberDto(Member m) {
        this.name = m.getName();
        this.age = m.getAge();
        this.password = m.getPassword();
        this.email = m.getEmail();
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}