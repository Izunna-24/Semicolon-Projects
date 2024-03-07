package dsa;

public class MyNewSet {
    private int numberOfElements;

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void addElement(String element) {
        numberOfElements++;
    }
}
