package jm.study.book.jpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jm.study.book.jpa.entity.BaseEntity;
import jm.study.book.jpa.entity.Member;
import jm.study.book.jpa.entity.Team;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class TeamDto{

    private String name;
    private List<Member> members;

    public TeamDto(Team t) {
        this.name = t.getName();
        this.members = t.getMembers();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
