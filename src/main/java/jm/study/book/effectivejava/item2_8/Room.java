package jm.study.book.effectivejava.item2_8;
/*
import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();

    private static class State implements Runnable {
        int numJunkpiles;

        State(int numJunkpiles) {
            this.numJunkpiles = numJunkpiles;
        }

        @Override
        public void run() {
            System.out.println("방 청소");
            numJunkpiles = 0;
        }
    }
    private final State state;
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkpiles) {
        state = new State(numJunkpiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}

public class main {
    public static void main(String[] args) throws Exception {
        try (Room myRoom = new Room(7)) {
            System.out.println("안녕~");
        }
        new Room(99);
        System.out.println("아무렴~");
    }

 */