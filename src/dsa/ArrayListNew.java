package dsa;

public class ArrayListNew {

    private int numberOfElements;
    private String[] elements = new String[5];

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void add(String element) {
        if (numberOfElements == elements.length){
            createNewArrayList();
        }
        elements[numberOfElements] = element;
        numberOfElements++;
    }

    public void remove(String gString) {
        if (numberOfElements == 0) throw new ArrayIndexOutOfBoundsException("List out of bounds!");
        numberOfElements--;
    }

    public String get(int index) {
        return elements[index - 1];
    }

    public int get(String element) {
        for (int index = 0; index < numberOfElements; index++) {
            if (elements[index].equals(element)) return index + 1;
        }
        return 0;
    }

    public void createNewArrayList() {
        String [] anotherArray = new String[elements.length * 2];
        for (int index = 0; index < elements.length; index++) {
             anotherArray[index] = elements[index];
        }
        elements = anotherArray;
    }

    public int size() {
        return numberOfElements;
    }
}
