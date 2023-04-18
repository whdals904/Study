package jm.study.program.jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Entity
@DiscriminatorValue("B")
@Getter
@Setter
public class Book extends Item{
    private String Book;
    private String isbn;
}
