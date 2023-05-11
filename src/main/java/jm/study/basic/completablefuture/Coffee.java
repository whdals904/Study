package jm.study.basic.completablefuture;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
public class Coffee {
    private String name;
    private int price;
}
