package Homework1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TypedBoxArray<T> {
    private T[] array;


    public TypedBoxArray(T... array) {
        this.array = array;
    }

    public T[] swapIndex(int index1, int index2) throws ArrayIndexOutOfBoundsException {
        T object;
        object = array[index1];
        array[index1] = array[index2];
        array[index2] = object;
        System.out.println(Arrays.toString(array));
        return array;
    }

    public void swapValue( T value1, T value2) {

        List<T> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, array);
        if((myArrayList.contains(value1)) && (myArrayList.contains(value2))){
            T object;
            int index1;
            int index2;
            index1 = myArrayList.indexOf(value1);
            object = array[index1];
            index2 = myArrayList.indexOf(value2);
            array[index1]= array[index2];
            array[index2]= object;
            System.out.println(Arrays.toString(array));
        }
        else {
            System.out.println("В массиве нет элемента с таким значением");}

    }

    public List<T> arrayTransformInList() {
        List<T> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, array);
        return myArrayList;
    }

}
