package jm.study.book.디자인패턴.my.iterator;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.*;

@ToString
@Getter
class Book{
    private String name;

    public Book(String name) {
        this.name = name;
    }

}

class BookShelf implements Aggregate {
    private final Book[] bookAry;
    int lastIdx = 0;

    public BookShelf(int maxLength) {
        this.bookAry = new Book[maxLength];
    }

    public void addBook(Book book){
        bookAry[lastIdx++] = book;
    }

    public Book getBook(){
        return bookAry[--lastIdx];
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

class BookShelfIterator implements Iterator{

    private BookShelf bs;
    public BookShelfIterator(BookShelf bookShelf) {
        bs = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (bs.lastIdx > 0){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return bs.getBook();
    }
}

public class IteratorMain {
    public static void main(String[] args) {
        System.out.println("Iterator Main Start !!!!!!!!!!!!!!!");
        
        BookShelf bs = new BookShelf(100);
        bs.addBook(new Book("논어"));
        bs.addBook(new Book("맹자"));
        bs.addBook(new Book("주해"));
        bs.addBook(new Book("주용"));
        Iterator bookIterator =  bs.iterator();

        List<Book> li = new ArrayList<>();
        li.add(new Book("논어"));
        li.add(new Book("맹자"));
        li.add(new Book("주해"));
        java.util.Iterator listIterator = li.iterator();

        while(bookIterator.hasNext()){
            //System.out.println("bsIterator.next() = " + (Book) bsIterator.next());
            Book b = (Book) bookIterator.next();
            System.out.println("b.getName() = " + b.getName());
        }
        while(listIterator.hasNext()){
            //System.out.println("bsIterator.next() = " + (Book) bsIterator.next());
            Book b = (Book) listIterator.next();
            System.out.println("b.getName() = " + b.getName());
        }

    }
}
