package genericsActivity;

import java.util.ArrayList;

public class GenericMethods {
    // Generic method to print elements of an ArrayList
    public <T> void printArrayList(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();

        // ArrayLists of 4 different types
        ArrayList<Integer> intList = new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4));
        ArrayList<Double> doubleList = new ArrayList<>(java.util.Arrays.asList(1.1, 2.2, 3.3, 4.4));
        ArrayList<String> stringList = new ArrayList<>(java.util.Arrays.asList("one", "two", "three", "four"));
        ArrayList<Character> charList = new ArrayList<>(java.util.Arrays.asList('a', 'b', 'c', 'd'));

        // Using the generic method to print each ArrayList
        System.out.print("Integer ArrayList: ");
        genericMethods.printArrayList(intList);

        System.out.print("Double ArrayList: ");
        genericMethods.printArrayList(doubleList);

        System.out.print("String ArrayList: ");
        genericMethods.printArrayList(stringList);

        System.out.print("Character ArrayList: ");
        genericMethods.printArrayList(charList);
    }
}
