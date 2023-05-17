
PECS - java generic
https://xephysis.tistory.com/21

//    public static double sumNumbersWithSuper(List<? super Number> list) {
//        double total = 0.0;
//        for (Number o : list) { --> 여기서부터 문제가 발생한다. o의 타입은 Number 가 아닐수도 있다. 
//            total += o.doubleValue();
//        }
//
//        return total;
//    }

*부모에 자식을 넣어야한다. Number가 최상위여아 for(Number o : list) 가 된다. 

..........................


// E 소비자 매개변수에 와일드 카드 적용
//빼서 dst에 넣으려면 dst에는 E이거나 E의 부모
public void popAll(Collection<? super E> dst) { 
    while(!isEmpty()) {
    dst.add(pop());
    }
}
// E 생산자 매개변수에 와일드 카드 적용
// src에서 빼서 넣으려면 E이거나 E의 자식
public void pushAll(Iterable<? extends E> src){
    for(E e : src) {
    push(e);
    }
}