package jm.study.program.jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Entity
@DiscriminatorValue("M")
@Getter
@Setter
public class Movie extends Item{
    private String director;
    private String actor;
}
