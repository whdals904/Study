package jm.study.book.effectivejava.item3_18;

import org.jetbrains.annotations.NotNull;

import java.util.*;



class ForwardingSet<E> implements Set<E> {

    private final Set<E> s;

    public ForwardingSet(Set<E> s) {
        this.s = s;
    }

    @Override
    public int size() {
        return s.size();
    }

    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return s.contains(o);
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return s.iterator();
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return s.toArray();
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        return s.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return s.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return s.remove(o);
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return s.containsAll(c);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> c) {
        return s.addAll(c);
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return s.retainAll(c);
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return s.removeAll(c);
    }

    @Override
    public void clear() {
        s.clear();
    }
}

class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
        System.out.println("addCount = " + addCount);
        return super.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }
}


public class Main {
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(Arrays.asList("원소1","원소2","원소3"));
        System.out.println("s.getAddCount() = " + s.getAddCount()); //문제발생

        InstrumentedSet<String> s1 = new InstrumentedSet<>(new HashSet<>());
        s1.addAll(Arrays.asList("틱", "탁탁", "펑"));
        System.out.println("s.getAddCount() = " + s1.getAddCount());

        InstrumentedSet<String> s2 = new InstrumentedSet<>(new TreeSet<>());
        s2.addAll(Arrays.asList("틱", "탁탁", "펑"));
        System.out.println("s.getAddCount() = " + s2.getAddCount());
    }
}
