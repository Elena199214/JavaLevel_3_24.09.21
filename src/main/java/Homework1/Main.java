package Homework1;

/**
 * 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
 * 2. Написать метод, который преобразует массив в ArrayList;
 */
public class Main {

    public static void main(String[] args) {
        TypedBoxArray<Integer> typedBoxArray1 = new TypedBoxArray<>(1,2,3,4,5);
        TypedBoxArray<String> typedBoxArray2 = new TypedBoxArray<>("a","b","c","d");

        typedBoxArray1.swapValue(2,5);

        try {
            typedBoxArray1.swapIndex(-1,4);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            typedBoxArray2.swapIndex(0,3);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("Array List: " + typedBoxArray2.arrayTransformInList());

    }



}

