package dsa;

import java.util.EmptyStackException;

public class MyStack {

    private int numberOfElements;
    private String[] elements;

    public MyStack(int capacity){
        elements = new String[capacity];
    }
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void push(String element) {
        if (numberOfElements == elements.length){
            throw new StackOverflowError("Stack is full");
        }
        elements[numberOfElements] = element;
        ++numberOfElements;
    }

    public String pop() {
        if (numberOfElements <= 0){
            throw new EmptyStackException();
        }
        String out = elements[numberOfElements - 1];
        --numberOfElements;
        return out;
    }

    public int size() {
        return  numberOfElements;
    }

    public String peek() {
        return elements[numberOfElements - 1];
    }

    public int search(String element) {
        for (int index = 0; index < numberOfElements; index++) {
            if (elements[index].equals(element)) {
                return numberOfElements - index;
            }
        }
        return -1;
    }
}
