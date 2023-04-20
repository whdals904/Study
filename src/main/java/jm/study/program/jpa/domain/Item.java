package jm.study.program.jpa.domain;


import jm.study.program.jpa.exceptions.NotEnoughStockException;
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

    //==비즈니스 로직==//
    public void addStock(int count){
        stockQuantity+= count;
    }
    public void removeStock(int count){
        if(stockQuantity - count >= 0){
            stockQuantity -= count;
        }else{
            throw new NotEnoughStockException("need more stock");
        }
    }
}
