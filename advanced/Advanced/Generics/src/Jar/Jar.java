package Jar;

import java.util.ArrayDeque;

// Generic parameter - очаква да бъде заменен с някакъв тип данни
public class Jar<T> { // T -> тип данни

    // при създаване на обкет от този клас, полетата се инициализират със стоност null
    private ArrayDeque<T> elements;

    public Jar() {

        // създавам един празен стек срещу това поле
        this.elements = new ArrayDeque<>();
    }

    public void add(T element) {
        this.elements.push(element);
    }

    public T remove() {
        return this.elements.pop();
    }

}
