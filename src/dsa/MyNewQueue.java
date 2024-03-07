package dsa;

public class MyNewQueue {
    private String[] elements;
    private int numberOfElements;
    public MyNewQueue(int capacity){
        elements = new String[capacity];
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void add(String element) {
        if(numberOfElements == elements.length){
            throw new IllegalStateException("No space in MyNewQueue at the moment");
        }
        //if(numberOfElements !=)
        elements[numberOfElements] = element;
        ++numberOfElements;
    }

    public int getSize() {
        return numberOfElements;
    }

    public void remove(String element) {
        if(numberOfElements == 0){
            throw new NoSuchElementException("Element does not exist in MyQueue");
        }
        numberOfElements--;
    }
}
