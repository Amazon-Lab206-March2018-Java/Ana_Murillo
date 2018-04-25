import java.util.*;

public class GenericList {
    public static void main(String[] args) {
        GenericList lists = new GenericList();

        lists.exceptions();
    }

    public void exceptions() {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            } catch (ClassCastException e) {
                System.out.println("ERROR ON INDEX: " + i);
            }
        }
    }
}