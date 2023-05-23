package jm.study.book.디자인패턴.my.interpreter;

abstract class Expression{
    public abstract boolean interpreter(String context);
}

class TerminalExpression extends Expression{

    public final String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpreter(String context) {
        return context.contains(data);
    }
}

class OrExpression extends Expression{

    Expression expression1;
    Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(String context) {
        return expression1.interpreter(context) || expression2.interpreter(context);
    }
}

class AndExpression extends Expression{

    Expression expression1;
    Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(String context) {
        return expression1.interpreter(context) && expression2.interpreter(context);
    }
}

public class Main {

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpreter("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpreter("Married Julie"));
    }
}