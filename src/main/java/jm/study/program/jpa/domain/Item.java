package jm.study.program.jpa.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter
@Setter
public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    public Long id;

    private String name;
    public int price;
    public int stockQuantity;

    @ManyToMany(mappedBy = "items")
    public List<Category> categories = new ArrayList<Category>();
}
