package jm.study.book.designpattern.my.iterator;

import lombok.ToString;

abstract class Aggregate {
    public abstract Iterator iterator();
}

abstract class Iterator{

    public abstract boolean hasNext();
    public abstract Book next();
}

@ToString
class Book{
    private String name;

    public Book(String name) {
        this.name = name;
    }
}

class BookShelf extends Aggregate {
    Book[] bookAry = new Book[10];
    int lastIdx = 0;

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

class BookShelfIterator extends Iterator{

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
    public Book next() {
        return bs.getBook();
    }
}

public class IteratorMain {
    public static void main(String[] args) {
        System.out.println("Iterator Main Start !!!!!!!!!!!!!!!");
        
        BookShelf bs = new BookShelf();
        bs.addBook(new Book("한글"));
        bs.addBook(new Book("주해"));
        bs.addBook(new Book("주용"));
        Iterator bsIterator =  bs.iterator();
        while(bsIterator.hasNext()){
            System.out.println("bsIterator.next() = " + bsIterator.next());
        }
    }
}
