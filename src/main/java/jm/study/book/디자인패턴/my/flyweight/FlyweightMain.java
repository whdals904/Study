package jm.study.book.디자인패턴.my.flyweight;

import java.util.HashMap;
import java.util.Map;



class Tree{
    public static int num;
    public int seq;
    public String color;


    public Tree(String color) {
        this.color = color;
        seq = num++;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "seq=" + seq +
                ", color='" + color + '\'' +
                '}';
    }
}

class TreeFactory{
    public Map<String, Tree> treeMap = new HashMap<>();

    public Tree getTree(String color){
       Tree tree = treeMap.get(color);
       if(tree == null){
           Tree tmp = new Tree(color);
           treeMap.put(color, tmp);
       }
       return treeMap.get(color);
    }
}

public class FlyweightMain {
    public static void main(String[] args) {
        TreeFactory tf = new TreeFactory();
        tf.getTree("초록");
        tf.getTree("빨강");
        tf.getTree("연두");
        tf.getTree("빨강");
        tf.getTree("초록");

        System.out.println("tf.treeMap = " + tf.treeMap);
    }
}
