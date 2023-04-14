package jm.study.book.effectivejava.Item2_2;

public class JmPizza extends Pizza{

    private final boolean chiessCrust;

    public static class Builder extends Pizza.Builder<JmPizza.Builder> {
        private boolean chiessCrust = false;

        public Builder chiessCrust() {
            chiessCrust = true;
            return this;
        }

        @Override
        public JmPizza build() {
            return new JmPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public JmPizza(Builder builder){
        super(builder);
        chiessCrust = builder.chiessCrust;
    }

    @Override
    public String toString() {
        return "JmPizza{" +
                "chiessCrust=" + chiessCrust +
                ", toppings=" + toppings +
                '}';
    }
}
